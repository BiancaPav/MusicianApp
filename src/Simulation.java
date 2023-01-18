public class Simulation {
    public static void main(String[] args) {
        String[] note = {"Do", "Re", "Mi", "Fa", "Sol", "La"};
        Melodie balada = new Melodie(note, "Lie melodie.");
        Chitara chitara1 = new Chitara("Fender");
        Chitara chitara2 = new Chitara("Ibanese");
        MagazinInstrumente magazin = new MagazinInstrumente();
        Vanzator vanzator = new Vanzator(magazin);
        magazin.adaugaChitara(chitara1);
        magazin.adaugaChitara(chitara2);
        magazin.afiseazaBranduri();


        Muzician muzician = new Muzician("Enescu");

        muzician.intraInMagazin(magazin);
        muzician.setBrandChitara("Ibanese");
        muzician.cereChitara(vanzator);
        muzician.invataMelodia(balada);
        muzician.cantaMelodia();

        Muzician bianca = new Muzician("Bianca");
        bianca.setBrandChitara("Gibson");
        bianca.cereChitara(vanzator);

        Muzician ioana = new Muzician("Ioana");
        ioana.setBrandChitara("Ibanese");
        ioana.cereChitara(vanzator);
        ioana.cantaMelodia();


    }
}
