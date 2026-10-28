
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLReader {

	public static void main(String[] args) throws IOException {

		URL u = new URL("https://erp.sunilos.com/NCSA/#/OnlineTestResult");

		System.out.println("Protocol = " + u.getProtocol());
		System.out.println("Port     = " + u.getPort());
		System.out.println("HostName = " + u.getHost());
		System.out.println("File     = " + u.getPath());

		InputStream in = u.openStream();

		Scanner sc = new Scanner(in);

		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}

	}
}
