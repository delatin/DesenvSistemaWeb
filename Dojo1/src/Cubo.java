
public class Cubo extends TresDe {

	private double lado;

	public Cubo (double lado) {
		this.lado = lado;
		
	}
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	double volume() {
		// TODO Auto-generated method stub
		return
				3*getLado();
	}

}
