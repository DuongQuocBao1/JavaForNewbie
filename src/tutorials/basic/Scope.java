package tutorials.basic;

public class Scope {
	//Because x is declared outside of any method, it is in scope to all methods, in other words
	//any method can access x
		static int x; //declaring the variable x
		static int y; //declaring the variable y
	public static void main(String[] args) {
		int x = 1; //assigning a value to x
		int y = 5; //assigning a value to y
		System.out.println(x);
		doSomething();
		System.out.println(x);
		doSomethingLocally();
		System.out.println(y);
	}
	static void doSomething() {
		x = 10;
	}
	static void doSomethingLocally() {
		//because y is declared inside of this method, it is local to this method, in other words
		//no other method has access to y
		int y = 50; //declaring and initializing the variable y
	}
}
