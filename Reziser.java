package ZadatakOskar;

import java.util.Date;

public class Reziser extends ClanEkipe implements Comparable<Reziser>{
   private int brRezFilmova;

    public Reziser(String ime, String prezime, Date datumRodjenja, Pol pol, int brRezFilmova) {
        super(ime, prezime, datumRodjenja, pol);
        this.brRezFilmova = brRezFilmova;
    }

    @Override
    public void odrziGovor() {
        //System.out.println("Reziser " + ime + " " + prezime + " se zahvaljje svima za primljenog oskara. Ocekivano nema sta da se prica...");
        System.out.println("Reziser " + toString() + " se zahvaljje svima za primljenog oskara. Ocekivano nema sta da se prica...");
    }

    @Override
    public void primiOskara() {
        odrziGovor();
    }

    public int getBrRezFilmova(){
        return brRezFilmova;
    }

    public void setBrRezFilmova(int brRezFilmova){
    this.brRezFilmova = brRezFilmova;
    }

    @Override
    public int compareTo(Reziser o) {
        if(this.brRezFilmova> o.brRezFilmova){
            return 1;
        }
        else if(this.brRezFilmova <o.brRezFilmova){
            return -1;
        }
        else return 0;
    }

    @Override
    public String toString() {
        return "Reziser{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", datumRodjenja=" + datumRodjenja +
                ", pol=" + pol +
                ", brRezFilmova=" + brRezFilmova +
                '}';
    }
}
