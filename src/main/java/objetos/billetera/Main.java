package objetos.billetera;

public class Main {

	public static void main(String[] args) {
		
		Billetera billetera = new Billetera();

		System.out.println(billetera.getSaldo());
		
		billetera.poner(1);
		
		System.out.println(billetera.getSaldo());
		
	}

}
