package fr.diginamic.factory;

import fr.diginamic.factory.model.EnceinteConnectee;
import fr.diginamic.factory.model.ObjetConnecte;
import fr.diginamic.factory.model.Tablette;
import fr.diginamic.factory.model.TelephonePortable;

public class ObjetConnecteFactory {

	public static ObjetConnecte getObjetConnecte(int type) {

		if (type == 1) {

			return new TelephonePortable();

		} else if (type == 2) {

			return new Tablette();

		} else if (type == 3) {
			return new EnceinteConnectee();
		}

		return null;

	}

}
