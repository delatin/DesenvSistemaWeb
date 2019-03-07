
public abstract class Poligono extends DoisDe {
private int  base;
private int altura;

//CTRL + SPACE abre uns negocios pra criar sozinho

public Poligono(int base, int altura) {
	this.base = base;
	this.altura = altura; 
}
@Override
double area() {
	// TODO Auto-generated method stub
	return 
	this.getBase()*this.getAltura();
	//não precisa do this, mas eu deixei
	//poligono é no minimo base * altura, por isso foi alocado aqui
}

public int getBase() {
	return base;
}


public void setBase(int base) {
	this.base = base;
}


public int getAltura() {
	return altura;
}


public void setAltura(int altura) {
	this.altura = altura;
}

}
