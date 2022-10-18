
public class Test {

	public static void main(String[] args) {
		
		DynamicArray bob = new DynamicArray();
		
		bob.add(10);
		bob.add(9);
		bob.add(8);
		
		System.out.println(bob);
		System.out.println("");

		bob.removeAt(0);
		System.out.println(bob);
		
	}

}
