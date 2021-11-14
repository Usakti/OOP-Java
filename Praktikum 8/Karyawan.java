package Manusia;

public abstract class Karyawan {
	private String nama;
	private String alamat;
	private int nomor;
	
	public Karyawan(String nama, String alamat, int nomor) {
		System.out.println("membuat satu Karyawan");
		this.nama = nama;
		this.alamat = alamat;
		this.nomor = nomor;
	}
	
	public double computePay() {
		System.out.println("Dalam computePAY Karyawan");
		return 0.0;
	}
	
	public void mainCheck() {
		System.out.println("Mengirim sebuah check untuk" + this.nama + " " + this.alamat);
	}

	public String toString() {
		return nama + " " + alamat + " " + nomor;
	}
	
	public String getName() {
		return nama;
	}
	
	public String getAdress() {
		return alamat;
	}
	
	public void getAdress(String alamatBaru) {
		alamat = alamatBaru;
	}
	
	public int getNumber() {
		return nomor;
	}
}
