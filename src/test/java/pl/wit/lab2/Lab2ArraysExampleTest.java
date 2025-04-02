package pl.wit.lab2;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lab2ArraysExampleTest 
{
	@Test
	public void addElementTest() 
	{
		Lab2ArraysExample arrEx = new Lab2ArraysExample(1);
		Assertions.assertArrayEquals(new int[] {1}, arrEx.getIntNumbers());
		arrEx.addElement(true);
		Assertions.assertEquals(Arrays.toString(new boolean[] {true}),
		Arrays.toString(arrEx.getBoolElements()));
		arrEx.addElement("Test");
		Assertions.assertArrayEquals(new String[] {"Test"},
		arrEx.getStringElements());
	}
	@Test
	public void getArraySizeTest() 
	{
		Lab2ArraysExample arrEx = new Lab2ArraysExample(1);
		Assertions.assertEquals(1, arrEx.getIntArraySize());
		
		arrEx.addElement(true);
		Assertions.assertEquals(1, arrEx.getBooleanArraySize());
		
		arrEx.addElement("Test");
		Assertions.assertEquals(1, arrEx.getStringArraySize());
	}
	@Test
	public void getArrayElementTest() 
	{
		Lab2ArraysExample arrEx = new Lab2ArraysExample(1);
		Assertions.assertEquals(1, arrEx.getIntArrayElement(0));
		
		arrEx.addElement(true);
		Assertions.assertEquals(true, arrEx.getBooleanArrayElement(0));
		
		arrEx.addElement("Test");
		Assertions.assertEquals("Test", arrEx.getStringArrayElement(0));
	}
	

}
