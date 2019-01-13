package Hw11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private Socket clientSocket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;

	// 1. 데이터를 계속 전송 쓰레드
	// 2. 데이터를 계속 수신 쓰레드
	public void connect() {
		// 로컬호스트 (127.0.0.1) 서버로 접속한다.
	}

	public void dataRecv() {
		// 스레드를 만들고 while문을 통해 계속해서 서버가가 보내는 문자열을 출력함, "/quit"란 문자열이 오면 while문을 빠져나가게 만든다.
	}

	public void dataSend() {
		// 스레드를 만들고 while문을 통해 계속해서 서버에 보내는 문자열을 출력함, "/quit"란 문자열을 입력하면 while문을 빠져나가게 만든다.
	}

	public void streamSetting() {
		// 데이터 인풋, 아웃풋 스트림을 소켓 스트림과 연결
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