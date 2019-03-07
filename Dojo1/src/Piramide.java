
public class Piramide extends TresDe {

	private double lado;
	private double base;
	public Piramide (double lado, double base) {
		this.lado = lado;
		this.base = base;
	}
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}

	@Override
	double volume() {
		// TODO Auto-generated method stub
		return 
				0.3 * getBase() * getLado();
	}
	
}
