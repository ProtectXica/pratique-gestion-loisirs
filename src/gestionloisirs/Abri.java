package gestionloisirs;

public class Abri {
    private int heuresOuverture;
    private int heuresFermeture;
    private int nbToilettes;
    private String identifiant;

    private static int nbAbri = 0;

    public Abri(int heuresOuverture, int heuresFermeture, int nbToilettes) {
        nbAbri++;
        this.heuresOuverture = heuresOuverture;
        this.heuresFermeture = heuresFermeture;
        this.nbToilettes = nbToilettes;
        setIdentifiant();
    }

    public int getHeuresOuverture() {
        return heuresOuverture;
    }

    public int getHeuresFermeture() {
        return heuresFermeture;
    }

    public int getNbToilettes() {
        return nbToilettes;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setHeuresOuverture(int heuresOuverture) {
        this.heuresOuverture = heuresOuverture;
    }

    public void setHeuresFermeture(int heuresFermeture) {
        this.heuresFermeture = heuresFermeture;
    }

    public void setNbToilettes(int nbToilettes) {
        this.nbToilettes = nbToilettes;
    }

    private void setIdentifiant() {
        this.identifiant = "ABRI" + nbAbri;
    }
}
