package tp5;

public class TestAbonnements {

	public static void main(String[] args) {
       
        Abonnement[] abonnements = new Abonnement[3];

        
        AbonnementVideo video = new AbonnementVideo("Netflix", 50.0, 4, true, false);
        AbonnementMusique musique = new AbonnementMusique("Spotify", 30.0, 2, 25, true);
        AbonnementJeux jeux = new AbonnementJeux("Game", 40.0, 1, 60, 50);

        abonnements[0] = video;
        abonnements[1] = musique;
        abonnements[2] = jeux;
        
    
        System.out.println("Affichage des abonnements");
        for (Abonnement a : abonnements) {
            a.afficherInfos();
            System.out.println("Coût mensuel : " + a.calculerCoutMensuel() + " DH");
            System.out.println("Score de satisfaction : " + a.calculerScoreSatisfaction());
        }
        
        Reducible[] reducibles = new Reducible[2];
        reducibles[0] = video;
        reducibles[1] = musique;
        
        // Réduction 20%
        System.out.println("Réduction 20% sur Netflix : " + video.appliquerReduction(20) + " DH");
        System.out.println("Réduction 20% sur Spotify : " + musique.appliquerReduction(20) + " DH");

        // Réduction 50% (non autorisée, >30%)
        System.out.println("Réduction 50% sur Netflix : " + video.appliquerReduction(50) + " DH");
        System.out.println("Réduction 50% sur Spotify : " + musique.appliquerReduction(50) + " DH");
    }

}