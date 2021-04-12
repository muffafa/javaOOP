package equations;

public class QuadraticEquation {
	// a^2x+bx+c=0
	private double a;
	private double b;
	private double c;

	public QuadraticEquation(double newA, double newB, double newC) {
		a = newA;
		b = newB;
		c = newC;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getDiscriminant() {
		return (b * b) - (4 * a * c);
	}

	public double getRoot1() {
		return ((-b - Math.sqrt(getDiscriminant())) / (2 * a));

	}

	public double getRoot2() {
		return ((-b + Math.sqrt(getDiscriminant())) / (2 * a));
	}
}