package oops.program2;

public class Square implements Shape {

	private double vertex;
	

	public Square(double vertex) {
		this.vertex = vertex;
	}

	@Override
	public double area() {
		// Area = length * breadth
		return vertex * vertex;
	}
	
	public double printArea() {
		//Perimeter of a Square is 4 * a (side);
		return 4 * vertex;
	}

	@Override
	public String toString() {
		return "Area of a Square ABCD is " + area()+ " sqrm \nAnd print area of Square ABCD is " + printArea() + " m";
	}
}
