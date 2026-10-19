package entreprise;

public class Mission {
    public Employe employe ;
    public Projet projet ;
    public int nbJours;
    
    public Mission(Employe employe, Projet projet, int nbJours) {
    	this.employe=employe ;
    	this. projet=projet ;
        this.nbJours = nbJours;
    }
    
    public double calculerMontant() {
        return Employe.calculerCout(nbJours);
    }

    public void afficherRecapitulatif() {
        System.out.println("Client : " + projet);
        System.out.println("Projet code : " + employe.nom);
        System.out.println("intitule: " + employe.matricule);
        System.out.println("Duree : " + nbJours);

    }
}
