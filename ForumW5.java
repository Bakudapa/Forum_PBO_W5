package forumw5;
import forumw5.Item;
import forumw5.ItemDiskon;
import forumw5.MP;
import forumw5.Mahasiswa;

public class ForumW5 {
    public static void main(String[] args) {
        // Membuat objek Item
        Item item1 = new Item("Nasi Goreng", 15000, 1);
        ItemDiskon itemDiskon1 = new ItemDiskon("Sate Ayam", 20000, 1);

        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Budi", item1, 2);
        MP mp1 = new MP("Ani", itemDiskon1, 3);

        // Informasi Mahasiswa
        mhs1.infoMahasiswa();
        System.out.println();
        // Informasi Mahasiswa Berprestasi
        mp1.infoMahasiswa();
    }
}

