package forumw5;

public class Item {
    private String namaItem;
    private int harga;
    private int jumlah;

    public Item(String namaItem, int harga, int jumlah) {
        this.namaItem = namaItem;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void displayInfoItem() {
        System.out.println("Nama Item: " + namaItem);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah: " + jumlah);
    }
}
