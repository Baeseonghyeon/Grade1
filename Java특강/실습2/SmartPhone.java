package 실습2;

class SmartPhone extends TelePhone{
	private String game;
	public SmartPhone(String name,String game) {
		super(name,null);
		this.game=game;
	}
	public void playGame() {
		System.out.println(owner+"는 "+game+" 게임을 하는 중이다.");
	}
}
