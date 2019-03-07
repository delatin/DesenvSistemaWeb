//deu um erro no triangulo e dei CTRL + 1 pra criar os negocios abaixo
public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(int lado) {
		super(lado, lado);
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
			4 * getBase() ; //usei o getBase para pegar do herdeiro poligono
	//n foi utilizado o super pois ele já faz parte da familia
	}

	
}
