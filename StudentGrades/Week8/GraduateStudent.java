package Week8;

class GraduateStudent extends Student {
	public void computeCourseGrade() {
		int total = 0;
		for (int i = 0; i < NUM_OF_TESTS; i++) {
			total += test[i];
		}
		if (total/NUM_OF_TESTS >= 80) {
			courseGrade = "Pass";
		} else {
			courseGrade = "No Pass";
		}
	}
}
