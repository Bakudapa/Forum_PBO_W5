package forumw5;


import forumw5.Logistik;

public class Kantin {
    private Item item;
    private Logistik logistik;

    public Kantin(Item item, Logistik logistik) {
        this.item = item;
        this.logistik = logistik;
    }

    public void infoKantin() {
        System.out.println("Info Kantin:");
        item.displayInfoItem();
        logistik.infoLogistik();
    }
}
