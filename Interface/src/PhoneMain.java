
public class PhoneMain {
	public static void main(String[] args) {
		CellPhone a = new CellPhone(1000), c = new CellPhone(1003);
		LandPhone b = new LandPhone(1002);
		a.callPhone(b);
		a.handoff();
		a.hangup();
		a.callPhone(c);
	}
}
