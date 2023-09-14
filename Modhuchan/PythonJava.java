import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Logger;

public class PythonJava {
	public static String ret;
	public static String[] tokens;
	public static String[] out = new String[2];
	public static void main(String[] args) throws IOException {
		String[] cmd = {
			      "printing.exe",
			    };
		Process proc = Runtime.getRuntime().exec(cmd);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		int i = 0;
		while((ret = br.readLine()) != null){
            tokens=ret.split("//n");
            out[i]=Arrays.toString(tokens);
            i=i+1;
        }
	}
}
