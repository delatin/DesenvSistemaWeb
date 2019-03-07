
public class Esfera extends TresDe {
	private double altura;
	private double raio;
	
	public Esfera (double altura, double raio) {
		
		this.altura = altura;
		this.raio = raio;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}

	
	@Override
	double volume() {
		// TODO Auto-generated method stub
		return 
				(4/3) * Math.PI *  Math.pow(getRaio(), 3);
	}
	
}
