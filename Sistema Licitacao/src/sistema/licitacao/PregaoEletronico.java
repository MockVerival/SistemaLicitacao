package sistema.licitacao;

public class PregaoEletronico extends ModalidadeLicitacao {

	public PregaoEletronico(){
		System.out.println( "Foi criada uma licitação na modalidade Pregão Eletrônico" );
	}

	@Override
	public void setTipoLicitacao(String tipoLicitacao) {
		this.tipoLicitacao = "Menor preço";		
	}
}
