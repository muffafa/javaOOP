package librarySystem;
public class LibraryCard{
	private Student owner; 
	private int borrowCnt;

	public LibraryCard(){
	    borrowCnt = 0;
	}
	 
	public void checkOut(int numOfBooks){
	    
		if(borrowCnt+numOfBooks>0) {
		borrowCnt += numOfBooks;
		}else {
			System.out.println("Invalid request");
		}
	}

	public int getNumberOfBooks(){
	    return borrowCnt;
	}

	public String getOwnerName(){
	    return owner.getName();
	}

	public void setOwner(Student student){
	    owner = student;
	}

	public String toString( ){
	     String answer = "Owner name is "+ getOwnerName()+ " Number of books: " + getNumberOfBooks();
	     return answer;
	}
}
