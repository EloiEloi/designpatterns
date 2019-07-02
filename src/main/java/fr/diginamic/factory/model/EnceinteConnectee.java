package fr.diginamic.factory.model;

public class EnceinteConnectee extends ObjetConnecte {

	public EnceinteConnectee() {
		super(30);
	}

	@Override
	public void recharger(int tension) {
		if (tension > getLimiteVolts()) {
			System.out.println("Enceinte connectée grillé");
		} else if (tension < getLimiteVolts()) {
			System.out.println("tension insuffisante pour la charge ");
		} else if (tension == getLimiteVolts()) {
			System.out.println("Enceinte connectée  en charge");
		}

	}

}
