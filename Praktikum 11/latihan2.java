class KelasAsing {
	static void apaanNi() throws ClassNotFoundException {
		System.out.println("Ada yang error nih!");
		throw new ClassNotFoundException ("Udah saya tangkap");
	}
}

public class latihan2 {
	public static void main(String[] args) {
		try {
			KelasAsing.apaanNi();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
