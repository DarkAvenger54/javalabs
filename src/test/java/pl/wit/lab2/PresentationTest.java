package pl.wit.lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PresentationTest
{

    @Test
    void getFullNameTest()
    {
        //arrange
        Presentation willSmith = new Presentation("Will", "Smith", (byte) 25, (byte) 9, (short) 1968);
        //act
        String fullname = willSmith.getFullName();
        //assert
        Assertions.assertEquals("Will Smith", fullname);
    }
    @Test
    void getBirthdayDateAsStringTest1()
    {
        //arrange
        Presentation tylerDurden = new Presentation("Tyler", "Durden", (byte) 1, (byte) 1, (short) 1999);
        //act
        String birthdayDate = tylerDurden.getBirthdayDateAsString();
        //assert
        Assertions.assertEquals("01.01.1999", birthdayDate);
    }
    @Test
    void getBirthdayDateAsStringTest2()
    {
        //arrange
        Presentation willSmith = new Presentation("Will", "Smith", (byte) 25, (byte) 9, (short) 1968);
        //act
        String birthdayDate = willSmith.getBirthdayDateAsString();
        //assert
        Assertions.assertEquals("25.09.1968", birthdayDate);
    }
    @Test
    void getAgeTest()
    {
        //arrange
        Presentation willSmith = new Presentation("Will", "Smith", (byte) 25, (byte) 9, (short) 1968);
        //act
        byte years = willSmith.getAge();
        //assert, must work until 25.09.2025
        Assertions.assertEquals((byte) 56, years);
    }
    @Test
    void addNewVisitedPlaceTest()
    {
        //arrange
        Presentation willSmith = new Presentation("Will", "Smith", (byte) 25, (byte) 9, (short) 1968);
        willSmith.setVisitedPlaces(new String[]{"Warsaw", "Los Angeles"});
        Presentation tylerDurden = new Presentation("Tyler", "Durden", (byte) 1, (byte) 1, (short) 1999);
        //act
        willSmith.addNewVisitedPlace("New York");
        tylerDurden.addNewVisitedPlace("New York");
        Assertions.assertArrayEquals(new String[]{"Warsaw", "Los Angeles", "New York"}, willSmith.getVisitedPlaces());
        Assertions.assertArrayEquals(new String[]{"New York"}, tylerDurden.getVisitedPlaces());
    }
    @Test
    void getPresentationStoryTest1()
    {
        Presentation willSmith = new Presentation("Will", "Smith", (byte) 25, (byte) 9, (short) 1968);
        willSmith.setVisitedPlaces(new String[]{"Warsaw", "Los Angeles"});
        willSmith.setFacebookFriendsQuantity((short)100);
        willSmith.setPlaceOfBirth("New York");
        String story = willSmith.getPresentationStory();
        System.out.println(story);
        Assertions.assertEquals("Full name: Will Smith Age: 56 Adult Born: 25.09.1968 in New York Visited places: Warsaw Los Angeles Facebook friends: 100 Big amount of friends", story);
    }
    @Test
    void getPresentationStoryTest2()
    {
        Presentation tylerDurden = new Presentation("Tyler", "Durden", (byte) 1, (byte) 1, (short) 1999);
        tylerDurden.setPlaceOfBirth("New York");
        tylerDurden.setFacebookFriendsQuantity((short) 200);
        tylerDurden.setVisitedPlaces(new String[]{"Atlanta", "Detroit"});
        String story = tylerDurden.getPresentationStory();
        System.out.println(story);
        Assertions.assertEquals("Full name: Tyler Durden Age: 26 Adult Born: 01.01.1999 in New York Visited places: Atlanta Detroit Facebook friends: 200 Medium amount of friends", story);
    }
}
