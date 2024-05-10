package desafioIphone;

public class Usuario {

	public static void main(String[] args) {

		Iphone usarIphone = new Iphone();

		System.out.println("******* Iniciando chamada *******\n");
		usarIphone.ligar();
		usarIphone.atender();
		usarIphone.iniciarCorreioDeVoz();
		System.out.println("\n******* Chamada finalizada! *******\n");

		System.out.println("\n******* Iniciando navegação *******\n");
		usarIphone.exibirPagina();
		usarIphone.exibirNovaPagina();
		usarIphone.atualizarPagina();
		System.out.println("\n******* Navegação finalizada! *******\n");

		System.out.println("\n******* Iniciando reprodução musical *******\n");
		usarIphone.tocarMusica();
		usarIphone.pausarMusica();
		usarIphone.selecionarMusica();
		System.out.println("\n******* Finalizando reprodução musical! *******\n");

	}

}
