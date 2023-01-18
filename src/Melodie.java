public class Melodie {
    private String[] noteMuzicale;
    private String numeMelodie;

    public Melodie(String[] notes, String nume) {
        noteMuzicale = notes;
        numeMelodie = nume;
    }

    public String[] getNoteMuzicale() {
        return noteMuzicale;
    }

    public String getNumeMelodie() {
        return numeMelodie;
    }
}
