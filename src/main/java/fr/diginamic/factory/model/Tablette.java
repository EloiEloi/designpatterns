package fr.diginamic.factory.model;

public class Tablette extends ObjetConnecte {

	public Tablette() {
		super(20);
	}

	@Override
	public void recharger(int tension) {
		if (tension > getLimiteVolts()) {
			System.out.println("Tablette grillé");
		} else if (tension < getLimiteVolts()) {
			System.out.println("tension insuffisante pour la charge ");
		} else if (tension == getLimiteVolts()) {
			System.out.println("Tablette portable en charge");
		}

	}

}
