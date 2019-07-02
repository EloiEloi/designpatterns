package fr.diginamic.factory;

public enum EnumerationType {

	TELEPHONE_PORTABLE(1), TABLETTE(2), ENCEINTE_CONNECTEE(3);

	private int modelType;

	private EnumerationType(int modelType) {
		this.modelType = modelType;
	}

	public int getType() {
		return modelType;
	}
}
