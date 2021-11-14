package Exception;

public class cobatry {
	public static void main(String[]args) {
		try {
			int a = 1 / 0;
			System.out.println("Perintah Selanjutnya");
		}
		catch (Exception kesalahan) {
			System.err.println("Kesalahan");
		}
	}
}
