package oops.program5;

public class DClass extends CClass {
	
	public DClass() {
		super();
	}
	
	@Override
	void div(int a, int b) {
		System.out.println("The Division is :"+(a*b));
	}

	public static void main(String[] args) {
		DClass d = new DClass();
	
		d.div(10, 2);
		d.mul(24, 32);
		d.sub(32, 23);
		d.sum(43, 34);
	}

}
