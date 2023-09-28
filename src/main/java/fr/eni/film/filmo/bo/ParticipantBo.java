package fr.eni.film.filmo.bo;

public class ParticipantBo {

    private int id;

    private String nom;
    private String prenom;

    public ParticipantBo(int id, String nom, String prenom) {
        super();
        this.id =id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public ParticipantBo(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
