package Prototype;

import FactoryMethod.MyShape;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;


public class Ellipse extends MyShape {
	private Map<String, Double> properties = new HashMap<>();
	public static final String X_KEY = "xAxis";
	public static final String Y_KEY = "yAxis";
	
	public Ellipse() {
		setColor(this.getColor());
		setPosition(this.getPosition());
		this.properties.put(X_KEY, 0.0);
		this.properties.put(Y_KEY, 0.0);
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
		double x = getProperties().get(X_KEY);
		double y = getProperties().get(Y_KEY);
		g2.setColor(getColor());
		g2.drawOval(position.x, position.y, (int)x, (int)y);
		g2.setColor(getFillColor());
		g2.fillOval(position.x, position.y, (int)x, (int)y);
		
	}
}
