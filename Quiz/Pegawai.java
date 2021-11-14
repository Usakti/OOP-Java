import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Pegawai {
	ArrayList<Pegawai> tampung;
	private String nopeg, nama, alamat, kelamin, nomortp, email, tempatlahir, hobi, goldar, pendidikan, bagian, status, jenispeg, tgllahir = "dd-mm-yyyy";
	private int umur, nomorHobi;
	private double gaji = 4000000;

	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(tgllahir);

	public Pegawai(int nomorHobi, String hobi) {
		this.hobi = hobi;
		this.nomorHobi = nomorHobi;
	}
	
	public Pegawai() {
		tampung = new ArrayList<Pegawai>();
	}

	public void isiHobi(int nomorHobi, String hobi) {
		tampung.add(new Pegawai(nomorHobi, hobi));
	}
	
	public void showArray() {
		for(Pegawai pegawai:tampung) {
			System.out.println("Hobi " + pegawai.getNomorHobi() + ": " + pegawai.getHobi());
		}
	}

	public String getNopeg() {
		return nopeg;
	}
	
	public void setNopeg(String nopeg) {
		this.nopeg = nopeg;
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
	
	public String getNomortp() {
		return nomortp;
	}
	
	public void setNomortp(String nomortp) {
		this.nomortp = nomortp;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTempatlahir() {
		return tempatlahir;
	}
	
	public void setTempatlahir(String tempatlahir) {
		this.tempatlahir = tempatlahir;
	}
	
	public String getHobi() {
		return hobi;
	}
	
	public void setHobi(String hobi) {
		this.hobi = hobi;
	}
	
	public int getNomorHobi() {
		return nomorHobi;
	}

	public void setNomorHobi(int nomorHobi) {
		this.nomorHobi = nomorHobi;
	}
	
	public int getUmur() {
		return umur;
	}
	
	public void setUmur(int umur) {
		this.umur = umur;
	}

	public String getKelamin() {
		return kelamin;
	}

	public void setKelamin(String kelamin) {
		if (kelamin == "L") {
			this.kelamin = "Laki-laki";
		}
		
		else if (kelamin == "P") {
			this.kelamin = "Perempuan";
		}
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if (status == "Menikah") {
			this.status = "Sudah Menikah";
		}
		
		else if (status == "Lajang") {
			this.status = "Belum Menikah";
		}
	}

	public String getTgllahir() {
		return tgllahir;
	}

	public void setTgllahir(String tgllahir) {
		this.tgllahir = tgllahir;
	}
	
	public String getGoldar() {
		return goldar;
	}

	public void setGoldar(String goldar) {
		if (goldar == "A") {
			this.goldar = "Golongan Darah A";
		}
			
		else if (goldar == "B") {
			this.goldar = "Golongan Darah B";
		}
			
		else if (goldar == "AB") {
			this.goldar = "Golongan Darah AB";
		}
		
		else if (goldar == "O") {
			this.goldar = "Golongan Darah O";
		}
	}

	public String getPendidikan() {
		return pendidikan;
	}

	public void setPendidikan(String pendidikan) {
		if (pendidikan == "SD") {
			this.pendidikan = "SD";
		}
		
		else if (pendidikan == "SMP") {
			this.pendidikan = "SMP";
		}
			
		else if (pendidikan == "SMA") {
			this.pendidikan = "SMA";
		}
		
		else if (pendidikan == "D3") {
			this.pendidikan = "D3";
		}
		
		else if (pendidikan == "D4") {
			this.pendidikan = "D4";
		}
			
		else if (pendidikan == "S1") {
			this.pendidikan = "S1";
		}
		
		else if (pendidikan == "S2") {
			this.pendidikan = "S2";
		}
		
		else if (pendidikan == "S3") {
			this.pendidikan = "S3";
		}
	}

	public String getBagian() {
		return bagian;
	}

	public void setBagian(String bagian) {
		if (bagian == "Keuangan") {
			this.bagian = "Keuangan";
		}
			
		else if (bagian == "Marketing") {
			this.bagian = "Marketing";
		}
			
		else if (bagian == "Gudang") {
			this.bagian = "Gudang";
		}
			
		else if (bagian == "Personalia") {
			this.bagian = "Personalia";
		}
			
		else if (bagian == "Penjualan") {
			this.bagian = "Penjualan";
		}
			
		else if (bagian == "Kasir") {
			this.bagian = "Kasir";
		}
	}
	
	public String getJenispeg() {
		return jenispeg;
	}

	public void setJenispeg(String jenispeg) {
		if (jenispeg == "Pegawai") {
			this.jenispeg = "Pegawai Tetap";
		}
		
		else if (jenispeg == "Honorer") {
			this.jenispeg = "Pegawai Honorer";
		}
	}
	
	public void generateGaji(String jenispeg) {
		if (jenispeg == "Honorer") {
			this.setGaji(gaji*80/100);
		}
		
		else if (jenispeg == "Pegawai") {
			this.setGaji(gaji);
		}
	}
	
	public double hitungGaji() {
		return gaji;
	}

	public double getGaji() {
		return gaji;
	}

	public void setGaji(double gaji) {
		this.gaji = gaji;
	}
	
	void Display() {
		System.out.println("Nomor Pegawai: " + getNopeg());
		System.out.println("Nama: " + getNama());
		System.out.println("Alamat: " + getAlamat());
		System.out.println("Umur: " + getUmur());
		System.out.println("Jenis Kelamin: " + getKelamin());
		System.out.println("Nomor Telepon: " + getNomortp());
		System.out.println("Email: " + getEmail());
		System.out.println("Golongan Darah: " + getGoldar());
		System.out.println("Tempat Lahir: " + getTempatlahir());
		System.out.println("Tanggal Lahir: " + getTgllahir());
		System.out.println("Status Pernikahan: " + getStatus());
		showArray();
		System.out.println("Pendidikan Terakhir: " + getPendidikan());
		System.out.println("Bagian: " + getBagian());
		System.out.println("Jenis Pegawai: " + getJenispeg());
		System.out.println("Gaji Utuh: " + getGaji());
	}
}
