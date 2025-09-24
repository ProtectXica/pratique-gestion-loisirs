package gestionloisirs;

public class Parc {
    private Abri abri;
    private Surveillant surveillant;
    private double superficie;
    private int heureEclairage;
    private boolean aFontaine;

    public Parc(Abri abri, Surveillant surveillant, double superficie, int heureEclairage, boolean aFontaine) {
        this.abri = abri;
        this.surveillant = surveillant;
        this.superficie = superficie;
        this.heureEclairage = heureEclairage;
        this.aFontaine = aFontaine;
    }
}
