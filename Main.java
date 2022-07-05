package ZadatakOskar;

import java.util.Date;



public class Main {
    public static void main(String [] args){

        Glumac g1 = new Glumac("Pero","Peric",new Date(1999,12,12),Pol.MUSKI);
        Glumac g2 = new Glumac("Misko","Peric",new Date(1999,12,12),Pol.MUSKI);
        Glumac g3 = new Glumac("Rajo","Peric",new Date(1999,12,12),Pol.MUSKI);
        Glumac g4 = new Glumac("Slavko","Peric",new Date(1999,12,12),Pol.MUSKI);
        Glumac g5 = new Glumac("Nikola","Peric",new Date(1999,12,12),Pol.MUSKI);
        Glumac g6 = new Glumac("Milan","Peric",new Date(1999,12,12),Pol.MUSKI);
        Glumac g7 = new Glumac("Jelena","Peric",new Date(1999,12,12),Pol.ZENSKI);
        Glumac g8 = new Glumac("Grozdana","Peric",new Date(1999,12,12),Pol.ZENSKI);
        Glumac g9 = new Glumac("Koviljka","Peric",new Date(1999,12,12),Pol.ZENSKI);
        Glumac g10 = new Glumac("Marina","Peric",new Date(1999,12,12),Pol.ZENSKI);
        Glumac g11 = new Glumac("Marta","Peric",new Date(1999,12,12),Pol.ZENSKI);
        Glumac g12 = new Glumac("Sanja","Peric",new Date(1999,12,12),Pol.ZENSKI);
        Glumac g13 = new Glumac("Borko","Peric",new Date(1999,12,12),Pol.MUSKI);
        Glumac g14 = new Glumac("Zivko","Peric",new Date(1999,12,12),Pol.MUSKI);
        Glumac g15 = new Glumac("Jevdjen","Peric",new Date(1999,12,12),Pol.MUSKI);


        Reziser r1 = new Reziser("Zivko","Mirkovic",new Date(1982,11,11),Pol.MUSKI,12);
        Reziser r2 = new Reziser("Krsto","Mirkovic",new Date(1982,11,11),Pol.MUSKI,31);
        Reziser r3 = new Reziser("Srdjan","Mirkovic",new Date(1982,11,11),Pol.MUSKI,2);
        Reziser r4 = new Reziser("Vlado","Mirkovic",new Date(1982,11,11),Pol.MUSKI,11);
        Reziser r5 = new Reziser("Nebojsa","Mirkovic",new Date(1982,11,11),Pol.MUSKI,5);
        Reziser r6 = new Reziser("Ivana","Mirkovic",new Date(1982,11,11),Pol.ZENSKI,17);
        Reziser r7 = new Reziser("Jovana","Mirkovic",new Date(1982,11,11),Pol.ZENSKI,4);
        Reziser r8 = new Reziser("jovan","Mirkovic",new Date(1982,11,11),Pol.MUSKI,1);
        Reziser r9 = new Reziser("Nemanja","Mirkovic",new Date(1982,11,11),Pol.MUSKI,8);
        Reziser r10 = new Reziser("Marko","Mirkovic",new Date(1982,11,11),Pol.MUSKI,12);
        Reziser r11 = new Reziser("Filip","Mirkovic",new Date(1982,11,11),Pol.MUSKI,11);
        Reziser r12 = new Reziser("Uros","Mirkovic",new Date(1982,11,11),Pol.MUSKI,7);


        Kriticar k1 = new Kriticar("Mitar","Mitrovic",12);
        Kriticar k2 = new Kriticar("Janko","Mandic",33);
        Kriticar k3 = new Kriticar("Marko","Mitrovic",5);
        Kriticar k4 = new Kriticar("Nikola","Knezevic",44);
        Kriticar k5 = new Kriticar("Rajko","Peric",31);
        Kriticar k6 = new Kriticar("Ibro","Urosevic",16);
        Kriticar k7 = new Kriticar("Vlado","Markovic",42);


        Film f1 = new Film("Vjetrovi",1980,121,r5,Zanr.MJUZIKL);
        f1.dodajGlumca(g2);
        f1.dodajGlumca(g4);
        f1.dodajGlumca(g9);


        Film f2 = new Film("Vrijeme potopa",1965,88,r5,Zanr.DRAMA);
        f2.dodajGlumca(g5);
        f2.dodajGlumca(g1);

        Film f3 = new Film("Pijanista",1970,160,r5,Zanr.BIOGRAFSKI);
        f3.dodajGlumca(g4);
        f3.dodajGlumca(g6);

        Film f4 = new Film("Lom",1999,111,r5,Zanr.KOMEDIJA);
        f4.dodajGlumca(g4);
        f4.dodajGlumca(g7);

        Film f5 = new Film("Vuk",1990,102,r5,Zanr.VESTERN);
        f5.dodajGlumca(g8);
        f5.dodajGlumca(g9);

        Film f6 = new Film("Vatra i dim",2011,90,r5,Zanr.ANIMIRANI);
        f6.dodajGlumca(g3);
        f6.dodajGlumca(g1);

        Film f7 = new Film("Sudbina mora",2019,89,r5,Zanr.TRILER);
        f7.dodajGlumca(g11);
        f7.dodajGlumca(g5);

        Film f8 = new Film("Dolina kise",12008,108,r5,Zanr.DRAMA);
        f8.dodajGlumca(g7);

        Film f9 = new Film("Karambol",1956,141,r5,Zanr.DOKUMENTARNI);
        f9.dodajGlumca(g12);
        f9.dodajGlumca(g1);

        Film f10 = new Film("Crna ruza",1984,121,r5,Zanr.AVANTURA);
        f10.dodajGlumca(g9);

        Film f11 = new Film("Most",1980,121,r5,Zanr.MJUZIKL);
        f11.dodajGlumca(g10);
        f11.dodajGlumca(g4);

        k1.ocijeniFilm(f2);
        k1.ocijeniFilm(f5);
        k2.ocijeniFilm(f1);
        k2.ocijeniFilm(f9);
        k4.ocijeniFilm(f6);
        k4.ocijeniFilm(f1);
        k6.ocijeniFilm(f8);
        k6.ocijeniFilm(f11);
        k3.ocijeniFilm(f3);
        k3.ocijeniFilm(f6);
        k5.ocijeniFilm(f5);
        k5.ocijeniFilm(f2);
        k2.ocijeniFilm(f9);
        k2.ocijeniFilm(f10);

        k1.pohvali(k2);
        k2.pohvali(k6);
        k4.pohvali(k1);
        k6.pohvali(k3);
        k5.pohvali(k6);
        k7.pohvali(k3);

        FilmskaAkademija akademija = new FilmskaAkademija();
        akademija.nominuj(f1);
        akademija.nominuj(f5);
        akademija.nominuj(f4);
        akademija.nominuj(f8);
        akademija.nominuj(f11);
        akademija.nominuj(f10);
        akademija.nominuj(f2);
        akademija.nominuj(f7);

        akademija.nominuj(r1);
        akademija.nominuj(r2);
        akademija.nominuj(r4);
        akademija.nominuj(r6);
        akademija.nominuj(r8);

        akademija.nominuj(g1);
        akademija.nominuj(g11);
        akademija.nominuj(g12);
        akademija.nominuj(g4);
        akademija.nominuj(g6);
        akademija.nominuj(g9);
        akademija.nominuj(g8);
        akademija.nominuj(g2);


        akademija.objaviNominacije();
        akademija.getNominacijeIzvjestaj();
        akademija.odrziDodjelu();




















    }
}
