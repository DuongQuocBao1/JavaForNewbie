package tutorials.basic;
import javax.swing.JLabel;

public class ClassesAndObjects {
	public static void main(String[] args) {	
		
		Person aTan1 = new Person("aTan1");
		aTan1.setAge(25);
		Person aTan2 = new Person("aTan2");
		aTan2.setAge(30);
		
		aTan1.sayHelloTo(aTan2);
		
		System.out.println("Anh Tan 1 duoc "+aTan1.age+" tuoi roi");
		System.out.println("Con anh Tan 2 toi "+aTan2.age+" tuoi lan");
	}
}
