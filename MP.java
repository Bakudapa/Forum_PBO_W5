package forumw5;


import forumw5.Mahasiswa;

public class MP extends Mahasiswa {
    public MP(String namaMhs, Item item, int jumlah) {
        super(namaMhs, item, jumlah);
    }

    @Override
    public void infoMahasiswa() {
        if (getItem() instanceof ItemDiskon) {
            ItemDiskon itemDiskon = (ItemDiskon) getItem();
            int totalHargaSebelumDiskon = itemDiskon.getHarga() * getJumlah();
            int totalHargaSesudahDiskon = itemDiskon.getHargaDiskon() * getJumlah();

            System.out.println("Nama Mahasiswa Berprestasi: " + getNamaMhs());
            System.out.println("Item yang dibeli: " + itemDiskon.getNamaItem());
            System.out.println("Jumlah: " + getJumlah());
            System.out.println("Total Harga Sebelum Diskon: " + totalHargaSebelumDiskon);
            System.out.println("Total Harga Setelah Diskon: " + totalHargaSesudahDiskon);
        } else {
            super.infoMahasiswa();
        }
    }
}

