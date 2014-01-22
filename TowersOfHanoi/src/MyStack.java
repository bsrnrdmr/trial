import java.util.*;

public class MyStack<E> extends Stack<E> {
	String name;
	
	public MyStack(String name) {
		super();
		this.name = name;
	}
	
	public String toString() {
		return "\t"+name+"= "+super.toString();
	}
}
