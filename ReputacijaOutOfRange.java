package ZadatakOskar;

public class ReputacijaOutOfRange extends Throwable {
    public ReputacijaOutOfRange(){
        System.out.println("Reputacija ne smije biti veca od 100...");
    }
}
