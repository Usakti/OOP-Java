import javax.swing.JOptionPane;

public class Mahasiswa {
	String noInduk, nama, alamat;
	int usia;
	double ipk;

	public String getNoInduk() {
		return noInduk;
	}
	
	public void setNoInduk(String noInduk) {
		this.noInduk = noInduk;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public int getUsia() {
		return usia;
	}

	public void setUsia(int usia) {
		this.usia = usia;
	}

	public double getIpk() {
		return ipk;
	}

	public void setIpk(double ipk) {
		this.ipk = ipk;
	}

	public void printMahasiswa(int seqNo) {
		System.out.println("Mahasiswa " + seqNo + " : \n------------");
		System.out.println("No. Induk 	= " + this.getNoInduk());
		System.out.println("Nama	= " + this.getNama());
		System.out.println("Alamat	= " + this.getAlamat());
		System.out.println("Usia	= " + this.getUsia());
		System.out.println("IPK		= " + this.getIpk() + "\n");
	}

	public void showMessageDialog(int seqNo) {
		String message =
		"Mahasiswa " + seqNo + " : \n-------------------\n" +
		"No. Induk	= " + this.getNoInduk() + "\n" +
		"Nama		= " + this.getNama() + "\n" +
		"Alamat		= " + this.getAlamat() + "\n" +
		"Usia		= " + this.getUsia() + "\n" +
		"IPK		= " + this.getIpk() + "\n";
		JOptionPane.showMessageDialog(null, message);
	}
}
