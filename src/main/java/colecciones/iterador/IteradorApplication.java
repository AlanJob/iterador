package colecciones.iterador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IteradorApplication {

	public static void main(String[] args) {
		SpringApplication.run(IteradorApplication.class, args);

		// List<String> lista = new ArrayList();
		// lista.add("Jilay");
		// lista.add("Soft");
		// lista.add("Java");
		// for(String s:lista){
		// 	System.out.println(s);
		// }
		
		// Iterator<String> iterador = lista.iterator();
		// while(iterador.hasNext()){
		// 	System.out.println(iterador.next());
		// }

		Persona per1 = new Persona();
		per1.setNombre("Ely");
		per1.setMonto(1000);
		per1.setCuenta(1);

		Persona per2 = new Persona();
		per2.setNombre("Kary");
		per2.setMonto(2000);
		per2.setCuenta(2);
		
		Persona per3 = new Persona();
		per3.setNombre("Ana");
		per3.setMonto(3000);
		per3.setCuenta(3);
		
		List<Persona> personas = new ArrayList();
		personas.add(per1);
		personas.add(per2);
		personas.add(per3);

		//Esta es una opcion, pero la que sigue es la mas facil
		// Iterator<Persona> iterador = personas.iterator();
		// while(iterador.hasNext()){
		// 	System.out.println(iterador.next().getNombre());
		// }
		
		
		for(Persona p: personas){
			System.out.println(p.getNombre());
		}



	}

}
