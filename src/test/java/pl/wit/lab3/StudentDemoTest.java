package pl.wit.lab3;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class StudentDemoTest
{
    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
        LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
        Configuration config = ctx.getConfiguration();
        LoggerConfig loggerConfig = config.getLoggerConfig(LogManager.ROOT_LOGGER_NAME);
        loggerConfig.setLevel(Level.TRACE);
        ctx.updateLoggers();
    }
    @Test
    public void  addPointsTest() throws PersonException
    {
        StudentDemo student = new StudentDemo("John", "Doe");
        student.addPoints("Homework", (byte) 8);
        student.addPoints("Exam", (byte) 15);
        student.addPoints("Attendance", (byte) 10);
        Map<String, Byte> points = student.getMapPoints();
        Assertions.assertTrue(points.containsKey("Homework"));
        Assertions.assertTrue(points.containsKey("Exam"));
        Assertions.assertTrue(points.containsKey("Attendance"));
        Assertions.assertEquals(Byte.valueOf((byte) 8), points.get("Homework"));
        Assertions.assertEquals(Byte.valueOf((byte) 15), points.get("Exam"));
        Assertions.assertEquals(Byte.valueOf((byte) 10), points.get("Attendance"));
    }
    @Test
    public void addPointsTestWrongMark() throws PersonException
    {
        StudentDemo student = new StudentDemo("John", "Doe");
        Assertions.assertThrows(PersonException.class, () -> student.addPoints("Homework", (byte) -1));
    }
    @Test
    public void addPointsTestWrongName()
    {
        StudentDemo student = new StudentDemo("John", "Doe");
        Assertions.assertThrows(PersonException.class, () -> student.addPoints("", (byte) 8));
        Assertions.assertThrows(PersonException.class, () -> student.addPoints(null, (byte) 8));
    }
    @Test
    public void getPersonTypeTest () {
        StudentDemo student = new StudentDemo("John", "Doe");
        EnPersonType result = student.getPersonType();
        Assertions.assertEquals(EnPersonType.student, result);
    }
}
