package br.com.accenture.actions;

import br.com.accenture.pagesobject.InsurantDataPage;
import br.com.accenture.utils.SuperClasse;

public class InsurantDataActions extends SuperClasse {

	private InsurantDataPage pg;

	public InsurantDataActions() {
		pg = super.initElements(InsurantDataPage.class);

	}

	public void preencheNome(String nome) {
		preencheCampo(pg.FIRST_NAME, nome);

	}

	public void preencheSobrenome(String sobrenome) {
		preencheCampo(pg.LAST_NAME, sobrenome);

	}

	public void preencheNascimento(String DtNascimento) {
		preencheCampo(pg.DATE_OF_BIRTH, DtNascimento);

	}

	public void selecionaGeneroFeminino() {
		clique(pg.GENDER_FEMALE);
	}

	public void selecionaGeneroMasculino() {
		clique(pg.GENDER_MALE);
	}

	public void preencheEndereco(String endereco) {
		preencheCampo(pg.STREET_ADDRESS, endereco);
	}

	public void selecionaPais(String pais) {
		selecionaComboBox(pg.COUNTRY, pais);
	}

	public void preencheCEP(String cep) {
		preencheCampo(pg.ZIP_CODE, cep);
	}

	public void preencheCidade(String cidade) {
		preencheCampo(pg.CITY, cidade);
	}

	public void preencheOcupacao(String ocupacao) {
		selecionaComboBox(pg.OCCUPATION, ocupacao);
	}

	public void HobbieSpeeding() {
		clique(pg.HOBBIE_SPEEDING);
	}

	public void HobbieBungeeJumpin() {
		clique(pg.HOBBIE_BUNGEEJUMPING);
	}

	public void HobbieCliffDiving() {
		clique(pg.HOBBIE_CLIFFDIVING);
	}

	public void HobbieSkydiving() {
		clique(pg.HOBBIE_SKYDIVING);
	}

	public void HobbieOther() {
		clique(pg.HOBBIE_OTHER);
	}

	public void preencheWebsite(String website) {
		preencheCampo(pg.WEBSITE, website);
	}

	public void selecionaImagem(String picture) {
		uploadArquivo(pg.PICTURE, picture);
	}
	
	public void clicaAvancar() {
		clique(pg.BTN_NEXT);
	}
	
}
