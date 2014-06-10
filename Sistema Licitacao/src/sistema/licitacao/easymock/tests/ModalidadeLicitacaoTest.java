package sistema.licitacao.easymock.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.easymock.EasyMock;

import sistema.licitacao.Concorrencia;
import sistema.licitacao.Licitante;
//import sistema.licitacao.ModalidadeLicitacao;

public class ModalidadeLicitacaoTest {

	@Test
	public void addLicitanteTest() {
		Licitante licitanteMock = EasyMock.createMock(Licitante.class);
		Concorrencia licitacao = new Concorrencia();
		
		EasyMock.expect(licitanteMock.getNomeLicitante()).andReturn("José");
		EasyMock.replay(licitanteMock);
		
		licitacao.addLicitante(licitanteMock);
		assertEquals(licitacao.getLicitantes().get(0).getNomeLicitante(), "José");
	
		EasyMock.verify(licitanteMock);
	}

}
