package tp5;

public class AbonnementJeux extends Abonnement{

	protected int nbJeuxInclus;
    protected int heuresJeuParMois;

    public AbonnementJeux(String nom, double prixBase, int nbProfils, int nbJeuxInclus, int heuresJeuParMois) {
        super(nom, prixBase, nbProfils);
        this.nbJeuxInclus = nbJeuxInclus;
        this.heuresJeuParMois = heuresJeuParMois;
    }
    
    public double calculerCoutMensuel() {
        double cout = getPrixBase();
        if (nbJeuxInclus > 50) {
            cout += 25;
        }
        if (heuresJeuParMois > 40) {
            cout += 15;
        }
        return cout;
    }
    
    public int calculerScoreSatisfaction() {
        int score = 40;
        if (nbJeuxInclus >= 30) {
            score += 20;
        }
        if (heuresJeuParMois >= 20) {
            score += 20;
        }
        if (getNbProfils() >= 2) {
            score += 10;
        }
        if (score > 100) {
            score = 100;
        }
        return score;
    }

}
