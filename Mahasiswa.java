package forumw5;

public class Mahasiswa {
    private String namaMhs;
    private Item item;
    private int jumlah;

    public Mahasiswa(String namaMhs, Item item, int jumlah) {
        this.namaMhs = namaMhs;
        this.item = item;
        this.jumlah = jumlah;
    }

    public String getNamaMhs() {
        return namaMhs;
    }

    public Item getItem() {
        return item;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void infoMahasiswa() {
        System.out.println("Nama Mahasiswa: " + namaMhs);
        System.out.println("Item yang dibeli: " + item.getNamaItem());
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total Harga: " + (item.getHarga() * jumlah));
    }
}
