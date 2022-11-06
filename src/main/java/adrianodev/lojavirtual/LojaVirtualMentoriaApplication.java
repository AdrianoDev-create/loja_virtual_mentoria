package adrianodev.lojavirtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "adrianodev.lojavirtual.model")// Para informar o pagode que está as tabela a ser criada no banco. Nem todos precisam, varia das versões
@ComponentScan(basePackages = {"adrianodev.*"})
@EnableJpaRepositories(basePackages = {"adrianodev.lojavirtual.repository"})
@EnableTransactionManagement
public class LojaVirtualMentoriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaVirtualMentoriaApplication.class, args);
	}

}
