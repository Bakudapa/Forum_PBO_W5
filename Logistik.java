package forumw5;

public class Logistik {
    private String namaBarang;
    private int jumlahBarang;

    public Logistik(String namaBarang, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    public String getBarang() {
        return namaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void infoLogistik() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Jumlah Barang: " + jumlahBarang);
    }
}
