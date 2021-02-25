package br.com.accenture.actions;

import br.com.accenture.pagesobject.VehicleDataPage;
import br.com.accenture.utils.SuperClasse;

public class VehicleDataActions extends SuperClasse {

	private VehicleDataPage pg;

	public VehicleDataActions() {
		pg = super.initElements(VehicleDataPage.class);
	}

	public void validaPaginaInicial(String label) {
		clique(pg.LINK_AUTOMOBILE);
		pontoVerificacao(pg.LABEL_AUTOMOBILE_INSURANCE, "innerText", label);
	}

	public void selecionaMarca(String marca) {
		selecionaComboBox(pg.COMBO_MAKE, marca);

	}

	public void preencherDesempenho(String desempenho) {
		preencheCampo(pg.ENGINE_PERFORMANCE, desempenho);
	}

	public void preencheDtFabricacao(String data) {
		preencheCampo(pg.DATE_OF_MANUFACTURE, data);
	}

	public void selecionaQtdAssentos(String qtd) {
		selecionaComboBox(pg.COMBO_NUMBER_SEATS, qtd);
	}
	

	public void selecionaTpCombustivel(String tipo) {
		selecionaComboBox(pg.COMBO_FUEL_TYPE, tipo);
	}
	

	public void preencheValor(String valor) {
		preencheCampo(pg.LIST_PRICE, valor);
	}

	public void preencheNumMatricula(String matricula) {
		preencheCampo(pg.LICENSE_PLATE_NUMBER, matricula);
	}

	public void preencheKMAnual(String km) {
		preencheCampo(pg.ANNUAL_MILEAGE, km);
	}

	public void clicaAvancar() {
		clique(pg.BTN_NEXT);
	}
}
