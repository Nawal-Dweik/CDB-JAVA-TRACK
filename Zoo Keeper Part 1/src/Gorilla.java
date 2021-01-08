
public class Gorilla extends Mammal {

	public int throwSomething() {
		System.out.println("Take this coconut on your head!");
		energyLevel = energyLevel - 5;
		return energyLevel;
	}

	public int eatBananas() {
		System.out.println("Banana is so yummy!");
		energyLevel = energyLevel + 10;
		return energyLevel;
	}

	public int climb() {
		System.out.println("What a tall tree! ooh..");
		energyLevel = energyLevel - 10;
		return energyLevel;
	}
}
