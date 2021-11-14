public class Karnivora {
    private double berat;
    private String makanan, nama, jenis, lokasi;

    //Method getter dan setter untuk berat

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    //Method getter dan setter untuk makanan
    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    //Method getter dan setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    //Method getter dan setter untuk jenis

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    //Method getter dan setter untuk lokasi
    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    //Method untuk menampilkan detail karnivora
    public void tampilkanDetail(){
        System.out.println("Nama: " + getNama());
        System.out.println("Berat: " + getBerat());
        System.out.println("Makanan: " + getMakanan());
        System.out.println("Jenis: " + getJenis());
        System.out.println("Lokasi: " + getLokasi());
        System.out.println();
    }
}
