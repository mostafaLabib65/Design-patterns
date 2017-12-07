package Prototype;

import java.awt.*;
import java.util.Map;

//An abstract class that implement the common methods between all shapes

public abstract class MyShape implements Shape, Cloneable{

	//common parameters between shapes
	private Point position = new Point(13, 12);
	private String name;
	private Color color = Color.black;
	private Color fillColor = color.white;
	
	@Override
	//common
	public void setPosition(Point position) {
		this.position = position;
	}

	@Override
	//common
	public Point getPosition() {
		return this.position;
	}

	@Override
	//common
	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	//common
	public Color getColor() {
		return this.color;
	}
	
	@Override
	//common
	public void setProperties(Map<String, Double> properties) {

	}

	@Override
	//common
	public Map<String, Double> getProperties() {
		return null;
	
	}

	@Override
	//common
	public void setFillColor(Color color) {
		this.fillColor = color;
		
	}

	@Override
	//common
	public Color getFillColor() {
		return this.fillColor;
	}
	
	@Override
	//not common
	public void draw(java.awt.Graphics canvas){
		
	}
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
