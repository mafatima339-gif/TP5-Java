package tp5;

public class AbonnementMusique extends Abonnement implements Reducible {

	protected int nbPlaylists;
    protected boolean optionOffline;

    public AbonnementMusique(String nom, double prixBase, int nbProfils, int nbPlaylists, boolean optionOffline) {
        super(nom, prixBase, nbProfils);
        this.nbPlaylists = nbPlaylists;
        this.optionOffline = optionOffline;
    }
    
    public double calculerCoutMensuel() {
        double cout = getPrixBase();
        if (optionOffline) {
            cout += 15;
        }
        return cout;
    }
    public int calculerScoreSatisfaction() {
        int score = 50;
        if (nbPlaylists > 20) {
            score += 20;
        }
        if (optionOffline) {
            score += 20;
        }
        if (getNbProfils() > 1) {
            score += 10;
        }
        if (score > 100) {
            score = 100;
        }
        return score;
    }
    
    public double appliquerReduction(double pourcentage) {
        if (estEligibleReduction(pourcentage)) {
            double cout = calculerCoutMensuel();
            return cout * (1 - pourcentage / 100.0);
        } else {
            System.out.println("Réduction non autorisée >30% pour " + getNom());
            return calculerCoutMensuel(); 
        }
    }
    
    public boolean estEligibleReduction(double pourcentage) {
        return pourcentage <= 30;
    }

}
