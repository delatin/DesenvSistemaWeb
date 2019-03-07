//deu um erro no triangulo e dei CTRL + 1 pra criar os negocios abaixo
public class Retangulo extends Poligono implements Diagonal {

	public Retangulo(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculaDiagonal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return
		(2*getBase())+(2*getAltura());
	}

	
}
