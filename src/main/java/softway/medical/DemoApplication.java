package softway.medical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import softway.medical.service.CalculService;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		//ici on simule l'index de santé provenant de l'index de cabine de 15 patients
		List<Integer> list = List.of(0,2,3,4,5,18,25,33,45,55,95,100,115,99,219);
		CalculService service = new CalculService();
		list.forEach(x -> System.out.println("patient:"+(list.indexOf(x)+1)+" valeur:"+x+"==>"+service.calculateHealthIndex(x).getService()));

	}

}
