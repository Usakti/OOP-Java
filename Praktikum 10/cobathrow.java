package Exception;

public class cobathrow {
	public static void main(String[]args) {
		try {
			throw new B();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}

class B  extends Exception {
	B() {}
	public String toString() {
		return "Objek dengan tipe Kelas B";
	}
}
