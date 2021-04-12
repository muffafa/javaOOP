package week8;

public class Pet {
	private String name;
	private int weight;
	
	public Pet() {
		this("null",0);
	}
	
	public Pet(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
