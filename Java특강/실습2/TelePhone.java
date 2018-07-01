package 실습2;

class TelePhone extends Phone {
	private String when;
	public TelePhone(String name, String when) {
		super(name);
		this.when=when;
	}
	public void autoAnswering() {
		System.out.println(owner+"은 부재중이다. "+"내일 전화를 바란다.");
	}
}
