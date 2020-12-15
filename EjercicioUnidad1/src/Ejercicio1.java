import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) {

		// VARIABLES
		Runtime rt = Runtime.getRuntime();
		String lanzarChome = "C:\\Program Files\\Google\\Chrome\\Application\\chrome";

		// PROGRAMA
		try {
			try {
				rt.exec(lanzarChome);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
