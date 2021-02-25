package br.com.accenture.actions;

import br.com.accenture.pagesobject.SendQuotePage;
import br.com.accenture.utils.SuperClasse;

public class SendQuoteActions extends SuperClasse{
	
	private SendQuotePage pg;

	public SendQuoteActions() {
		pg = super.initElements(SendQuotePage.class);

	}

	public void preencheEmail(String email) {
		preencheCampo(pg.EMAIL, email);
	}
	
	public void preencheTelefone(String telefone) {
		preencheCampo(pg.PHONE, telefone);
	}
	
	public void preencheUserName(String username) {
		preencheCampo(pg.USERNAME, username);
		
	}
	
	public void preencheSenha(String senha) {
		preencheCampo(pg.PASSWORD, senha);
		preencheCampo(pg.CONFIRM_PASSWORD, senha);
	}
	
	public void preencheComentario(String comentario) {
		preencheCampo(pg.COMMENTS, comentario);
	}
	
	public void clicaEnviar() {
		clique(pg.BTN_SEND);
	}
	
	public void validaMensagem(String msg) {
		pontoVerificacao(pg.MSG_SUCESSO, "innerText", msg);
	}
}
