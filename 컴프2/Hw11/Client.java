package Hw11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private Socket clientSocket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;

	// 1. �����͸� ��� ���� ������
	// 2. �����͸� ��� ���� ������
	public void connect() {
		// ����ȣ��Ʈ (127.0.0.1) ������ �����Ѵ�.
	}

	public void dataRecv() {
		// �����带 ����� while���� ���� ����ؼ� �������� ������ ���ڿ��� �����, "/quit"�� ���ڿ��� ���� while���� ���������� �����.
	}

	public void dataSend() {
		// �����带 ����� while���� ���� ����ؼ� ������ ������ ���ڿ��� �����, "/quit"�� ���ڿ��� �Է��ϸ� while���� ���������� �����.
	}

	public void streamSetting() {
		// ������ ��ǲ, �ƿ�ǲ ��Ʈ���� ���� ��Ʈ���� ����
	}

	public Client() {
		connect();
		streamSetting();
		dataSend();
		dataRecv();
	}

	public static void main(String[] args) {
		new Client();
	}

}