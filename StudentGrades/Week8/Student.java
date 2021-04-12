package Week8;

public class Student {
	protected final static int NUM_OF_TESTS = 3;
	protected String name;
	protected int[] test;
	protected String courseGrade;
	
	
	public Student( ) {
		this("No Name");
	}
	
	public Student(String studentName) {
		name = studentName;
		test = new int[NUM_OF_TESTS];
		courseGrade = "****";
	}
	
	public String getCourseGrade( ) {
		return courseGrade;
	}	
	
	
	public String getName( ) {
		return name;
	}
	
	public int getTestScore(int testNumber) {
		return test[testNumber-1];
	}
	
	public int getGrade() {
		int total = 0;
		for (int i = 0; i < NUM_OF_TESTS; i++) {
			total += test[i];
		}
		return total/NUM_OF_TESTS;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTestScore(int testNumber, int testScore) {
		test[testNumber-1] = testScore;
	}
	
	
	public void computeCourseGrade( ) {
		//do nothing - override this method in the subclass
	}
	
}
