
public class Principal {

	public static void main( String args[] )
	{
		LicitacaoFactory licFactory = new LicitacaoFactory();
		String objetoLicitacao = "bens e serviços comuns";
		ModalidadeLicitacao licitacao = licFactory.criaLicitacao( objetoLicitacao, 2000000 );
		
		licitacao.setTipoLicitacao( "Tecnica e preco" );
		
		System.out.println( "O tipo de licitação é: " + licitacao.getTipoLicitacao() );
		
		Licitante licitante = new Licitante();
		
		licitante.setNomeLicitante( "Licitante numero 1" );
		
		licitacao.addLicitante( licitante );
		licitacao.printLicitantes();
	}
}
