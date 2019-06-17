package ua.lviv.lgs;

public class Pet {

	@PetInfo("This is pet's type")
	private String type;
	@PetInfo("This is pet's name")
	private String name;
	private int weight;
	private int height;

	public Pet(String type, String name, int weight, int height) {
		super();
		this.type = type;
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Pet [type=" + type + ", name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}

}
