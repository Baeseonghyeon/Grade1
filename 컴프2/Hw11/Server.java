package Hw11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;

	public void serverSetting() {
		// ���������� ��Ʈ 8080���� �����
		// Ŭ���̾�Ʈ ������ ����� ������ ���
	}

	public void closeAll() {
		try {
			serverSocket.close();
			clientSocket.close();
			dataInputStream.close();
			dataOutputStream.close();
		} catch (Exception e) {
		}
	}

	public void streamSetting() {
		// ������ ��ǲ, �ƿ�ǲ ��Ʈ���� ���� ��Ʈ���� ����
	}

	public void dataRecv() {
		
		// �����带 ����� while���� ���� ����ؼ� Ŭ���̾�Ʈ�� ������ ���ڿ��� �����, "/quit"�� ���ڿ��� ���� while���� ���������� �����.

	}

	public void dataSend() {
		// �����带 ����� while���� ���� ����ؼ� Ŭ���̾�Ʈ���� ���ڿ��� �����Ѵ�. "/quit"�� ���ڿ��� �Է��ϸ� while���� ���������� �����.
	}

	public Server() {
		serverSetting();
		streamSetting();
		dataRecv();
		dataSend();
	}

	public static void main(String[] args) {
		new Server();
	}
}