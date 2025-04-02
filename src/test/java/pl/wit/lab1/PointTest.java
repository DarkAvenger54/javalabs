package pl.wit.lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {
	@Test
	void moveXTest() {
		//arrange
		Point p = new Point(4.15f, 9.17f);
		float step = 2.46f;
		//act
		p.moveX(step);
		//assert
		assertEquals(6.61f, p.getX());
	}
	@Test
	void moveYTest() 
	{
		//arrange
		Point p = new Point(4.15f, 9.17f);
		float step = 2.46f;
		//act
		p.moveY(step);
		//assert
		assertEquals(11.63f, p.getY());
	}
	@Test
	void addTest() 
	{
		//arrange
		Point p0 = new Point(4.15f, 9.17f);
		Point p1 = new Point(1.01f, 0.12f);
		
		Point p2 = new Point(1.02f, 0.13f);
		Point p3 = null;
		//act
		p0.add(p1);
		p2.add(p3);
		//assert
		//addtest
		assertEquals(5.16f, p0.getX());
		assertEquals(9.29f, p0.getY());
		//nulltest
		assertEquals(1.02f, p2.getX());
		assertEquals(0.13f, p2.getY());
	}
	@Test
	void substractTest() 
	{
		//arrange
		Point p0 = new Point(4.15f, 9.17f);
		Point p1 = new Point(1.01f, 0.12f);
				
		Point p2 = new Point(1.02f, 0.13f);
		Point p3 = null;
		//act
		p0.substract(p1);
		p2.substract(p3);
		//assert
		//substracttest
		assertEquals(3.14f, p0.getX());
		assertEquals(9.05f, p0.getY());
		//nulltest
		assertEquals(1.02f, p2.getX());
		assertEquals(0.13f, p2.getY());
	}
	@Test
	void addAndCreateTest() 
	{
		//arrange
		Point p0 = new Point(4.15f, 9.17f);
		Point p1 = new Point(1.01f, 0.12f);
				
		Point p2 = new Point(1.02f, 0.13f);
		Point p3 = null;
		//act
		Point pt1 = p0.addAndCreate(p1);
		Point pt2 = p2.addAndCreate(p3);
		//assert
		assertEquals(5.16f, pt1.getX());
		assertEquals(9.29f, pt1.getY());
		
		assertNull(pt2);
	}
}
