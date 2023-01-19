#language: pt
@Logout @End2End
Funcionalidade: Logout

	Contexto:
		Dado que o usuario esteja na pagina principal do sistema
		E que o usuario esteja logado no sistema
	
	@RealizarLogout
	Cenario: Realizar Logout com Sucesso
		Quando o usuario clicar no menu ao lado
		E clicar na opcao logout
		Entao o sistema devera fazer logout
		
	