public class Hanoi {
	public static void move(MyStack<Integer> from, MyStack<Integer> to) {
		Integer item;
		item = from.pop();
		System.out.println("\tMoving "+item+ " from "+from.name+" to "+to.name);
		to.push(item);
		System.out.println("\t\tCurrent state:"+from+to);
	}
	
	public static void solve(int n, MyStack<Integer> src, MyStack<Integer> aux, MyStack<Integer> dest) {
		if (n>0) { 
			solve(n-1, src, dest, aux);
			move(src,dest);
			solve(n-1, aux, src, dest);
		}
	}

	public static void main(String[] args) {
		MyStack<Integer> poleA = new MyStack<Integer>("poleA"),
				        poleB = new MyStack<Integer>("poleB"),
				        poleC = new MyStack<Integer>("poleC");
		//Initialize poleA. Other poleB and poleC are empty.
		poleA.push(4);
		poleA.push(3);
		poleA.push(2);
		poleA.push(1);

		System.out.println("Initial state:"+poleA+poleB+poleC);
		solve(4,poleA,poleB,poleC);
		System.out.println("Final state:"+poleA+poleB+poleC);
	}

}
