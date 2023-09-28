package fr.eni.film.filmo.bo;

public class GenreBo {

    private Integer id;

    private String libelle;


    public GenreBo(int id, String libelle){
        super();
        this.id = id;
        this.libelle = libelle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }



    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "GenreBo{" +
                "libelle='" + libelle + '\'' +
                '}';
    }
}
