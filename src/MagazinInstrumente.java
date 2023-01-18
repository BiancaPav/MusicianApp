public class MagazinInstrumente {
    private Chitara[] chitare = new Chitara[10];
    private Muzician[] muzicieni = new Muzician[100];
    private int counter = 0;
    private int counterMuzicieni = 0;

    public MagazinInstrumente() {
    }

    public void adaugaChitara(Chitara chitara) {
        if (counter >= chitare.length) {
            System.out.println("Magazinul este plin");
            return;
        }
        chitare[counter] = chitara;
        counter++;
    }

    public void acceptaMuzician(Muzician muzician) {
        if (counterMuzicieni >= muzicieni.length) {
            System.out.println("Magazinul este plin");
            return;
        }
        muzicieni[counterMuzicieni] = muzician;
        counterMuzicieni++;
        System.out.println("Muzicianul " + muzician.getNume() + " a intrat in magazin.");
    }

    public void afiseazaBranduri() {
        System.out.println("Magazinul detine brandurile:");
        for (int i = 0; i < chitare.length; i++) {
            if (chitare[i] != null) {
                System.out.println(chitare[i].getBrand());
            }
        }
    }

    public Chitara cautaChitaraDupaBrand(String brand) {
        for (Chitara chitara : chitare) {
            if (chitara != null && chitara.getBrand() != null && chitara.getBrand().equals(brand)) {
                return chitara;
            }
        }
        return null;
    }

}
