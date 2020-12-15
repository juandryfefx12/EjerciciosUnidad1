
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {

	public static void main(String[] args) {

		// VARIABLES
		File enlaceFichero;
		boolean hayErrores = false;
		String linea, listaError = null;

		enlaceFichero = new File("cuervo");

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

			System.out.println(listaError);
		}
	}
}
