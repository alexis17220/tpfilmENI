package fr.eni.film.filmo.repository;
import fr.eni.film.filmo.bo.FilmBo;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FilmRepo extends JpaRepository<FilmBo, Long>{
    public FilmBo findByTitleOrderByTitleDesc(String title);

}
