package fr.eni.film.filmo.bo;

public class AvisBo {

    private int id;
    private int note;

    private String commentaire;

    public AvisBo(){

    }
    public AvisBo(int id, int note, String commentaire) {
        super();
        this.id = id;
        this.note=note;
        this.commentaire=commentaire;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public String toString() {
        return "AvisBo{" +
                "note=" + note +
                ", commentaire='" + commentaire + '\'' +
                '}';
    }
}
