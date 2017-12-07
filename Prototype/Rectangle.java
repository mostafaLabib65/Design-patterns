package Prototype;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;


public class Rectangle extends MyShape {
	private Map<String, Double> properties = new HashMap<>();
	public static final String LENGTH_KEY = "xAxis";
	public static final String WIDTH_KEY = "yAxis";
	
	public Rectangle() {
		setColor(this.getColor());
		setPosition(this.getPosition());
		this.properties.put(LENGTH_KEY, 0.0);
		this.properties.put(WIDTH_KEY, 0.0);
		setProperties(this.properties);
		setFillColor(this.getFillColor());
	}
	@Override
	//common
	public void setProperties(Map<String, Double> properties) {
		this.properties = properties;
	}

	@Override
	//common
	public Map<String, Double> getProperties() {
		return this.properties;
	
	}
	
	@Override
	public void draw(Graphics canvas) {
		Graphics2D g2 = (Graphics2D) canvas;
		g2.setStroke(new BasicStroke(6.0f));
		Point position = getPosition();
		double length = getProperties().get(LENGTH_KEY);
		double width = getProperties().get(WIDTH_KEY);
		g2.setColor(getColor());
		g2.drawRect(position.x, position.y, (int)width, (int)length);
		g2.setColor(getFillColor());
		g2.fillRect(position.x, position.y, (int)width, (int)length);
	}
}
