
public class Bat extends Mammal {
	public Bat() {
		energyLevel = 300;
	}

	public int fly() {
		System.out.println("Bat's sound");
		energyLevel = energyLevel - 50;
		return energyLevel;
	}

	public int eatHumans() {
		System.out.println("So well!");
		energyLevel = energyLevel + 25;
		return energyLevel;
	}

	public int attackTown() {
		System.out.println("Town attacked");
		energyLevel = energyLevel - 100;
		return energyLevel;
	}

}
