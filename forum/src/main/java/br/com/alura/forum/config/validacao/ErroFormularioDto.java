package br.com.alura.forum.config.validacao;

public class ErroFormularioDto {

	private String campo;
	private String messagem;
	
	public ErroFormularioDto(String campo, String messagem) {
		super();
		this.campo = campo;
		this.messagem = messagem;
	}
	
	public String getCampo() {
		return campo;
	}
	
	public String getMessagem() {
		return messagem;
	}
	
}
