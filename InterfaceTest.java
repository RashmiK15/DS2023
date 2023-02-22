
public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat = new Cat();
		Human human = new Human();
		
		PlayGround playground = new PlayGround();
		
		playground.PlayingWithCat(cat, human);
	}

}

interface Sleeping{
	void sleep();
}
interface Eating{
	void eat();
}
interface Fearing{
	void fear();
}
interface Reproducing{
	void reproduce();
}

interface Meowing{
	
	void meow();
}

interface Thinking{
	
	void think();
}

interface Playing{
	
	void play();
}

class Mammal implements Sleeping, Eating, Fearing, Reproducing{
	
	
	public void sleep() {
		System.out.println("Animal is sleeping..");
	}
	public void eat() {
		System.out.println("Animal is eating..");
	}
	public void fear() {
		System.out.println("Animal is fearing..");
	}
	public void reproduce() {
		System.out.println("Animal is reproducing..");
	}
}

class Cat extends Mammal implements Playing, Meowing{
	
	public void meow() {
		System.out.println("Cat is meowing..");
	}
	public void play() {
		System.out.println("Cat is playing..");
	}
}

class Human extends Mammal implements Playing, Thinking{
	
	public void play() {
		System.out.println("Human is playing..");
	}
	public void think() {
		System.out.println("Human is thinking..");
	}
}

class PlayGround{
	
	void PlayingWithCat(Cat cat, Human human) {
		
		System.out.println("Playing with Cat");
		cat.meow();
		human.think();
		cat.play();
		human.play();
		cat.sleep();
	}
}