package ZadatakOskar;

public class Kriticar {
    String ime;
    String prezime;
    int reputacija;

    public Kriticar(String ime, String prezime, int reputacija)/*throws ReputacijaOutOfRange */{
        this.ime = ime;
        this.prezime = prezime;
        if (reputacija> 100){
            reputacija =100;
        }
        this.reputacija = reputacija;
    }

    public int getReputacija(){
        return reputacija;
    }

    public void pohvali(Kriticar drKriticar){
        double dodatakReputacije;
        dodatakReputacije =  this.reputacija*0.1;
        drKriticar.reputacija += dodatakReputacije;
        if(drKriticar.reputacija>100){
            reputacija =100;
        }

    }

    public void ocijeniFilm(Film film){

    }

    @Override
    public String toString() {
        return "Kriticar{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", reputacija=" + reputacija +
                '}';
    }
}
