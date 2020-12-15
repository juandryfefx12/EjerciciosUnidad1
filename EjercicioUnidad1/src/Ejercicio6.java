
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio6 {

	public static void main(String[] args) {

		// VARIABLES
		File enlaceFicheroLog, enlaceFichero;
		boolean hayErrores = false;
		String linea, listaError = null;

		enlaceFichero = new File("cuervo");
		enlaceFicheroLog = new File("log_ejercicio1.txt");

		// PROGRAMA

		try (FileReader lectura = new FileReader(enlaceFichero);
				BufferedReader flujoLectura = new BufferedReader(lectura);) {

			linea = flujoLectura.readLine();

			while (linea != null) {

				flujoLectura.readLine();

			}

			hayErrores = false;
		} catch (IOException e) {
			e.getMessage();
			listaError = e.getMessage();

			hayErrores = true;

		}

		if (hayErrores == true) {

			try (FileWriter escritura = new FileWriter(enlaceFicheroLog);
					BufferedWriter flujo = new BufferedWriter(escritura);) {

				flujo.write(listaError);

			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}
	
}
