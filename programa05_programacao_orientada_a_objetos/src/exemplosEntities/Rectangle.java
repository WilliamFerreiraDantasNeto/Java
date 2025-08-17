package exemplosEntities;

public class Rectangle {
	public double width, height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (width + height) * 2;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height,2));
	}
	
	public String toString() {
		return String.format("Area = %.2f%n", area())
		+ String.format("Perimeter = %.2f%n", perimeter())
		+ String.format("Diagonal = %.2f%n", diagonal());
	}
}
