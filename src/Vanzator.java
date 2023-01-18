public class Vanzator {
    private MagazinInstrumente magazinulLaCareVanzatorulEsteAngajat;

    public Vanzator(MagazinInstrumente magazin1) {
        magazinulLaCareVanzatorulEsteAngajat = magazin1;
    }

    public Chitara oferaChitara(String brand) {
        Chitara chitara = magazinulLaCareVanzatorulEsteAngajat.cautaChitaraDupaBrand(brand);
        if (chitara == null) {
            System.out.println("Vanzatorul spune: Nu am gasit chitara");
        }
        return chitara;
    }
}

