
package tp5;
public class AbonnementVideo extends Abonnement  implements Reducible{
    protected boolean optionHD;
    protected boolean option4K;

    public AbonnementVideo(String nom, double prixBase, int nbProfils, boolean optionHD, boolean option4K) {
        super(nom, prixBase, nbProfils);
        this.optionHD = optionHD;
        this.option4K = option4K;
    }

    public double calculerCoutMensuel() {
        double cout = getPrixBase();
        if (optionHD) {
            cout += 10;
        }
        if (option4K) {
            cout += 20;
        }
        return cout;
    }

    public int calculerScoreSatisfaction() {
        int score = 60;
        if (optionHD) {
            score += 10;
        }
        if (option4K) {
            score += 20;
        }
        if (getNbProfils() >= 4) {
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