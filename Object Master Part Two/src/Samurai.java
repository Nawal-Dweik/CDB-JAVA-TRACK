
public class Samurai extends Human {
	public static int samuraisNumber = 0;

	public Samurai() {
		this.health = 200;
		samuraisNumber++;
	}

	public void deathBlow(Human human) {
		human.health = 0;
		this.health = this.health / 2;
	}

	public void meditate() {
		this.health = this.health + this.health / 2;
	}

	public static int howMany() {
		return samuraisNumber;
	}

}
