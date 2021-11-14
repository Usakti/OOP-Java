import java.util.Scanner;

public class latihan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ayam;
		System.out.println("Wildan tolong bawakan 2 ekor ayam dikandang");
		try {
			System.out.print("Jumlah ayam yang ingin dibawa: ");
			ayam = input.nextInt();
			input.close();
			if (ayam > 5) {
				throw new Exception("Terjadi kesalahan nih!");
			} else {
				System.out.println("Aman-aman saja");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
