package ZadatakOskar;

public enum Pol {
    MUSKI,ZENSKI;

    public String toString(){
        switch (this){
            case ZENSKI: return "Zenski";
            case MUSKI: return "Muski";
            default: return "Neodredjen pol";
        }
    }
}
