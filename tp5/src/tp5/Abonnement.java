package tp5;

public abstract class Abonnement {
	private String nom ; 
	private double prixBase;
	private int nbProfils;
	

	public Abonnement(String nom,double prixBase,int nbProfils) {
		this.nom = nom;
		if(prixBase <= 0) {
			this.prixBase = 50;
		}else {
			this.prixBase = prixBase;
		}
		if(nbProfils <= 0) {
			nbProfils = 1;
		}else {
			this.nbProfils = nbProfils;
		}
		
	}
	public String getNom() {
		return nom;
	}
	public double getPrixBase() {
		return prixBase;
	}
	public int getNbProfils() {
		return nbProfils;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setNbProfils(int nbProfils) {
		this.nbProfils = nbProfils;
	}
	public void setPrixBase(double prixBase) {
		this.prixBase = prixBase;
	}
	
	public boolean estPartagerFamilial() {
		return nbProfils >= 3;
	}
	public void afficherInfos() {
		System.out.println("Nom d'abonnement:" +nom);
		System.out.println("le prix de base:" +prixBase);
		System.out.println("le nombre de profils:" +nbProfils);
		System.out.println("le partage familiale:" +estPartagerFamilial());
	}
	public abstract double calculerCoutMensuel();
	public abstract int calculerScoreSatisfaction();
	

}
