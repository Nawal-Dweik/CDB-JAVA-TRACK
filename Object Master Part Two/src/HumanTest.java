
public class HumanTest {

public static void main(String[] args) {
	Human attacker = new Human();
	Human attacked = new Human();
	
	attacker.attack(attacked);
	System.out.println("Attacker health is "+attacker.health);
	System.out.println("Attacked health is "+attacked.health);
	
}
}
