public class AbstractDemo {
	public static void main(String[] args) {
		Gaji g = new Gaji ("Mohd Mohthasim", "Ambheta, UP", 3,3600.00);
		Gaji k = new Gaji ("Jhon Adams", "Boston, MA", 2,2400.00);
		System.out.println("Memanggil mailCheck dengan menggunakan referensi Gaji --");
		g.mailCheck();
		System.out.println("\nMemanggil mailCheck dengan menggunakan referensi Karyawan --");
		k.mailCheck();
	}
}
