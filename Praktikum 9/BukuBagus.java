package Books;

interface Buku {
	public void judul();
	public void cover();
	public void Bab();
}

public class BukuBagus implements Buku {
	
	@Override
	public void cover() {
		System.out.println("Covernya adalah George Orwell img");
	}
	
	@Override
	public void judul() {
		System.out.println("Judul Buku Bagaimana si Miskin Mati");
	}
	
	@Override
	public void Bab() {
		System.out.println("Bab 1 adalah \" Hukuman Gantung \"");
	}
	
	public static void main(String [] args) {
		BukuBagus bBagus = new BukuBagus();
		bBagus.cover();
		bBagus.judul();
		bBagus.Bab();
	}
}
