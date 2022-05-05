import java.util.Arrays;
import java.util.List;

class Main {
	private int[] arr;
	private int capacity;
	private int top1, top2;

	public Main(int n) {
		capacity = n;
		arr = new int[n];
		top1 = -1;
		top2 = n;
	}

	public void pushFirst(int key) {

		if (top1 + 1 == top2) {
			System.out.println("Stack Overflow");
			System.exit(-1);
		}

		top1++;
		arr[top1] = key;
	}

	public void pushSecond(int key) {

		if (top1 + 1 == top2) {
			System.out.println("Stack Overflow");
			System.exit(-1);
		}

		top2--;
		arr[top2] = key;
	}

	public int popFirst() {

		if (top1 < 0) {
			System.out.println("Stack Underflow");
			System.exit(-1);
		}

		int top = arr[top1];
		top1--;
		return top;
	}

	public int popSecond() {

		if (top2 >= capacity) {
			System.out.println("Stack Underflow");
			System.exit(-1);
		}

		int top = arr[top2];
		top2++;
		return top;
	}
}

class Q3 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(5, 11);
		List<Integer> list2 = Arrays.asList(10, 15, 4, 40);

		Main main = new Main(list1.size() + list2.size());

		for (int i : list1) {
			main.pushFirst(i);
		}

		for (int j : list2) {
			main.pushSecond(j);
		}

		System.out.println("Popped element from stack1 is : " + main.popFirst());
		System.out.println("Popped element from stack2 is: " + main.popSecond());
	}
}