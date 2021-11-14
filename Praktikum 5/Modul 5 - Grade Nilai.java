import java.util.Scanner;

public class gradenilai {

		public static void main(String[] args) {
			String nama, nim;
			int nilai;
			Scanner masukan = new Scanner(System.in);
			System.out.print("Masukkan Nama: ");
			nama = masukan.nextLine();
			System.out.print("Masukkan NIM: ");
			nim = masukan.nextLine();
			System.out.print("Masukkan Nilai: ");
			nilai = masukan.nextInt();
			if(nilai > 80.00&& nilai <= 100.00) {
				System.out.print("\nAnda mendapat grade A dan bobot IPK 4.00");
			}
			else if(nilai > 77.00&& nilai <= 79.99) {
				System.out.print("\nAnda mendapat grade A- dan bobot IPK 3.75");
			}
			else if(nilai > 74.00&& nilai <= 76.99) {
				System.out.print("\nAnda mendapat grade B+ dan bobot IPK 3.50");
			}
			else if(nilai > 68.00&& nilai <= 73.99) {
				System.out.print("\nAnda mendapat grade B dan bobot IPK 3.00");
			}
			else if(nilai > 65.00&& nilai <= 67.99) {
				System.out.print("\nAnda mendapat grade B- dan bobot IPK 2.75");
			}
			else if(nilai > 62.00&& nilai <= 64.99) {
				System.out.print("\nAnda mendapat grade C+ dan bobot IPK 2.50");
			}
			else if(nilai > 56.00&& nilai <= 61.99) {
				System.out.print("\nAnda mendapat grade C dan bobot IPK 2.00");
			}
			else if(nilai > 45.00&& nilai <= 55.99) {
				System.out.print("\nAnda mendapat grade D dan bobot IPK 1.00");
			}
			else if(nilai <= 44.99) {
				System.out.print("\nAnda mendapat grade E dan bobot IPK 0.00");
			}
		}
}
