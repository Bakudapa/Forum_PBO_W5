package forumw5;

public class ItemDiskon extends Item {
    public ItemDiskon(String namaItem, int harga, int jumlah) {
        super(namaItem, harga, jumlah);
    }

    public int getHargaDiskon() {
        return (int) (getHarga() * 0.9); // Diskon 10%
    }

    @Override
    public void displayInfoItem() {
        System.out.println("Nama Item: " + getNamaItem());
        System.out.println("Harga Diskon: " + getHargaDiskon());
        System.out.println("Jumlah: " + getJumlah());
    }
}
