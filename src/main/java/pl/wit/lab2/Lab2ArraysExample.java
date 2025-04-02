package pl.wit.lab2;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Lab2ArraysExample 
{
	/*
	 * Klasa z przykładami metod operującymi na tablicach
	 * */
	private int intNumbers[] = null;
	private String stringElements[] = null;
	private boolean boolElements[] = null;
	protected static final Logger log = LogManager.getLogger(Lab2ArraysExample.class.getName());
	
	//constructors
	private Lab2ArraysExample()
	{
		intNumbers = new int[0];
		stringElements = new String[0];
		boolElements = new boolean[0];
	}
	public Lab2ArraysExample(int intValue) 
	{
		this();
		intNumbers = Arrays.copyOf(intNumbers, 1);
		intNumbers[0] = intValue;
	}
	public Lab2ArraysExample(String stringValue) 
	{
		this();
		stringElements = Arrays.copyOf(stringElements, 1);
		stringElements[0] = stringValue;
	}
	public Lab2ArraysExample(boolean booleanValue) 
	{
		this();
		boolElements = Arrays.copyOf(boolElements, 1);
		boolElements[0] = booleanValue;
	}
	//methods
	public void printArraysToLog() {
		if (intNumbers != null) {
			for (int el : intNumbers)
				log.info("" + el + ", ");
		}
		if (stringElements != null) {
			for (String el : stringElements)
				log.info("" + el + ", ");
		}
		if (boolElements != null) {
			for (boolean el : boolElements)
				log.info("" + el + ", ");
		}
	}
	public void addElement(int element) 
	{
		intNumbers = Arrays.copyOf(intNumbers, intNumbers.length+1);
		intNumbers[intNumbers.length - 1] = element;
	}
	public void addElement(String element) 
	{
		stringElements = Arrays.copyOf(stringElements, stringElements.length+1);
		stringElements[stringElements.length - 1] = element;
	}
	public void addElement(boolean element) 
	{
		boolElements = Arrays.copyOf(boolElements, boolElements.length+1);
		boolElements[boolElements.length - 1] = element;
	}

	public int getIntArraySize() {
		if (intNumbers != null)
			return intNumbers.length;
		else
			return -1;
	}

	public int getStringArraySize() {
		if (stringElements != null)
			return stringElements.length;
		else
			return -1;
	}

	public int getBooleanArraySize() {
		if (boolElements != null)
			return boolElements.length;
		else
			return -1;
	}

	public int getIntArrayElement(int index) {
		if (intNumbers != null && index < intNumbers.length && index >= 0) {
			return intNumbers[index];
		} else {
			return -1;
		}
	}

	public String getStringArrayElement(int index) {
		if (stringElements != null && index < stringElements.length && index >= 0) {
			return stringElements[index];
		} else {
			return null;
		}
	}

	public boolean getBooleanArrayElement(int index) {
		if (boolElements != null && index < boolElements.length && index >= 0) {
			return boolElements[index];
		} else {
			return false;
		}
	}
	//getters
	public int[] getIntNumbers() {
		return intNumbers;
	}
	public String[] getStringElements() {
		return stringElements;
	}
	public boolean[] getBoolElements() {
		return boolElements;
	}
}
