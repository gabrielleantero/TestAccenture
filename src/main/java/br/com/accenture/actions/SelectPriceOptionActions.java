package br.com.accenture.actions;

import br.com.accenture.pagesobject.SelectPriceOptionPage;
import br.com.accenture.utils.SuperClasse;

public class SelectPriceOptionActions extends SuperClasse {
	
	private SelectPriceOptionPage pg;

	public SelectPriceOptionActions() {
		pg = super.initElements(SelectPriceOptionPage.class);

	}
	
	public void selecionaOptionSilver() {
		clique(pg.OPTION_SILVER);
	}
	
	public void selecionaOptionGold() {
		clique(pg.OPTION_GOLD);
	}
	
	public void selecionaOptionPlatium() {
		clique(pg.OPTION_PLATINUM);
	}
	
	public void selecionaOptionUltimate() {
		clique(pg.OPTION_ULTIMATE);
	}
	
	public void clicaAvancar() {
		clique(pg.BTN_NEXT);
	}

}
