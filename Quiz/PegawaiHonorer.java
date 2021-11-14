public class PegawaiHonorer extends Pegawai {
	double bonus = 800000;
	
	@Override
	public double hitungGaji() {
		return (getGaji()*80/100) + bonus;
	}
	
	@Override
	void Display() {
		System.out.println("Bonus: " + bonus);
		System.out.println("Gaji Dengan Bonus: " + hitungGaji());
	}
}
