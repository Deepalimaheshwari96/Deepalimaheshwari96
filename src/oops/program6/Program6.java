package oops.program6;

public class Program6 extends Max {

	@Override
	protected double max(double a, double b, double c, double d) {
		return super.max(a, b, c, d);
	}

	public <Double extends Comparable<Double>> Double maximum(Double n, Double m, Double l) {
		Double max = n; // assume x is initially the largest

		if (m.compareTo(max) > 0)
			max = m; // m is the largest so far

		if (l.compareTo(max) > 0)
			max = l; // l is the largest

		return max; // returns the largest object
	}

	public static void main(String[] args) {
		Program6 prog = new Program6();
		System.out.println(prog.max(22.53, 22.45, 22.34, 23.99));
		System.out.println(prog.maximum(54.34, 43.23, 32.23));
	}

}
