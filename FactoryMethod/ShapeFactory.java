package FactoryMethod;



public class ShapeFactory {
	private MyShape shape = null;

	public ShapeFactory() {
	};

	public Shape createShape(String shape) {
		if (shape.equals("Circle")) {
			this.shape = new Circle();
			return this.shape;
		} else if (shape.equals("Ellipse")) {
			this.shape = new Ellipse();
			return this.shape;
		} else if (shape.equals("Square")) {
			this.shape = new Square();
			return this.shape;
		} else if (shape.equals("Rectangle")) {
			this.shape = new Rectangle();
			return this.shape;
		} else if (shape.equals("LineSegment")) {
			this.shape = new LineSegment();
			return this.shape;
		} else if (shape.equals("Triangle")) {
			this.shape = new Triangle();
			return this.shape;
		} else {
			return null;
		}
	}
}
