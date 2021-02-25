package br.com.accenture.steps;

import br.com.accenture.actions.InsurantDataActions;
import br.com.accenture.actions.ProductDataActions;
import br.com.accenture.actions.SelectPriceOptionActions;
import br.com.accenture.actions.SendQuoteActions;
import br.com.accenture.actions.VehicleDataActions;
import br.com.accenture.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class FormularioCotacaoStep {

	public VehicleDataActions actVechicle;
	public InsurantDataActions actInsurant;
	public ProductDataActions actProdData;
	public SelectPriceOptionActions actPriceOptions;
	public SendQuoteActions actSendQuote;

	@Before
	public void init() {
		actVechicle = new VehicleDataActions();
		actInsurant = new InsurantDataActions();
		actProdData = new ProductDataActions();
		actPriceOptions = new SelectPriceOptionActions();
		actSendQuote = new SendQuoteActions();
	}

	@After
	public static void tearDownClass() {
		DriverManager.quitDriver();
		DriverManager.encerraProcessos();

	}

	@Dado("que o usuario está na pagina do formulário de cotação do seguro automotivo")
	public void que_o_usuario_está_na_pagina_do_formulário_de_cotação_do_seguro_automotivo() {
		actVechicle.validaPaginaInicial("Automobile Insurance");
	}

	@Quando("preenche o formulário Vehicle Data")
	public void preenche_o_formulário_vehicle_data() {
		actVechicle.selecionaMarca("Volkswagen");
		actVechicle.preencherDesempenho("30");
		actVechicle.preencheDtFabricacao("02/23/2020");
		actVechicle.selecionaQtdAssentos("3");
		actVechicle.selecionaTpCombustivel("Diesel");
		actVechicle.preencheValor("5000");
		actVechicle.preencheNumMatricula("12345");
		actVechicle.preencheKMAnual("100");
		actVechicle.clicaAvancar();
	}

	@Quando("preenche o formulário Insurant Data")
	public void preencheOFormulárioInsurantData() {
		actInsurant.preencheNome("Carlos");
		actInsurant.preencheSobrenome("Silva");
		actInsurant.preencheNascimento("02/03/1980");
		actInsurant.selecionaGeneroMasculino();
		actInsurant.preencheEndereco("CNB 1 Taguatinga");
		actInsurant.selecionaPais("Brazil");
		actInsurant.preencheCEP("11111111");
		actInsurant.preencheCidade("Taguatinga");
		actInsurant.preencheOcupacao("Employee");
		actInsurant.HobbieBungeeJumpin();
		actInsurant.HobbieOther();
		actInsurant.preencheWebsite("carlos.facebook.com");
		actInsurant.selecionaImagem("jon.jpg");
		actInsurant.clicaAvancar();

	}

	@Quando("preenche o formulário Product Data")
	public void preencheOFormulárioProductData() {
		actProdData.preencheDataInicio("12/01/2022");
		actProdData.selecionaSomaSeguro("7.000.000,00");
		actProdData.selecionaBonus("Bonus 5");
		actProdData.selecionaCoberturaDanos("Full Coverage");
		actProdData.selecionaEuroProtection();
		actProdData.selecionaCarroCortesia("Yes");
		actProdData.clicaAvancar();

	}

	@Quando("preenche o formulário Select Price Option")
	public void preencheoFormulárioSelectPriceOption() {
		actPriceOptions.selecionaOptionPlatium();
		actPriceOptions.clicaAvancar();
	}

	@Quando("preenche o formulário Send Quote")
	public void preencheOFormulárioSendQuote() {
		actSendQuote.preencheEmail("teste@teste.com");
		actSendQuote.preencheTelefone("222222222");
		actSendQuote.preencheUserName("teste");
		actSendQuote.preencheSenha("Teste1");
		actSendQuote.preencheComentario("teste automatizado");
	}

	@Quando("clica em enviar formulário")
	public void clicaEmEnviarFormulário() {
		actSendQuote.clicaEnviar();
	}

	@Então("verifica a mensagem “Sending e-mail success!” na tela")
	public void verificaAmensagem_sending_e_mail_success_na_tela() {
		actSendQuote.validaMensagem("Sending e-mail success!");

	}

}
