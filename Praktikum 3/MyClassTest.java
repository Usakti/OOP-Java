public class MyClassTest {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.setId("26390");
		myClass.setName("Budi");
		myClass.setAge(19);

		System.out.println("ID	: " + myClass.getId());
		System.out.println("Name: " + myClass.getName());
		System.out.println("Age : " + myClass.getAge());
	}
}