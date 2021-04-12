package Week8;

public class StudentController {
	  
    public static void main(String[] args) 
    { 
    	Student[] roster = new Student[20];
    	
    	for(int i=0;i<20;i++) {
    		if (Math.random()>0.5) {
    			roster[i]= new GraduateStudent();
    		} else {
    			roster[i]= new UndergraduateStudent();
    		}
    		
    		int t;
    		
    		t= (int)(Math.random() * 51) + 50;
    		roster[i].setTestScore(1, t);
    		
    		t= (int)(Math.random() * 51) + 50;
    		roster[i].setTestScore(2, t);
    		
    		t= (int)(Math.random() * 51) + 50;
    		roster[i].setTestScore(3, t);
    	}


    	for(int i=0;i<20;i++) {
    		System.out.println((i+1)+". Student");
    		System.out.println(roster[i].getTestScore(1) + "-"+roster[i].getTestScore(2) + "-"+roster[i].getTestScore(3) + ":");
    		if ( roster[i] instanceof GraduateStudent) {
    			System.out.println("GraduateStudent : 80-" + roster[i].getGrade());
    		} else {
    			System.out.println("UndergraduateStudent : 70-"+ roster[i].getGrade());
    		}
    		roster[i].computeCourseGrade();
    		System.out.println(roster[i].getCourseGrade());
    	}
    } 
}
