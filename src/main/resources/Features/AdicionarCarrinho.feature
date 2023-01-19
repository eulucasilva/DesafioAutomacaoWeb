#language: pt
@AdicionarCarrinho @End2End
Funcionalidade: Adicionar produto ao carrinho
	
	Contexto:
		Dado que o usuario esteja na pagina principal do sistema
		E que o usuario esteja logado no sistema
		
	@AdicionarProdutoCatalogoCarrinho
	Esquema do Cenario: Adicionar produto do catalogo ao carrinho
		Quando o usuario selecionar o produto "<produto>" e clicar para adicionar ao carrinho 
		Entao o sistema devera inserir o produto no carrinho
		E redirecionar o usuario para o carrinho
	Exemplos: 
		|produto						|
		|Sauce Labs Backpack|
		
		
#	@RemoverProdutoCarrinho
#	Cenario: Remover produto ao carrinho
#		Quando o usuario selecionar o produto
#		E clicar para remover do carrinho 
#		Entao o sistema devera excluir o produto ao carrinho