#language: pt
Funcionalidade: Realizar Cotação do Seguro Veicular

Como um usuário 
Quero preencher um formulario de cotação veicular
Para que eu possa enviar a cotação de seguro com sucesso

Cenário: Deve realizar cotação de seguro automotivo com sucesso
	Dado que o usuario está na pagina do formulário de cotação do seguro automotivo
	Quando preenche o formulário Vehicle Data  
	E preenche o formulário Insurant Data  
	E preenche o formulário Product Data  
	E preenche o formulário Select Price Option
	E preenche o formulário Send Quote 
	E clica em enviar formulário
	Então verifica a mensagem “Sending e-mail success!” na tela