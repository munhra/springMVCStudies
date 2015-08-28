// esse pacote sera responsavel por agrupar apenas classes de 
// configuracao do spring, sendo assim nao precisaremos de nenhum XML
package br.com.casadocodigo.loja.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.casadocodigo.loja.controllers.HomeController;


// liga o suporte a conversao de objetos para XML, JSON, validacao, RSS
@EnableWebMvc
// adicionamos pacotes por meio das classes que devem ser usados pelo container do spring
@ComponentScan(basePackageClasses={HomeController.class})
public class AppWebConfiguration {
	
	@Bean
	// este metodo marcado como bean configura o spring para encontar
	// os recursos de view na pasta /WEB-INF/views com extencao .jsp
	public InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		// como foi marcado com @Bean o retorno dessa classe será um objeto gerenciado
		// pelo container.
		return resolver;
	}
	


}
