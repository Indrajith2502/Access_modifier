package access_modifiers;

public class Animal  extends Bird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		// System.out.println(a.b); private varaibles can not be used in other class
		System.out.println(a.s);
		System.out.println(a.d);
		System.out.println(a.c);
		
		a.peacock();
	}

}
