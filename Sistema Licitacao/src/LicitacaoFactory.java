
public class LicitacaoFactory {

	private ModalidadeLicitacao licitacao;

	public ModalidadeLicitacao criaLicitacao( String tipoObjeto, float valorEstimado ){
		if( tipoObjeto.equalsIgnoreCase("Bens e Serviços comuns") ){
			this.licitacao = new PregaoEletronico();
		}
		else if( tipoObjeto.equalsIgnoreCase("Obras e serviços de engenharia") && valorEstimado >= 1500000  ){
			this.licitacao = new Concorrencia();
		}
		else if( tipoObjeto.equalsIgnoreCase("Obras e serviços de engenharia") && valorEstimado >= 150000 ){
			this.licitacao = new TomadaDePrecos();
		}
		else if( tipoObjeto.equalsIgnoreCase("Obras e serviços de engenharia") && valorEstimado < 150000 ){
			this.licitacao = new Convite();
		}
		else if( tipoObjeto.equalsIgnoreCase("Compras e outros serviços") && valorEstimado >= 650000 ){
			this.licitacao = new Concorrencia();
		}
		else if( tipoObjeto.equalsIgnoreCase("Compras e outros serviços") && valorEstimado >= 80000 ){
			this.licitacao = new TomadaDePrecos();
		}
		else if( tipoObjeto.equalsIgnoreCase("Compras e outros serviços") && valorEstimado < 80000 ){
			this.licitacao = new Convite();
		}

		return this.licitacao;
	}
}
