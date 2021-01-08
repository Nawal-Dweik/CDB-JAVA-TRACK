
public class Wizard extends Human{
public Wizard() {
	health = 50;
	intelligence = 8;
}
public void heal(Human human){
	human.health = human.health + this.intelligence;
}
public void fireBall(Human human){
	human.health = human.health - 3*this.intelligence;
}
}
