public class Chitara {
    private String brand;

    public Chitara(String numeChitara) {
        brand = numeChitara;
    }

    public void genereazaSunetul(String nota) {

        System.out.println("Chitara " + brand + " scoate sunetul " + nota);
    }

    public String getBrand() {
        return brand;
    }
}
