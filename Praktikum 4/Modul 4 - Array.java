import java.util.Scanner;

public class contohInputKeArray {
	public static void main(String[] args) {

		// membuat array buah-buahan
		String[]nama = new String[5];

		// membuat scanner
		Scanner scan = new Scanner(System.in);

		// mengisi data ke array
		for(int i = 0; i < nama.length; i++){
			System.out.print ("Nama ke-" + i + ": ");
			nama[i] = scan.nextLine();
		}

		System.out.println("----------------------------");

		// menampilkan semua isi array
		for(String b : nama){
			System.out.println (b);
		}
	}
} 
