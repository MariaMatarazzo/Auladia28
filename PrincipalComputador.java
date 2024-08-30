package Aula_28_08;

public class PrincipalComputador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("///////// Computador Gamer //////////");
		Gamer gamer = new Gamer();
		gamer.carregandoSistema();
		gamer.reiniciar();
		gamer.ligar();
		gamer.desligar();
		
		
		System.out.println(" ");
		System.out.println("/////// Computador Gamer ////////");
		Home home = new Home();
		 home.carregandoSistema();
		 home.reiniciar();
		 home.ligar();
		 home.desligar();

	}

}
