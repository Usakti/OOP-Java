import java.util.Scanner;

public class contohArrayMultiDimensi {
	public static void main(String[] args) {

		// membuat Array dan Scanner
		String[][] meja = new String[2][3];
		Scanner scan = new Scanner(System.in);

		// mengisi setiap meja
		for(int bar = 0; bar < meja.length; bar++){
			for(int kol = 0; kol < meja[bar].length; kol++){
				System.out.print("Siapa yang akan duduk di meja ("+bar+","+kol+"): ");
				meja[bar][kol] = scan.nextLine();
			}
		}

		// menampilkan isi Array
		System.out.println("---------------------------------");
		for(int bar = 0; bar < meja.length; bar++){
			for(int kol = 0; kol < meja[bar].length; kol++){
				System.out.print("| "+meja[bar][kol]+" | \t");
			}
			System.out.println("");
		}
		System.out.println("---------------------------------");
	}
}
