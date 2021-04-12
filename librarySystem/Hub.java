package librarySystem;
public class Hub {
	public static void main(String[] args) {
	    
	    Student student1 = new Student();
	    
	    student1.setName("Muhammed Mustafa Savar");
	    student1.setEmail("mm.savar@gmail.com");

	    LibraryCard libraryCard1 = new LibraryCard();

	    libraryCard1.setOwner(student1);
	    
	    libraryCard1.checkOut(6);
	    libraryCard1.checkOut(-2);
	    libraryCard1.checkOut(-10); //Invalid operation
	    

	    System.out.println(libraryCard1.toString());
	    //System.out.println(student1.getName());   
	    
	}
}
