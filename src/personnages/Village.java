package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	private Gaulois[] villageois;
	private int nbVillageoisMaximum;
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gaul) {
		villageois[nbVillageois+1] = gaul;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int nombrevillageois) {
		return villageois[nombrevillageois];
	}
	
	public static void main(String[] args) {
		Village village= new Village("Village des irréductible",30);
	}
	
	
	
}
