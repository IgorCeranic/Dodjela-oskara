package ZadatakOskar;

import java.util.ArrayList;

public class Film implements Nominovan, Comparable<Film>{
    private String naziv;
    private int godina;
    private int trajanje;
    private double rejting;
    private Zanr zanr;
    private ArrayList<ClanEkipe> clanoviEkipe;
    private ArrayList<Kritika> kritike;

    public Film(String naziv, int godina, int trajanje, Reziser reziser,Zanr zanr) {
        this.naziv = naziv;
        this.godina = godina;
        if(trajanje<=0){
            trajanje =90;
        }
        this.trajanje = trajanje;
        this.zanr = zanr;
        this.clanoviEkipe = new ArrayList<>();
        this.clanoviEkipe.add(reziser);
        this.kritike = new ArrayList<>();
    }

    public double getRejting(){
        return rejting;
    }
    public int getTrajanje(){
        return trajanje;
    }
    public Zanr getZanr(){
        return zanr;
    }
    public ArrayList<ClanEkipe> getClanoviEkipe(){
        return clanoviEkipe;
    }


    public boolean dodajGlumca(Glumac gl){
        if(!clanoviEkipe.contains(gl)){
            if(this.zanr ==Zanr.ANIMIRANI || this.zanr == Zanr.MJUZIKL){
                if(gl.lepGlas == true){
                    clanoviEkipe.add(gl);
                    return true;
                }
                else return false;
            }
            else{
                clanoviEkipe.add(gl);
                return true;
            }
        }
        else return false;
    }


    public boolean dodajRezisera(Reziser reziser){
        if(!clanoviEkipe.contains(reziser)){
            clanoviEkipe.add(reziser);
            reziser.setBrRezFilmova(reziser.getBrRezFilmova() + 1);
            return true;
        }
        return false;
    }

    public boolean dodajKritiku(Kritika kritika){
        for(Kritika kr:kritike){
            if(!kr.getKriticar().equals(kritika.getKriticar())){
                kritike.add(kritika);
                return true;
            }
        }
       return false;
    }

    public void izracunajRejting(){
        double suma = 0;
        for(Kritika kr:kritike){
            suma += kr.getOcjena() * kr.getKriticar().getReputacija();
        }
        if(kritike.size()>0){
            this.rejting = suma/kritike.size();
        }
        else this.rejting = 1;
    }

    public Reziser getPredstavnik(){
        Reziser rez = (Reziser) clanoviEkipe.get(0);
        for(ClanEkipe cl:clanoviEkipe){
            if(cl instanceof Reziser){
                Reziser pomocniRez = (Reziser) cl;
                if(pomocniRez.getDatumRodjenja().compareTo(rez.datumRodjenja)<0){
                    rez = pomocniRez;
                }
            }
        }
        return rez;
    }


    @Override
    public void primiOskara() {
        Reziser predstavnik = getPredstavnik();
        System.out.println("U ime cijele filmske ekipe : ");
        predstavnik.odrziGovor();
        //System.out.println("Reziser  prima oskara i ushiceno se svima zahvaljuje, zna da nije zasluzeno i da mu je poslednji ... al ipak je srecan");

    }

    @Override
    public int compareTo(Film o) {
        if(this.rejting>o.rejting){
            return -1;
        }
        else if(this.rejting<o.rejting){
            return 1;
        }
        else{
            Reziser prviRez = this.getPredstavnik();
            Reziser drugiRez = o.getPredstavnik();
            return (prviRez.getBrRezFilmova() - drugiRez.getBrRezFilmova()) * -1;
        }

    }
}
