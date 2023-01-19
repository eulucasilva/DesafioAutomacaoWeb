#language: pt
@OrdenarProdutos @End2End
Funcionalidade: Ordenar produtos

	Contexto: 
		Dado que o usuario esteja na pagina principal do sistema
		E que o usuario esteja logado no sistema 
		
	Esquema do Cenario:
		Quando o usuario selecionar a opcao "<opcao>"
		Entao o sistema deve ordenar os produtos
	Exemplos:
	|opcao         			|
	|Price (high to low)|