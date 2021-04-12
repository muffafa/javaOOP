package week8;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		
		ArrayList<Cat> catList = new ArrayList<Cat>();
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		for (int i =0; i<=20; i++) {
			
			catList.add(new Cat());
			dogList.add(new Dog());
		}
		
		catList.get(3).sound();
		dogList.get(5).sound();
		
		dogList.get(1).setName("Tekir");
		dogList.get(1).setWeight(10);
		
		System.out.println(dogList.get(1).getName());
		System.out.println(dogList.get(1).getWeight());
		
		
	}
}
