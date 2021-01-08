
public class Ninja extends Human{
public Ninja() {
	this.stealth = 10;
}
public void steal(Human human) {
	human.health = human.health - this.stealth;
	this.health = this.health + this.stealth;
}

public void runAway() {
	this.health = this.health - 10;
}
}
