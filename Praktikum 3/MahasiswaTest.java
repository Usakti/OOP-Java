public class MahasiswaTest {
	public static void main(String[] args) {
		Mahasiswa mahasiswa1 = new Mahasiswa();
		Mahasiswa mahasiswa2 = new Mahasiswa();
		Mahasiswa mahasiswa3 = new Mahasiswa();
		Mahasiswa mahasiswa4 = new Mahasiswa();

		mahasiswa1.setNoInduk("12345");
		mahasiswa1.setNama("Ana");
		mahasiswa1.setAlamat("Bogor");
		mahasiswa1.setUsia(19);
		mahasiswa1.setIpk(2.80);
		
		mahasiswa2.setNoInduk("26381");
		mahasiswa2.setNama("Surya");
		mahasiswa2.setAlamat("Jatibening");
		mahasiswa2.setUsia(21);
		mahasiswa2.setIpk(3.14);

		mahasiswa3.setNoInduk("53210");
		mahasiswa3.setNama("Rudi");
		mahasiswa3.setAlamat("Pondok Indah");
		mahasiswa3.setUsia(20);
		mahasiswa3.setIpk(3.43);

		mahasiswa4.setNoInduk("065001900001");
		mahasiswa4.setNama("Azhar Rizky Zulma");
		mahasiswa4.setAlamat("Bintaro, Jakarta Selatan");
		mahasiswa4.setUsia(20);
		mahasiswa4.setIpk(3.33);

		mahasiswa1.showMessageDialog(1);
		mahasiswa2.showMessageDialog(2);
		mahasiswa3.showMessageDialog(3);
		mahasiswa4.showMessageDialog(4);
	}
}