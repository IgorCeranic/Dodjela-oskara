package ZadatakOskar;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class FilmskaAkademija {

    double MIN_REJTING;
    ArrayList<Film> filmNom = new ArrayList<>();
    ArrayList<Glumac> zenskaUlogaNom = new ArrayList<>();
    ArrayList<Glumac> muskaUlogaNom = new ArrayList<>();
    ArrayList<Reziser> reziserNom = new ArrayList<>();


    public FilmskaAkademija(){
        this.filmNom = new ArrayList<>();
        this.zenskaUlogaNom = new ArrayList<>();
        this.muskaUlogaNom = new ArrayList<>();
        this.reziserNom = new ArrayList<>();
    }

    public boolean nominuj(Nominovan nom){
        if(nom instanceof Glumac){
            Glumac gl = (Glumac) nom;
            if (gl.pol ==Pol.MUSKI){
                if(!muskaUlogaNom.contains(gl)){
                    muskaUlogaNom.add(gl);
                    System.out.println("Glumac je nominovan za oskara!");
                    return true;
                }
            }
            else{
                if(!zenskaUlogaNom.contains(gl)){
                    zenskaUlogaNom.add(gl);
                    System.out.println("Glumica je nominovana za oskara!");
                    return true;
                }
            }
            return false;
        }

        else if(nom instanceof Reziser ){
            Reziser rez = (Reziser) nom;
            if(!reziserNom.contains(rez)){
                reziserNom.add(rez);
                System.out.println("Reziser je nominovan za oskara!");
                return true;
            }
            return false;
        }

        else if(nom instanceof Film){
            Film film = (Film) nom;
            if(!filmNom.contains(film)){
                int brm = 0;
                int brz = 0;
                for(ClanEkipe cl: film.getClanoviEkipe()){
                    if(cl.pol ==Pol.ZENSKI){
                        brz++;
                    }
                    if(cl.pol == Pol.MUSKI){
                        brm++;
                    }
                }
                if(brm>=1 && brz>=1 && film.getRejting()>= MIN_REJTING && film.getTrajanje()>= 40){
                    if(film.getZanr() ==Zanr.BIOGRAFSKI || film.getZanr() ==Zanr.DOKUMENTARNI && film.getTrajanje()>= 150){
                        System.out.println("Film traje predugo...");
                        return false;
                        }
                    System.out.println("Film se nominuje za oskara...");
                    filmNom.add(film);

                    }
                else{
                    System.out.println("Nema makar po jedna uloga oba pola ili je slab rejting fima...");
                }
            }
            else{
                System.out.println("Film je vec nominovan za oskara...");
                return false;
            }
        }
        return  false;
    }


    public String getNominacijeIzvjestaj(){
        Collections.sort(filmNom);
        Collections.sort(reziserNom);
        String str  = "";

        StringBuilder sb = new StringBuilder();
        sb.append("SPISAK NOMINOVANIH :");
        sb.append("Nominovani filmovi su: \n");
        for(Film film:filmNom){
            sb.append(film + "\n");
        }

        sb.append("*******************************************************");

        sb.append("Nominovani reziseri su: \n");
        for(Reziser reziser:reziserNom){
            sb.append(reziser + "\n");
        }
        sb.append("********************************************************");

        sb.append("Nominovani glumci su: \n");
        for(Glumac gl:muskaUlogaNom){
            sb.append(gl + "\n");
        }
        sb.append("*********************************************************");

        sb.append("Nominovane glumice su: \n");
        for(Glumac gl:zenskaUlogaNom){
            sb.append(gl + "\n");
        }
        sb.append("**********************************************************");

        str = sb.toString();
        return str;
    }


    public void objaviNominacije() {
        try(BufferedWriter bufw = new BufferedWriter(new FileWriter("D:\\JavaPractice\\oskarNominacije.txt"))){
            bufw.write(getNominacijeIzvjestaj());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Doslo je do greske prilikom upisa u fajl...");
        }
    }


    public void odrziDodjelu(){
        if(filmNom.size()>0 && reziserNom.size()>0 && zenskaUlogaNom.size()>0 && muskaUlogaNom.size()>0){
            Random rand = new Random();
            Film najFilm = filmNom.get(rand.nextInt(filmNom.size()));
            Reziser najRezizer = reziserNom.get(rand.nextInt(reziserNom.size()));
            Glumac najGlumica = zenskaUlogaNom.get(rand.nextInt(zenskaUlogaNom.size()));
            Glumac najGlumac = muskaUlogaNom.get(rand.nextInt(muskaUlogaNom.size()));

            najFilm.primiOskara();
            najRezizer.primiOskara();
            najGlumac.primiOskara();
            najGlumica.primiOskara();

        }
        else{
            System.out.println("U svakoj kategoriji mora biti nominovan bar po jedan kandidat...!");
        }
    }



}
