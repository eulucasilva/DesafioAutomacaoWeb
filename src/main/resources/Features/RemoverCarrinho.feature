#language: pt
@RemoverCarrinho @End2End
Funcionalidade: Remover produto ao carrinho
	
	Contexto:
		Dado que o usuario esteja na pagina principal do sistema
		E que o usuario esteja logado no sistema
		E o produto esteja selecionado 
		Entao o sistema devera inserir o produto no carrinho
		
	@RemoverProdutoCatalogoCarrinho
	Esquema do Cenario: Remover produto do catalogo ao carrinho
		Quando o usuario estiver no carrinho
		E o usuario selecionar o produto "<produto>" e clicar para remover do carrinho 
		Entao o sistema devera excluir o produto no carrinho
		E redirecionar o usuario para o carrinho
	
	Exemplos: 
		|produto						 |
		|Sauce Labs Backpack |
		