package diegomoya.com.enrutamiento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FamiliarizacionEnrutamientoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FamiliarizacionEnrutamientoApplication.class, args);
		}
		
	@RequestMapping("/")
	public String Greet() {
		return "Hello World";
	}

}
