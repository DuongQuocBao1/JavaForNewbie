package tutorials.basic;

public class ReferenceAndValueTypes {
	public static void main(String[] args) {
		int x = 5;
		addOneTo(x);
		
		System.out.println(x);
		
		Person Bao;
		Bao = new Person("Bao");
		Bao.setAge(21);
		celebrateBirthday(Bao);
		System.out.println(Bao.getAge());
	}
	private static void celebrateBirthday(Person bao) {
		// TODO Auto-generated method stub
		bao.setAge(bao.getAge() + 1);
	}
	static void addOneTo(int number) {
		number = number + 1;
	}
}
