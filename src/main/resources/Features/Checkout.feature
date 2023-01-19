#language: pt
@Checkout @End2End
Funcionalidade: Checkout
	
	Contexto: 
		Dado que o usuario esteja na pagina principal do sistema
		E que o usuario esteja logado no sistema
		E redirecionar o usuario para o carrinho
		
	@RealizarCheckout
	Esquema do Cenario: Finalizar Compra
		Quando o usuario clicar no botao checkout
		E inserir o nome "<nome>", sobrenome "<sobrenome>" e CEP "<cep>"
		E clicar no botao Continuar
		E clicar no botao Finalizar
		Entao o sistema finaliza a compra
		
	Exemplos:
	|nome |sobrenome|cep     |
	|Lucas|Silva    |45200000| 
