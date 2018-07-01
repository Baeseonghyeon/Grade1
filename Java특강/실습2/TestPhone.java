package 실습2;

class TestPhone {
	public void run() {
		Phone[] phones = {new Phone("대한"),new TelePhone("민국","내일"),
				new SmartPhone("만세","갤러그")};
		phones[0].talk();
		TelePhone Tele=(TelePhone)phones[1];
		Tele.autoAnswering();
		SmartPhone Smart=(SmartPhone)phones[2];
		Smart.playGame();
	}
}
