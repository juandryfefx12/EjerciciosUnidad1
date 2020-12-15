
public class Ejercicio7 { //es el mismo que el uno

	public static void main(String[] args) {

		// VARIABLES
		String lanzarChome = "C:\\Program Files\\Google\\Chrome\\Application\\chrome";

		// PROGRAMA
		try {

			ProcessBuilder pb = new ProcessBuilder(lanzarChome, "youtube.com"); // creamos un nuevo proceso que lanze
																				// crhome
			pb.start(); // lo iniamos // con la pagina de youtube

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
