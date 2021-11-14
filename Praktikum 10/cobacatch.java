package Exception;

public class cobacatch {
	public static void main(String[]args) {
		try {
			int a = 1 / 0;
			System.out.println("Perintah Selanjutnya");
		}
		catch(NullPointerException e) {
		}
		catch(ArrayIndexOutOfBoundsException e) {
		}
		catch(Exception e) {
		}
	}
}
