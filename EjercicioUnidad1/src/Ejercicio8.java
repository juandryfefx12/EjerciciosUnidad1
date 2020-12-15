import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ejercicio8 {

	public static void main(String[] args) {

		ProcessBuilder pEnv = new ProcessBuilder();
		Map<String, String> vbles = pEnv.environment();
		List<String> lCommand = new ArrayList<String>();
		
		lCommand.add("ls");
		lCommand.add("--help");
		
		ProcessBuilder pb = new ProcessBuilder(lCommand);
		System.out.println(pb.command());
		
		try {
			pb.start();
			
		}catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
