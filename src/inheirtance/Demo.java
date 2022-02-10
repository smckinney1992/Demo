package inheirtance;

interface Beverages {
	void prepareTea();

	default void mix() {
		System.out.println("Mix the bevarages properly");
	}

	static void ratings() {
		System.out.println("ratings for beverages");
	}
}

interface Games {
	void play();

	void pause();
}

interface ModernGames extends Games {
	void graphics();

	void animation();
}

abstract class Animal {
	int age;

	public abstract void eat();

	public void sleep() {
		System.out.println("Animal should sleep");
	}

}

class Men extends Animal implements Beverages, ModernGames {

	@Override
	public void prepareTea() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mix() {

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void graphics() {
		// TODO Auto-generated method stub

	}

	@Override
	public void animation() {
		// TODO Auto-generated method stub

	}

}

class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("Cat eats fish");

	}

}

public class Demo {

	public static void main(String[] args) {
		Men m = new Men();
		m.prepareTea();
		m.play();
		m.pause();
		m.graphics();
		m.animation();

		// Animal a = new Animal();
	}

}
