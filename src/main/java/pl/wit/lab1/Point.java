package pl.wit.lab1;

public class Point {
	private float x;
	private float y;
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void moveX(float step) 
	{
		this.x += step;
	}
	public void moveY(float step) 
	{
		this.y += step;
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public void add(Point p) 
	{
		if (p == null) {return; }
		moveX(p.getX());
		moveY(p.getY());
	}
	public void substract(Point p) 
	{
		if (p == null) {return; }
		moveX(-p.getX());
		moveY(-p.getY());
	}
	public Point addAndCreate(Point p) 
	{
		if (p == null) {return null; }
		Point pt = new Point(this.x, this.y);
		pt.add(p);
		return pt;
	}
	
}
