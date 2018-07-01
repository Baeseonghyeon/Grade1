package 실습3;

class ControllerTest {
	
	public void run() {
		Controller[] c= {new Tv(false),new Radio(true)};
		for(Controller controller:c) {
			controller.show();
		}
	}
}
