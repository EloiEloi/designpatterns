package fr.diginamic.factory;

import fr.diginamic.factory.model.ObjetConnecte;

public class TestFactory {

	public static void main(String[] args) {

		ObjetConnecte objCon = new ObjetConnecteFactory().getObjetConnecte(2);
		objCon.recharger(20);
	}

}
