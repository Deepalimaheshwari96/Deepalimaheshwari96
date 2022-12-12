package oops.program2;


public class Program2 {

	public static void main(String[] args) {
		// Square Area & print Area
		Square square = new Square(10.89);
		System.out.println(square.toString() + "\n");
		// Rectangle Area & print Area
		Rectangle rectangle = new Rectangle(25.12, 30.12);
		System.out.println(rectangle.toString() + "\n");
		// Triangle Area & print Area
		Triangle triangle = new Triangle(15.20, 20.20, 25.20);
		System.out.println(triangle.toString());
	}

}
