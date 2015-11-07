package qproject;

import java.net.URI;
import java.util.Map;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.handshake.ServerHandshake;

public class WSSClient extends WebSocketClient {

	public WSSClient(URI serverURI) {
		super(serverURI);
		System.out.println(super.getConnection().toString());
		// TODO Auto-generated constructor stub
	}

	public WSSClient(URI serverUri, Draft draft) {
		super(serverUri, draft);
		// TODO Auto-generated constructor stub
	}

	public WSSClient(URI arg0, Draft arg1, Map<String, String> arg2, int arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onClose(int arg0, String arg1, boolean arg2) {
		// TODO Auto-generated method stub
		System.out.println("WSSClient.onClose()");
	}

	@Override
	public void onError(Exception arg0) {
		// TODO Auto-generated method stub
		System.out.println("WSSClient.onError");
		arg0.printStackTrace();
	}

	@Override
	public void onMessage(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("WSSClient.onMessage");

	}

	@Override
	public void onOpen(ServerHandshake arg0) {
		// TODO Auto-generated method stub
		System.out.println("WSSClient.onOpen");
	}

}
