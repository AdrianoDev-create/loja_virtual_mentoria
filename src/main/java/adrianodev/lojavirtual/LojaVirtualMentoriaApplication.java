package adrianodev.lojavirtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "adrianodev.lojavirtual.model")// Para informar o pagode que está as tabela a ser criada no banco. Nem todos precisam, varia das versões
public class LojaVirtualMentoriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaVirtualMentoriaApplication.class, args);
	}

}
