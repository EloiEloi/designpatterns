package fr.diginamic.factory.model;

public abstract class ObjetConnecte {

	private int limiteVolts;

	/**
	 * Constructor
	 * 
	 * @param limiteVolts
	 */
	public ObjetConnecte(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	}

	public abstract void recharger(int tension);

	/**
	 * Getter
	 * 
	 * @return the limiteVolts
	 */
	public int getLimiteVolts() {
		return limiteVolts;
	}

	/**
	 * Setter
	 *
	 * @param limiteVolts
	 *            the limiteVolts to set
	 */
	public void setLimiteVolts(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	}

}
