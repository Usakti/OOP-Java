package Exception;

public class cobafinally {
	public static void main(String[]args) {
		try {
			int a = 1/0;
		}
		catch (Exception e) {
			System.out.println("Ada Kesalahan Muncul");
		}
		finally {
			System.out.println("Terima Kasih Telah Menjalankan Program");
		}
	}
}
