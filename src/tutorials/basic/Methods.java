package tutorials.basic;

public class Methods {
	public static void main(String[] args) {
		//B�i 1:
//		sayHelloWorld();
//		sayHelloWorld();
//		sayHelloWorld();
		
		//B�i 2:
//		sayHelloWorldTo("anh T�n");
		
		//B�i 3:
		int x = returnFive();
//		System.out.println(x);
		
		//B�i 4:
		int result = square(returnFive());
		System.out.println(result);
	}
	
	static void sayHelloWorld() {
		System.out.println("Hello, World!");
	}
	
	static void sayHelloWorldTo(String name) {
		System.out.println("Hello, "+name);
	}
	
	static int returnFive() {
		return 5;
	}
	
	static int square(int x) {
		return x * x;
	}
}
