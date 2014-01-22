import java.util.Scanner;

public class CellPhone implements Telephone {
	private int phoneno;

	public CellPhone(int no) {
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
		connectBaseStation();
		System.out.println("Calling "+/*peer.phoneno*/ peer.getNumber());
	}
	public void hangup() {
		System.out.println("Call ends");
	}
	public void connectBaseStation() {
		System.out.println("Connecting to base station");
	}
	public void handoff() {
		System.out.println("Handoff to other base station");
	}
}
