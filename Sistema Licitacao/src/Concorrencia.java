
public class Concorrencia extends ModalidadeLicitacao{

	public Concorrencia(){
		System.out.println("Foi criada uma licitação na modalidade Concorrencia" );
	}

	@Override
	public void setTipoLicitacao(String tipoLicitacao) {
		this.tipoLicitacao = tipoLicitacao;
	}
}
