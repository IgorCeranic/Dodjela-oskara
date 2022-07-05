package ZadatakOskar;

public class Kritika {
    private double ocjena;
    private Kriticar kriticar;

    public Kritika(Kriticar kriticar,double ocjena) {
        this.kriticar = kriticar;
        this.ocjena = ocjena;
    }

    public Kriticar getKriticar(){
        return kriticar;
    }
    public double getOcjena(){
        return ocjena;
    }

    @Override
    public String toString() {
        return "Kritika{" +
                "ocjena=" + ocjena +
                ", kriticar=" + kriticar +
                '}';
    }
}
