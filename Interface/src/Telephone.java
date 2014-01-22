public interface Telephone {
	//public int phoneno=0;
	public int getNumber();
	public int readNumber();
	public void callPhone(Telephone peer);
	public void hangup();
}
