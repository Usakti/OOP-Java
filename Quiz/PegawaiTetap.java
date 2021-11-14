public class PegawaiTetap extends Pegawai {
	double tjmakan = 500000;
	double tjtransport = 500000;
	
	@Override
	public double hitungGaji() {
		return (getGaji()*100/100) + tjtransport + tjmakan;
	}
	
	@Override
	void Display() {
		System.out.println("Tunjangan Makan: " + tjmakan);
		System.out.println("Tunjangan Transportasi: " + tjtransport);
		System.out.println("Total Tunjangan: " + (tjtransport+tjmakan));
		System.out.println("Gaji Dengan Tunjangan: " + hitungGaji());
	}
}
