package sistema.licitacao;
import java.util.List;
import java.util.ArrayList;

public class Licitante {

	private String nomeLicitante;
	private String cnpjLicitante;
	private String enderecoLicitante;
	private String telefoneLicitante;
	private String emailLicitante;
	private String ramoLicitante;
	private List<ModalidadeLicitacao> licitacoes = new ArrayList<ModalidadeLicitacao>();
	
	public String getEmailLicitante() {
		return emailLicitante;
	}
	public void setEmailLicitante(String emailLicitante) {
		this.emailLicitante = emailLicitante;
	}
	public String getRamoLicitante() {
		return ramoLicitante;
	}
	public void setRamoLicitante(String ramoLicitante) {
		this.ramoLicitante = ramoLicitante;
	}

	public String getNomeLicitante() {
		return nomeLicitante;
	}
	public void setNomeLicitante(String nomeLicitante) {
		this.nomeLicitante = nomeLicitante;
	}
	public String getCnpjLicitante() {
		return cnpjLicitante;
	}
	public void setCnpjLicitante(String cnpjLicitante) {
		this.cnpjLicitante = cnpjLicitante;
	}
	public String getEnderecoLicitante() {
		return enderecoLicitante;
	}
	public void setEnderecoLicitante(String enderecoLicitante) {
		this.enderecoLicitante = enderecoLicitante;
	}
	public String getTelefoneLicitante() {
		return telefoneLicitante;
	}
	public void setTelefoneLicitante(String telefoneLicitante) {
		this.telefoneLicitante = telefoneLicitante;
	}
	public void addLicitacao( ModalidadeLicitacao licitacao ){
		this.licitacoes.add( licitacao );
	}

	public List<ModalidadeLicitacao> getLicitacoes()
	{
		return this.licitacoes;
	}
	
	public void printLicitacoes(){
		for( ModalidadeLicitacao licitacao : licitacoes ){
			System.out.println( "Licitacao Inscrita: " + licitacao.getNomeLicitacao() );
		}
	}

}
