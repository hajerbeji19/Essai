package tp2;
class Alphabet{
	String x;
	Alphabet(String x){
		this.x = x;
	}
	public void message() {
		switch(x) {
			case "a" ,"e", "i", "o", "u", "y": 
				System.out.println(x+" Voyelle");
				break ;
			default: 
				System.out.println(x+ " n est pas Voyelle");
		}
	}
}

public class TP2Ex3 {
	public static void main(String[] args) {
		Alphabet lettre1= new Alphabet("c");
		Alphabet lettre2= new Alphabet("a");
		System.out.println();
		lettre1.message();
		System.out.println();
		lettre2.message();
		
	}
}
