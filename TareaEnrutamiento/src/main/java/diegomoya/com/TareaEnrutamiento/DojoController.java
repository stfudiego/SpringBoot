package diegomoya.com.TareaEnrutamiento;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DojoController {
	@RequestMapping("/{x}")
	public String dojo(@PathVariable("x") String Dojo) {
		String respuesta = Dojo;
		if (Dojo.equals("dojo")){
		respuesta = "¡El Dojo es increíble!";
		}
		else if (Dojo.equals("burbank-dojo")) {
		respuesta = "El Dojo Burbank está localizado al sur de California";
		}
		else if (Dojo.equals("san-jose")) {
		respuesta = "El Dojo SJ es el cuartel general";
		}
		return respuesta;
	}
}
