package Aula_28_08;

public class Lobo implements Animal  {
	
	
	@Override
	public void dormir() {
		System.out.println("dormindo");
	}
	
	@Override
	public void andar() {
		System.out.println("caminhar");
	}
	
	@Override
	public void correr() {
		System.out.println("correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Uivar");
	}
}
