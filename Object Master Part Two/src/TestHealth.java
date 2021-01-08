
public class TestHealth {
public static void main(String[] args) {
	Human human = new Human();
	Ninja ninja = new Ninja();
	Wizard wizard = new Wizard();
	Samurai samurai1 = new Samurai();
	Samurai samurai2 = new Samurai();
	Samurai samurai3 = new Samurai();
	
	System.out.println("human health before the game "+human.health);
	System.out.println("wizard health before the game "+wizard.health);
	System.out.println("ninja health before the game "+ninja.health);
	System.out.println("samurai1 health before the game "+samurai1.health);
	System.out.println("samurai2 health before the game "+samurai2.health);
	System.out.println("samurai3 health before the game "+samurai3.health);
	
	ninja.steal(human);
	ninja.runAway();
	
	wizard.fireBall(human);
	wizard.heal(human);
	
	samurai1.deathBlow(human);
	samurai1.meditate();
	
	System.out.println("Number of current Samurais is "+Samurai.howMany());
	
	System.out.println("human health after the game "+human.health);
	System.out.println("wizard health after the game "+wizard.health);
	System.out.println("ninja health after the game "+ninja.health);
	System.out.println("samurai1 health after the game "+samurai1.health);
	System.out.println("samurai2 health after the game "+samurai2.health);
	System.out.println("samurai3 health after the game "+samurai3.health);
	
	
	
	
}
}
