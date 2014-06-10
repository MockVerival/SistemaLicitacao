package sistema.licitacao;

public class Leilao extends ModalidadeLicitacao{

	public Leilao()
	{
		System.out.println("Foi criada uma licitacao na modalidade Leilao");
	}
	
	@Override
	public void setTipoLicitacao(String tipoLicitacao) {
		this.tipoLicitacao = "Maior preço";
	}

}
