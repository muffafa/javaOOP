package equations;

import java.util.Scanner;

class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		QuadraticEquation equation;

		do {
			System.out.println("---------------------");
			
			System.out.println("Enter a for equation");
			double a = in.nextDouble();
			System.out.println("Enter b for equation");
			double b = in.nextDouble();
			System.out.println("Enter c for equation");
			double c = in.nextDouble();
			equation = new QuadraticEquation(a, b, c);

			printRoots(equation);
			
			System.out.printf("%nDo you want to continue?%n");
			
		} while (isContinue());

		System.out.println("---------------------");
		System.out.println("Program Finished");

	}

	private static void printRoots(QuadraticEquation equation) {
		double discriminant = equation.getDiscriminant();
		if (discriminant < 0) {
			System.out.printf("%nThe equation has no roots%n");
		} else if (discriminant == 0) {
			System.out.printf("%nThe root is %f%n ",equation.getRoot1());
		} else // (discriminant > 0)
		{
			System.out.printf("%nThe roots are %f and %f%n",equation.getRoot1(),equation.getRoot2());
		}
	}

	public static boolean isContinue() {	
		System.out.printf("Press 1: Yes%nPress -1: Exit%n");
		int value = in.nextInt();
		if(value ==1) {
			return true;
		}else if(value == -1) {
			return false;
		}else{
			System.out.printf("%n%d is invalid%n%n",value);
			return isContinue();
		}
	}
}