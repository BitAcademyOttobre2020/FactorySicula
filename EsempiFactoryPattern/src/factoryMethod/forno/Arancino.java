package factoryMethod.forno;

public abstract class Arancino {
	private double peso;
	private double costo;
	
	public Arancino(double peso, double costo) {
		this.peso = peso;
		this.costo = costo;
	}
	public abstract void aggiungiSaporiLocali();
	void cuoci() {
		
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
}
