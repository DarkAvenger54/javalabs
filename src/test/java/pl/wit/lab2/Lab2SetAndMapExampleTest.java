package pl.wit.lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

public class Lab2SetAndMapExampleTest
{
    @Test
    public void printSetToLogTest()
    {
        Lab2SetAndMapExample cars = new Lab2SetAndMapExample();
        cars.setSetCars(new HashSet<>(Set.of("Ford", "Toyota")));
        cars.printSetToLog();
    }
    @Test
    public void printMapToLogTest()
    {
        Lab2SetAndMapExample cars = new Lab2SetAndMapExample();
        cars.setMapCarPower(new HashMap<>(Map.of("Ford", 250, "Toyota", 200)));
        cars.printMapToLog();
    }
    @Test
    public void addElementTest()
    {
        Lab2SetAndMapExample cars = new Lab2SetAndMapExample();
        cars.addElement("Toyota");
        cars.addElement("Ford", 250);
        Assertions.assertTrue(cars.getSetCars().contains("Toyota"));
        Assertions.assertEquals(250, cars.getMapCarPower().get("Ford"));
    }
    @Test
    public void getMapValueTest()
    {
        Lab2SetAndMapExample cars = new Lab2SetAndMapExample();
        cars.addElement("Ford", 250);
        int value = cars.getMapValue("Ford");
        Assertions.assertEquals(250, value);
    }
    @Test
    public void isSetContains()
    {
        Lab2SetAndMapExample cars = new Lab2SetAndMapExample();
        cars.addElement("Toyota");
        boolean result = cars.isSetContains("Toyota");
        Assertions.assertTrue(result);
    }
}
