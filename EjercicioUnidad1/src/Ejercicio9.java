
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio9 {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws IOException, InterruptedException {

		// VARIABLES
		int error;
		File enlaceFicheroLog, enlaceFichero;

		List<String> lCommand = new ArrayList<String>();
		lCommand.add("ls");
		lCommand.add("agua");
		
		//esta linea equivale a ls agua

		ProcessBuilder proceso = new ProcessBuilder(lCommand);

		enlaceFicheroLog = new File("log_ejercicio9.txt");
		proceso.redirectError(enlaceFicheroLog);

		
		enlaceFichero = new File("salida_ejercicio9.txt");
		proceso.redirectOutput(enlaceFichero);
		
		Process p = proceso.start();

		error = p.waitFor();


		if (error != 0) {

			System.out.println("Error debe consultar el fichero log_ejercicio9");

		} else {

			System.out.println("Debe consultar el fichero salida_ejercicio9");

		}

	}

}
