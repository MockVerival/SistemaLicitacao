
public class Convite extends ModalidadeLicitacao{

	public Convite(){
		System.out.println( "Foi criada uma licitacao na modalidade Convite" );
	}

	@Override
	public void setTipoLicitacao(String tipoLicitacao) {
		this.tipoLicitacao = tipoLicitacao;		
	}
	
}
