
public class Principal {

	public static void main( String args[] )
	{
		//criacao dos objetos
		LicitacaoFactory licFactory = new LicitacaoFactory();
		String objetoLicitacao = "bens e serviços comuns";
		String objetoLicitacao1 = "obras e serviços de engenharia";
		ModalidadeLicitacao licitacao1 = licFactory.criaLicitacao( objetoLicitacao, 2000000 );
		ModalidadeLicitacao licitacao2 = licFactory.criaLicitacao( objetoLicitacao1, 200000 );
		
		//atribuiçao de valores para atributos dos objetos
		licitacao1.setTipoLicitacao( "Tecnica e preco" );
		licitacao1.setNomeLicitacao( "Primeira licitaçao do ano" );
		licitacao2.setTipoLicitacao( "Tecnica e preço" );
		licitacao2.setNomeLicitacao( "Segunda licitaçao do ano" );
		
		//verificao do tipo de licitacao
		System.out.println( "O tipo de licitação1 é: " + licitacao1.getTipoLicitacao() );
		System.out.println( "O tipo de licitação2 é: " + licitacao2.getTipoLicitacao() );
		
		//criacao de licitantes para cadastrar nas licitaçoes
		Licitante licitante1 = new Licitante();
		Licitante licitante2 = new Licitante();
		
		licitante1.setNomeLicitante( "Licitante numero 1" );
		licitante2.setNomeLicitante( "Licitante numero 2" );
		
		//inscrevendo licitante nas licitaçoes
		//Obs: deve-se usar addLicitante de uma instancia de ModalidadeLicitacao
		//Obs: o método addLicitacao da classe Licitante é chamado por addLicitante.
		licitacao1.addLicitante( licitante1 );
		licitacao1.addLicitante( licitante2 );
		licitacao2.addLicitante( licitante2 );
		
		System.out.println("Licitantes cadastrados na licitacao1: ");
		licitacao1.printLicitantes();
				
		System.out.println("Licitantes cadastrados na licitacao2: ");
		licitacao2.printLicitantes();
		
		System.out.println("licitante1: ");
		licitante1.printLicitacoes();
		System.out.println("licitante2: ");
		licitante2.printLicitacoes();
	}
}
