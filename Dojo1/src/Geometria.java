//setar public static void main na hora de fazer a classe
import java.util.ArrayList;
public class Geometria {

	public static void main(String[] args) {
		/* nos new vai visar q tem dois construtores em falta
		dps é só dar CTRL + 1 que ele arruma desse jeito ai embaixo
		e então colocar os valores*/
		Circulo c1 = new Circulo(10);
		Triangulo t1 = new Triangulo(35, 62);
		Quadrado q1 = new Quadrado(10);
		Retangulo r1 = new Retangulo(7, 10);
		Trapezio tr1 = new Trapezio(3,2,4);

		ArrayList<DoisDe> dois = new ArrayList();
		//nao esquece de importar o ArrayList sua burra nos dois treco
		
		dois.add(c1);
		dois.add(t1);
		dois.add(q1);
		dois.add(r1);
		dois.add(tr1);
		for (DoisDe doisde : dois) { //este é um foreach
			System.out.println(doisde.area());
			System.out.println(doisde.perimetro());
		}
		
		ArrayList<TresDe> tres = new ArrayList();
		
		
		Cubo cu = new Cubo(2);
		Cilindro ci = new Cilindro (4,2);
		Esfera es = new Esfera (15,4);
		Piramide pi = new Piramide (2,8);
		
		tres.add(cu);
		tres.add(ci);
		tres.add(es);
		tres.add(pi);
		
		
		for (TresDe tresde : tres) {
			System.out.println("oi" + tresde.volume());
			
		}
	}

}
