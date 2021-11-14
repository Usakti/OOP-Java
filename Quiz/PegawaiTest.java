import java.util.Scanner;

public class PegawaiTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Pegawai pegawai = new Pegawai();
		Pegawai pegawai1 = new Pegawai();
		PegawaiHonorer pegawaih = new PegawaiHonorer();
		PegawaiTetap pegawait = new PegawaiTetap();
		
		System.out.print("Masukkan Nomor Pegawai: ");
		pegawai.setNopeg(scan.nextLine());
		System.out.print("Masukkan Nama Pegawai: ");
		pegawai.setNama(scan.nextLine());
		System.out.print("Masukkan Alamat: ");
		pegawai.setAlamat(scan.next());
		System.out.print("Masukkan Umur: ");
		pegawai.setUmur(scan.nextInt());
		scan.nextLine();
		System.out.print("Masukkan Jenis Kelamin(L/P): ");
		pegawai.setKelamin(scan.nextLine());
		System.out.print("Masukkan Nomor Telepon: ");
		pegawai.setNomortp(scan.nextLine());
		System.out.print("Masukkan Email: ");
		pegawai.setEmail(scan.nextLine());
		System.out.print("Masukkan Golongan Darah (A/B/AB/O): ");
		pegawai.setGoldar(scan.nextLine());
		System.out.print("Masukkan Tempat Lahir: ");
		pegawai.setTempatlahir(scan.nextLine());
		System.out.print("Masukkan Tanggal Lahir (DD-MM-YYYY): ");
		pegawai.setTgllahir(scan.nextLine());
		System.out.print("Masukkan Status Pernikahan (Menikah/Lajang): ");
		pegawai.setStatus(scan.nextLine());
		System.out.print("Masukkan Hobi Pertama: ");
		pegawai.isiHobi(1, scan.nextLine());
		System.out.print("Masukkan Hobi Kedua: ");
		pegawai.isiHobi(2, scan.nextLine());
		System.out.print("Masukkan Hobi Ketiga: ");
		pegawai.isiHobi(3, scan.nextLine());
		System.out.print("Masukkan Pendidikan Terakhir(SD/SMP/SMA/D3/D4/S1/S2/S3): ");
		pegawai.setPendidikan(scan.nextLine());
		System.out.print("Masukkan Bagian (Keuangan/Marketing/Gudang/Personalia/Penjualan/Kasir): ");
		pegawai.setBagian(scan.nextLine());
		System.out.print("Masukkan Jenis Pegawai (Honorer/Pegawai): ");
		String jenispeg = scan.nextLine();
		pegawai.setJenispeg(jenispeg);
		pegawai.generateGaji(jenispeg);
		System.out.println("");
		pegawai.Display();
		pegawaih.Display();
		
		System.out.println("");
		
		System.out.print("Masukkan Nomor Pegawai: ");
		pegawai1.setNopeg(scan.nextLine());
		System.out.print("Masukkan Nama Pegawai: ");
		pegawai1.setNama(scan.nextLine());
		System.out.print("Masukkan Alamat: ");
		pegawai1.setAlamat(scan.next());
		System.out.print("Masukkan Umur: ");
		pegawai1.setUmur(scan.nextInt());
		scan.nextLine();
		System.out.print("Masukkan Jenis Kelamin(L/P): ");
		pegawai1.setKelamin(scan.nextLine());
		System.out.print("Masukkan Nomor Telepon: ");
		pegawai1.setNomortp(scan.nextLine());
		System.out.print("Masukkan Email: ");
		pegawai1.setEmail(scan.nextLine());
		System.out.print("Masukkan Golongan Darah (A/B/AB/O): ");
		pegawai1.setGoldar(scan.nextLine());
		System.out.print("Masukkan Tempat Lahir: ");
		pegawai1.setTempatlahir(scan.nextLine());
		System.out.print("Masukkan Tanggal Lahir (DD-MM-YYYY): ");
		pegawai1.setTgllahir(scan.nextLine());
		System.out.print("Masukkan Status Pernikahan (Menikah/Lajang): ");
		pegawai1.setStatus(scan.nextLine());
		System.out.print("Masukkan Hobi Pertama: ");
		pegawai1.isiHobi(1, scan.nextLine());
		System.out.print("Masukkan Hobi Kedua: ");
		pegawai1.isiHobi(2, scan.nextLine());
		System.out.print("Masukkan Hobi Ketiga: ");
		pegawai1.isiHobi(3, scan.nextLine());
		System.out.print("Masukkan Pendidikan Terakhir(SD/SMP/SMA/D3/D4/S1/S2/S3): ");
		pegawai1.setPendidikan(scan.nextLine());
		System.out.print("Masukkan Bagian (Keuangan/Marketing/Gudang/Personalia/Penjualan/Kasir): ");
		pegawai1.setBagian(scan.nextLine());
		System.out.print("Masukkan Jenis Pegawai (Honorer/Pegawai): ");
		jenispeg = scan.nextLine();
		scan.close();
		pegawai1.setJenispeg(jenispeg);
		pegawai1.generateGaji(jenispeg);
		System.out.println("");
		pegawai1.Display();
		pegawait.Display();
	}
}
