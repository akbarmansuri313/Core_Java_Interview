
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

	public static void main(String[] args) throws IOException {

		DatagramSocket socket = new DatagramSocket(1212);

		byte[] bte = new byte[256];

		DatagramPacket packet = new DatagramPacket(bte, bte.length);

		socket.receive(packet);

		String receive = new String(packet.getData(),0, packet.getLength());

		System.out.println("Recive = " + receive);

		String response = "Hello from UDP Server";

		bte = response.getBytes();

		packet = new DatagramPacket(bte, bte.length, packet.getAddress(), packet.getPort());

		socket.send(packet);

		socket.close();

	}
}
