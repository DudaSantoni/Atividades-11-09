package animais;

public class Principal {

	public static void main(String[] args) {
		Lobo lobo = new Lobo("Lobo Mau", "Masculino", "Cinzento");
		Leao leao = new Leao("Mufasa", "Masculino", "Leão Africano");
		Tigre tigre = new Tigre("Rajah", "Masculino", "Tigre-de-bengala");
		Cachorro cachorro = new Cachorro("Thor", "Masculino", "Shitzu");
		Gato gato = new Gato("Aiko", "Feminino", "Persa");

		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();

		System.out.println("----------------------------");

		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();

		System.out.println("----------------------------");

		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();

		System.out.println("----------------------------");

		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.emitirSom();

		System.out.println("----------------------------");

		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();
	}

}
