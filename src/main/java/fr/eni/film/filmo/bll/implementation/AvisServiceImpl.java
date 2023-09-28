package fr.eni.film.filmo.bll.implementation;

import fr.eni.film.filmo.bll.AvisService;
import fr.eni.film.filmo.bll.Erreur.ErreurAvis;
import fr.eni.film.filmo.bo.AvisBo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AvisServiceImpl implements AvisService {
	private List<AvisBo> listeAvis;

	@Override
	public AvisBo avis(int avis) throws ErreurAvis {
		return null;
	}

	@Override
	public List<AvisBo> getListeAvis() {
		return listeAvis;
	}

	@Override
	public Map<Integer, AvisBo> getMapAvis() {
		return mapAvis;
	}

	private Map<Integer, AvisBo> mapAvis;

	public AvisServiceImpl() {
		listeAvis = new ArrayList<>();
		listeAvis.add(new AvisBo(1, 1, "Je suis la"));
		listeAvis.add(new AvisBo(2, 5, "Foret"));
		listeAvis.add(new AvisBo(3, 6, "Voie de l'eau"));

		mapAvis = new HashMap<Integer, AvisBo>();
		listeAvis.forEach(m -> mapAvis.put(Math.toIntExact(m.getId()), m));

	}

	@Override
	public AvisBo avis(int avis) throws ErreurAvis {
		// TODO Auto-generated method stub
		return null;
	}
}
