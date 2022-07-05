package ZadatakOskar;

import java.util.Date;
import java.util.Random;

public class Glumac extends ClanEkipe {

    boolean lepGlas;

    public Glumac(String ime, String prezime, Date datumRodjenja, Pol pol) {
        super(ime, prezime, datumRodjenja, pol);
        this.lepGlas = lepGlas;
        Random rand = new Random();
        this.lepGlas = rand.nextBoolean();
    }

    @Override
    public void odrziGovor() {
        //System.out.println("Glumac " + ime + " " + prezime + " se zahvaljuje na dobijenm oskaru....Fala vi veli.");
        System.out.println("Glumac " + toString() + " se zahvaljuje na dobijenm oskaru....Fala vi veli.");
    }

    @Override
    public void primiOskara() {
        Random rand = new Random();
        if(rand.nextDouble()<=0.1){
            //System.out.println("Glumac" + ime + "" + prezime + " iz principa odbija da primi oskara!");
            System.out.println("Glumac" + toString() + " iz principa odbija da primi oskara!");
        }
        else {
            odrziGovor();
        }
    }

    @Override
    public String toString() {
        return "Glumac{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", datumRodjenja=" + datumRodjenja +
                ", pol=" + pol +
                '}';
    }
}
