package tutorials.basic;

public class Methods {
	public static void main(String[] args) {
		//Bài 1:
//		sayHelloWorld();
//		sayHelloWorld();
//		sayHelloWorld();
		
		//Bài 2:
//		sayHelloWorldTo("anh Tân");
		
		//Bài 3:
		int x = returnFive();
//		System.out.println(x);
		
		//Bài 4:
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
