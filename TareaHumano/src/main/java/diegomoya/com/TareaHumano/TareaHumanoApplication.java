package diegomoya.com.TareaHumano;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TareaHumanoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TareaHumanoApplication.class, args);
	}
	
	@RequestMapping("/")
	public String Saludar(@RequestParam(value="q", required=false) String nombre) {
		if(nombre==null) {
		return "Hello Human";
		}
		else {
		return "Hello " + nombre;
		}
	}
}
