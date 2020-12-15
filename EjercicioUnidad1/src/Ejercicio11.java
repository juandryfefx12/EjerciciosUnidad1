import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio11 {
	
	public static void main(String[] args) {

		List<String> lCommand = new ArrayList<String>();
		lCommand.add("java");
		lCommand.add("Ejercicio10");

		ProcessBuilder pb = new ProcessBuilder(lCommand);

		String classpath = "/C:\\Users\\Juan\\git\\Repositorios\\bin";

		pb.environment().put("CLASSPATH", classpath);
		pb.inheritIO();

		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}