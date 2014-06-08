import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public abstract class ModalidadeLicitacao {

	//attributes
	protected String nomeLicitacao = "licatacao sem nome";
	protected String tipoLicitacao = "licitacao sem tipo";
	protected Objeto objetoLicitaçao;
	protected Float valorEstimadoLicitacao;
	protected int numeroLicitacao;
	protected int anoLicitacao;
	protected String faseLicitacao;
	private Random geradorNroLicitacao = new Random();
	
	
	public int getNumeroLicitacao() {
		return numeroLicitacao;
	}

	public void setNumeroLicitacao() {
		this.numeroLicitacao = geradorNroLicitacao.nextInt();
	}

	public int getAnoLicitacao() {
		return anoLicitacao;
	}

	public void setAnoLicitacao(int anoLicitacao) {
		this.anoLicitacao = anoLicitacao;
	}

	protected List<Licitante> licitantes = new ArrayList<Licitante>();
	
	//getters and setters
	public String getNomeLicitacao() {
		return this.nomeLicitacao;
	}
	
	public void setNomeLicitacao( String nome ) {
		this.nomeLicitacao = nome;
	}
	
	public String getTipoLicitacao() {
		return tipoLicitacao;
	}
	
	abstract public void setTipoLicitacao(String tipoLicitacao);
	
	public Objeto getObjetoLicitaçao() {
		return objetoLicitaçao;
	}
	
	public void setObjetoLicitaçao(Objeto objetoLicitaçao) {
		this.objetoLicitaçao = objetoLicitaçao;
	}
	
	public Float getValorEstimadoLicitacao() {
		return valorEstimadoLicitacao;
	}
	
	public void setValorEstimadoLicitacao(Float valorEstimadoLicitacao) {
		this.valorEstimadoLicitacao = valorEstimadoLicitacao;
	}
	
	public void addLicitante( Licitante licitante ){
		this.licitantes.add( licitante );
		
		Licitante novoLicitante = licitante;
		novoLicitante.addLicitacao( this );
	}
	
	public void printLicitantes(){
		for( Licitante licitante : licitantes ){
			System.out.println( "Nome licitante: " + licitante.getNomeLicitante() );
		}
	}
}
