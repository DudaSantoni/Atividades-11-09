package animais;

public class Tigre extends Animal{
	public Tigre(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	
	@Override
	public void dormir() {
		System.out.println("O tigre está dormindo");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O tigre está caminhando.");
	}
	
	@Override
	public void correr() {
		System.out.println("O tigre está correndo.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O leão está rugindo.");
	}
}
