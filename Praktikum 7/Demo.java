public class Demo {
    public static void main(String[] args) {
        Harimau harimau = new Harimau();
        harimau.setNama("Harimau Sumatera");
        harimau.setBerat(108.25);
        harimau.setJenis("Jantan");
        harimau.setMakanan("Daging");
        harimau.setLokasi("Sumatera, Indonesia");
        harimau.tampilkanDetail();

        Anjing anjing = new Anjing();
        anjing.setNama("Anjing Dalmatian");
        anjing.setBerat(20.65);
        anjing.setJenis("Betina");
        anjing.setMakanan("Daging");
        anjing.setLokasi("Kroasia");
        anjing.tampilkanDetail();
    }
}
