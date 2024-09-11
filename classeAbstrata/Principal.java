package classeAbstrata;

public class Principal {

	public static void main(String[] args) {
		Carro ferrari = new Carro("00000", "F1", "Vermelho", 2023 );
		Carro fox = new Carro("22222", "Run", "Branco", 2023 );
		
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		
		System.out.println("----------------------------");
		
		fox.ligar();
		fox.acelerar();
		fox.virar();
		fox.frear();
		
		System.out.println("----------------------------");
		
		Onibus marcopolo = new Onibus("11111", "XB1", "Prata", 2020);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();
	}
}
