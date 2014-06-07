
public class TomadaDePrecos extends ModalidadeLicitacao{

	public TomadaDePrecos(){
		System.out.println("Foi criada uma licitacao na modalidade Tomada de Preços");
	}

	@Override
	public void setTipoLicitacao(String tipoLicitacao) {
		this.tipoLicitacao = tipoLicitacao;		
	}
}
