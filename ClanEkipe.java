package ZadatakOskar;

import java.util.Date;

public abstract class ClanEkipe implements Nominovan{
    String ime;
    String prezime;
    Date datumRodjenja;
    Pol pol;

    public ClanEkipe(String ime, String prezime, Date datumRodjenja,Pol pol) {
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.pol = pol;
    }

    public abstract void odrziGovor();

    public Pol getPol(){
        return pol;
    }
    public Date getDatumRodjenja(){
        return datumRodjenja;
    }

    @Override
    public String toString() {
        return "ClanEkipe{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", datumRodjenja=" + datumRodjenja +
                ", pol=" + pol +
                '}';
    }
}
