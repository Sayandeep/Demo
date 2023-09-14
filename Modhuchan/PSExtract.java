import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PSExtract {

	public static void main(String[] args) throws IOException {
		Runtime run = Runtime.getRuntime();
		String cmd = (String) "cmd /C powershell exec2.ps1";
//		Path path = Paths.get("exec1.ps1");
//		String str = Files.readString(path);
//		BufferedWriter bw = Files.newBufferedWriter(path);
//		bw.write("\ufeff");
//		bw.write(str);
//		bw.close();
		Process proc = run.exec(cmd);
		proc.getOutputStream().close();
		InputStream inp = proc.getInputStream();
		InputStreamReader inpsr = new InputStreamReader(inp,"UTF-8");
		BufferedReader bfr= new BufferedReader(inpsr);
		String line = bfr.readLine();
		System.out.println(line);
		

	}

}
