package adrianodev.lojavirtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import adrianodev.lojavirtual.controller.AcessoController;
import adrianodev.lojavirtual.model.Acesso;

@SpringBootTest(classes = LojaVirtualMentoriaApplication.class)
public class LojaVirtualMentoriaApplicationTests {
	

	
	@Autowired
	private AcessoController acessoController; 
	
	
	@Test
	public void testCadastraAcesso() {
		
		Acesso acesso = new Acesso();
		
		acesso.setDescricao("ROLE_ADMIN");

		acessoController.salvarAcesso(acesso);
	}

}
