
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio2 {

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();
		String comandoLinux = "ls -help";
		String comandoWindows = "CMD /C DIR";
		
		String comando = comandoWindows;
		Process p = null;
		BufferedReader br = null; 
		
		try {
			p = rt.exec(comando);		
		
			InputStream is = p.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			
			String linea;
			while ((linea = br.readLine())!=null) {
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
}
