package diegomoya.com.enrutamiento1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import diegomoya.com.enrutamiento.FamiliarizacionEnrutamientoApplication;

@SpringBootApplication
@RestController
public class FamiliarizacionEnrutamiento1Application {

	public static void main(String[] args) {
		SpringApplication.run(FamiliarizacionEnrutamientoApplication1.class, args);
	}
	
	@RequestMapping("/coding")
	public String Saludo() {
		return "¡Hola Coding Dojo!";
	}
	
	@RequestMapping("/test")
	public String Greet(@RequestParam(value="q") String searchQuery) {
		return "¡Hola!"+ searchQuery;
	}
}
