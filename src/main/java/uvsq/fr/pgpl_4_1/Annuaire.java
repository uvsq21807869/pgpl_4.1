package uvsq.fr.pgpl_4_1;

import java.util.Iterator;
import java.util.List;

public class Annuaire implements Iterable<Team>{

	private static Annuaire ANNUAIRE;
	public List<Team> annuaire; 
	private TeamIterator<Team> head;

	
	private Annuaire() {
		head = new TeamIterator<Team>();
		
	}

	public static Annuaire getInstance() {

		if (ANNUAIRE == null)
			ANNUAIRE = new Annuaire();

		return ANNUAIRE;
	}
	
	public void addEquipe(Team t) {

		this.head.add(t);
		
	}

	@Override
	public Iterator<Team> iterator() {
		// TODO Auto-generated method stub
		return this.head;
	}

}
