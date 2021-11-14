import java.util.ArrayList;

public class TampilData{

	ArrayList<Barang> tampung;

	public TampilData()
	{
		tampung = new ArrayList<Barang>();
	}

	public void isiData(int id, String kd, String nm)
	{
		tampung.add(new Barang(id, kd, nm));
	}

	public void showData()
	{
		for(Barang barang:tampung)
		{
			System.out.println("ID Barang: " + barang.getId() + "" + ", Kode Barang:  " + barang.getKd() + "" + ", Nama Barang: " + barang.getNm());
		}
	}

	public static void main(String args[])
	{
		TampilData td = new TampilData();
		td.isiData(1, "01", "Topi");
		td.isiData(2, "02", "Kemeja");
		td.isiData(3, "03", "Sepatu");
		td.isiData(4, "04", "Sandal");

		td.showData();
	}
}
