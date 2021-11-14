import java.util.Scanner;
import java.text.DecimalFormat;

public class jarak2titik
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int x1, y1, x2, y2;
		double hasil;

		System.out.print("Masukkan nilai x1: ");
		x1 = input.nextInt();

		System.out.print("Masukkan nilai y1: ");
		y1 = input.nextInt();

		System.out.print("Masukkan nilai x2: ");
		x2 = input.nextInt();

		System.out.print("Masukkan nilai y2: ");
		y2 = input.nextInt();

		hasil = Double.valueOf(Math.sqrt(((x2-x1)^2)+((y2-y1)^2)));

		DecimalFormat df = new DecimalFormat("#.##");

		System.out.print("Jarak kedua titik adalah "+(df.format(hasil)));
	}

}
