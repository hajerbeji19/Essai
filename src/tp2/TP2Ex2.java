package tp2;

class Fabrication{
	double fab , vente;
	public Fabrication(double fab , double vente) {
		this.fab = fab;
		this.vente = vente;
	}
	public void message() {
		if(vente > fab ) {
			System.out.println("Profit");
		}
		else {
			System.out.println("Perte");
		}
	}
}
public class TP2Ex2 {
	public static void main(String[] args) {
		Fabrication fabri1 = new Fabrication(13 , 10);
		Fabrication fabri2 = new Fabrication(9 , 10);
		System.out.println("");
		fabri1.message();
		System.out.println("");
		fabri2.message();
	}
}
