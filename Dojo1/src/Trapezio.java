
public class Trapezio extends DoisDe {

	private double basesinha;
	private double basesao;
	private double altura;
	
	public Trapezio (double basesinha, double basesao, double altura) {
		this.basesinha = basesinha;
		this.basesao = basesao;
		this.altura = altura;
	}

	public double getBasesinha() {
		return basesinha;
	}

	public void setBasesinha(double basesinha) {
		this.basesinha = basesinha;
	}

	public double getBasesao() {
		return basesao;
	}

	public void setBasesao(double basesao) {
		this.basesao = basesao;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return
				((getBasesinha() + getBasesao()) * altura) 	/ 2;
	}
	
}
