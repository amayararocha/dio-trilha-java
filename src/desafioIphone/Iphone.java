package desafioIphone;

public class Iphone implements aparelhoTelefonico, navegadorInternet, reprodutorMusical{

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página Web...");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página Web...");
	}

	@Override
	public void exibirNovaPagina() {
		System.out.println("Exibindo nova página Web...");
	}

	@Override
	public void ligar() {
		System.out.println("Fazendo chamada pelo Iphone...");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada pelo Iphone...");
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Correio de voz iniciado...");
	}

	@Override
	public void tocarMusica() {
		System.out.println("Tocando música...");
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando a música...");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música...");
	}

}
