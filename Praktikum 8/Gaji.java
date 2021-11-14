package Manusia;

public class Gaji extends Karyawan {
	private double gaji; //Gaji Tahunan
	
	public Gaji(String nama, String alamat, int nomor, double gaji) {
		super(nama, alamat, nomor);
		setSalary(gaji);	
	}
	
	public void mailCheck() {
		System.out.println("Dalam mailCheck dari kelas Gaji ");
		System.out.println("Mengirim sebuah check untuk " + getName() + " dengan gaji " + gaji);
	}
	
	public double getSalary() {
		return gaji;
	}
	
	public void setSalary(double gajiBaru) {
		if (gajiBaru >= 0.0) {
			gaji = gajiBaru;
		}
	}
	
	public double computePay() {
		System.out.println("Menghitung pembayaran gaji untuk " + getName());
		return gaji/52;
	}
}
