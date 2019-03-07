
public class Circulo extends DoisDe {
//CTRL + 1 exibe uma janelinha de como solucionar o erro
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
		
	}
	

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return
				(Math.PI * Math.pow(getRaio(), 2));
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return
				2 * Math.PI * raio;
	}

}
