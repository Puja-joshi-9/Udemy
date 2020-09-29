package oop;

public class Circle {

	double radius;

	public Circle(double radius) {
		this.radius = radius;
		if (radius < 0) {
			this.radius = 0;
		}

	}

	double getRadius() {

		return this.radius;
	}

	public double getArea() {
		return (Math.PI * radius * radius);
	}

	class Cylinder extends Circle {

		

		public Cylinder(double radius) {
			super(radius);
			// TODO Auto-generated constructor stub
		}

		double height;

		public double Cylinder(double radius, double height) {
			return height;

		}

	}

}
