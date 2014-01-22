import java.util.*;

public class LandPhone implements Telephone {
	private int phoneno;
	
	public LandPhone(int no) {
		phoneno = no;
	}
	public int getNumber() {
		return phoneno;
	}
	public int readNumber() {
		Scanner console = new Scanner(System.in);
		return console.nextInt();
	}
	public void callPhone(Telephone peer) {
		connectSwitch();
		System.out.println("Dial "+/*peer.phoneno*/ peer.getNumber());
	}
	public void hangup() {
		System.out.println("Call ends");
	}
	public void connectSwitch() {
		System.out.println("Connecting to switch");
	}
}
