package sistema.licitacao.easymock.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.easymock.EasyMock;

import sistema.licitacao.Licitante;
import sistema.licitacao.ModalidadeLicitacao;

public class LicitanteTest {

	@Test
	public void addLicitacaoTest() {
		ModalidadeLicitacao licitacaoMock = EasyMock.createMock(ModalidadeLicitacao.class);
		Licitante licitante = new Licitante();
		
		EasyMock.expect(licitacaoMock.getNomeLicitacao()).andReturn("licitacao1");
		
		EasyMock.replay(licitacaoMock);
		
		licitante.addLicitacao(licitacaoMock);
		//assertEquals(licitante.getLicitacoes().get(0).getNomeLicitacao(), "licitacao1");
		assertEquals(licitante.getLicitacoes().size(), 1);
		EasyMock.verify(licitacaoMock);
	}

}
