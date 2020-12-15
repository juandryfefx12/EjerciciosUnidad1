import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {

	public static void main(String[] args) {

		// VARIABLES
		File enlaceFichero, enlaceGuardar;

		enlaceFichero = new File("src");
		enlaceGuardar = new File("fichero.txt");
		File[] contenido;

		contenido = enlaceFichero.listFiles();

		// PROGRAMA

		try(FileWriter escritura = new FileWriter(enlaceGuardar);
				BufferedWriter flujo = new BufferedWriter(escritura);) {
			
			for (int contador = 0; contador < contenido.length; contador++) {

				if (contenido[contador].isFile()) {
					
					flujo.append((CharSequence) contenido[contador]);;
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
