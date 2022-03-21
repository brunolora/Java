import static org.junit.Assert.*;

import org.junit.Test;

public class MensagemPadraoTeste {

	@Test
	public void testeMensagemPadrao() {
		String msgEsperada = "Bem vindo, todos voc�s";
		MensagemPadrao mensagemPadrao = new MensagemPadrao();
		String msgReal = mensagemPadrao.geraMensagem();
		assertEquals(msgEsperada, msgReal);
	}

}
