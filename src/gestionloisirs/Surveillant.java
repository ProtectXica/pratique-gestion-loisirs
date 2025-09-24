package gestionloisirs;

public class Surveillant {
    private String nom;
    private String prenom;
    private int anciennete;
    private double tauxHoraire;

    private final static double tauxHoraireBase = 17;
    private final static double augmentationProportionnelleAnciennete = 1.25;
    private final static int maxAnnee = 12;

    public Surveillant(String nom, String prenom, int anciennete) {
        this.nom = nom;
        this.prenom = prenom;
        this.anciennete = anciennete;
        setTauxHoraire();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAnciennete() {
        return anciennete;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAnciennete(int anciennete) {
        this.anciennete = anciennete;
    }

    private void setTauxHoraire() {
        int ancienneteAjuste = Math.min(anciennete, 12);                    // Math.min prend le minimum

        this.tauxHoraire = tauxHoraireBase + (ancienneteAjuste * augmentationProportionnelleAnciennete);
    }
}
