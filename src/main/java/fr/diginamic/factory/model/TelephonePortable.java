package fr.diginamic.factory.model;

public class TelephonePortable extends ObjetConnecte {

	public TelephonePortable() {
		super(10);
	}

	@Override
	public void recharger(int tension) {

		if (tension > getLimiteVolts()) {
			System.out.println("telephone portable grillé");
		} else if (tension < getLimiteVolts()) {
			System.out.println("tension insuffisante pour la charge ");
		} else if (tension == getLimiteVolts()) {
			System.out.println("telephone portable en charge");
		}

	}

}
