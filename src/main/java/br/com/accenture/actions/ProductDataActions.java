package br.com.accenture.actions;

import br.com.accenture.pagesobject.ProductDataPage;
import br.com.accenture.utils.SuperClasse;

public class ProductDataActions extends SuperClasse {

	private ProductDataPage pg;

	public ProductDataActions() {
		pg = super.initElements(ProductDataPage.class);

	}
	
	public void preencheDataInicio(String nome) {
		preencheCampo(pg.START_DATE, nome);

	}
	
	public void selecionaSomaSeguro(String valor) {
		selecionaComboBox(pg.COMBO_INSURANCE_SUM, valor );
	}
	
	public void selecionaBonus(String bonus) {
		selecionaComboBox(pg.COMBO_MERIT_RATING, bonus);
	}

	public void selecionaCoberturaDanos(String cobertura) {
		selecionaComboBox(pg.COMBO_DAMAGE_INSURANCE, cobertura);
	}
	
	public void selecionaEuroProtection() {
		clique(pg.PRODUCT_EURO_PROTECTION);
		
	}
	
	public void selecionaLegalDefense() {
		clique(pg.PRODUCT_LEGAL_DEFENSE);
		
	}
	
	public void selecionaCarroCortesia(String carroCortersia) {
		selecionaComboBox(pg.COMBO_COURTESY_CAR, carroCortersia);
	}

	public void clicaAvancar() {
		clique(pg.BTN_NEXT);
	}
}
