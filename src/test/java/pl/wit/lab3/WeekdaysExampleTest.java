package pl.wit.lab3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class WeekdaysExampleTest
{
    @Test
    public void checkWeekdays3PlTest()
    {
        Locale locale = new Locale("pl", "PL");
        Assertions.assertEquals("poniedziałek", EnWeekdays3.MONDAY.getWeekdayName(locale));
        Assertions.assertEquals("wtorek", EnWeekdays3.TUESDAY.getWeekdayName(locale));
        Assertions.assertEquals("środa", EnWeekdays3.WEDNESDAY.getWeekdayName(locale));
        Assertions.assertEquals("czwartek", EnWeekdays3.THURSDAY.getWeekdayName(locale));
        Assertions.assertEquals("piątek", EnWeekdays3.FRIDAY.getWeekdayName(locale));
        Assertions.assertEquals("sobota", EnWeekdays3.SATURDAY.getWeekdayName(locale));
        Assertions.assertEquals("niedziela", EnWeekdays3.SUNDAY.getWeekdayName(locale));
    }
    @Test
    public void checkWeekdays3PtTest()
    {
        Locale localePT = new Locale("pt", "PT");
        Assertions.assertEquals("segunda-feira", EnWeekdays3.MONDAY.getWeekdayName(localePT));
        Assertions.assertEquals("terça-feira", EnWeekdays3.TUESDAY.getWeekdayName(localePT));
        Assertions.assertEquals("quarta-feira", EnWeekdays3.WEDNESDAY.getWeekdayName(localePT));
        Assertions.assertEquals("quinta-feira", EnWeekdays3.THURSDAY.getWeekdayName(localePT));
        Assertions.assertEquals("sexta-feira", EnWeekdays3.FRIDAY.getWeekdayName(localePT));
        Assertions.assertEquals("sabado", EnWeekdays3.SATURDAY.getWeekdayName(localePT));
        Assertions.assertEquals("domingo", EnWeekdays3.SUNDAY.getWeekdayName(localePT));
    }
    @Test
    public void checkWeekdays3EnTest()
    {
        Locale localeEn = new Locale("en", "EN");
        Assertions.assertEquals("monday", EnWeekdays3.MONDAY.getWeekdayName(localeEn));
        Assertions.assertEquals("tuesday", EnWeekdays3.TUESDAY.getWeekdayName(localeEn));
        Assertions.assertEquals("wednesday", EnWeekdays3.WEDNESDAY.getWeekdayName(localeEn));
        Assertions.assertEquals("thursday", EnWeekdays3.THURSDAY.getWeekdayName(localeEn));
        Assertions.assertEquals("friday", EnWeekdays3.FRIDAY.getWeekdayName(localeEn));
        Assertions.assertEquals("saturday", EnWeekdays3.SATURDAY.getWeekdayName(localeEn));
        Assertions.assertEquals("sunday", EnWeekdays3.SUNDAY.getWeekdayName(localeEn));
    }
    @Test
    public void checkWeekdays2ByIdTest()
    {
        Assertions.assertSame(EnWeekdays2.MONDAY, EnWeekdays2.getById(2));
        Assertions.assertSame(EnWeekdays2.TUESDAY, EnWeekdays2.getById(3));
        Assertions.assertSame(EnWeekdays2.WEDNESDAY, EnWeekdays2.getById(4));
        Assertions.assertSame(EnWeekdays2.THURSDAY, EnWeekdays2.getById(5));
        Assertions.assertSame(EnWeekdays2.FRIDAY, EnWeekdays2.getById(6));
        Assertions.assertSame(EnWeekdays2.SATURDAY, EnWeekdays2.getById(7));
        Assertions.assertSame(EnWeekdays2.SUNDAY, EnWeekdays2.getById(1));
        Assertions.assertNull(EnWeekdays2.getById(9));
    }
}
