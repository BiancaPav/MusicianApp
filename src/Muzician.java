public class Muzician {
    private String nume;
    private Chitara chitaraLuata;
    private Melodie melodieInvatata;
    private String brandChitaraDorita;

    public Muzician(String numeMuzician) {

        nume = numeMuzician;
    }

    public String getNume() {

        return nume;
    }

    public void intraInMagazin(MagazinInstrumente magazin) {
        magazin.acceptaMuzician(this);

    }

    public void cereChitara(Vanzator vanzator) {
        System.out.println("Muzicianul " + nume + " spune: Da-mi chitara " + brandChitaraDorita);
        Chitara chitara = vanzator.oferaChitara(brandChitaraDorita);
        if (chitara != null) {
            this.preiaChitara(chitara); //this se refera la aceasta clasa, adica muzician
        }
    }

    private void preiaChitara(Chitara chitara) {
        if (chitara != null) {
            chitaraLuata = chitara;
            System.out.println("Muzicianul " + nume + " a preluat o chitara " + chitara.getBrand());
        } else {
            System.out.println("Muzicianul " + nume + " spune: Nu mi-ai dat nici o chitara");
        }
    }

    public void invataMelodia(Melodie melodie) {
        melodieInvatata = melodie;
        System.out.println("Muzicianul " + nume + " a invatat melodia " + melodie.getNumeMelodie());
    }

    public void cantaMelodia() {
        if (melodieInvatata == null) {
            System.out.println(nume + " spune: Nu stiu nici o melodie");
            return;
        }
        if (chitaraLuata == null) {
            System.out.println(nume + " spune: Da-mi o chitara");
            return;
        }

        System.out.println("Muzicianul " + nume + " a inceput sa cante melodia " + melodieInvatata.getNumeMelodie());

        for (int i = 0; i < melodieInvatata.getNoteMuzicale().length; i++) {
            String[] note = melodieInvatata.getNoteMuzicale(); //tot sirul de note muzicale;
            String noteMuzicale = note[i];
            chitaraLuata.genereazaSunetul(noteMuzicale);
        }
    }


    public void setBrandChitara(String brandChitaraDorita) {
        this.brandChitaraDorita = brandChitaraDorita;
    }

}

