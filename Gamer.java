package Aula_28_08;

public class Gamer implements Computador {

	@Override
	public void ligar() {
		System.out.println("Ligando");
	}

	@Override
	public void desligar() {
		System.out.println("desligando");
	}

	@Override
	public void reiniciar() {
		System.out.println("reiniciando");
	}

	@Override
	public void carregandoSistema() {
		System.out.println("carregando Sistema");

	}


}
