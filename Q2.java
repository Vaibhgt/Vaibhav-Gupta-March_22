public class Q2{
	Node head;
	static class Node{
	int data;
	Node next;
	Node(int d){
		this.data=d;
		this.next=null;
		
	}
	}
	void display(){
		Node n=head;
		while(n!=null){
			System.out.print(n.data);
			n=n.next;
		}
	}
	
	void insert(int new_data){
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	static Node reverse(Node head){
		if (head==null){
		return null;
		}
	Node revNode=null;
		while(head!=null){
			Node next=head.next;
			head.next=revNode;
			revNode=head;
			head=next;
		}
		return revNode;
	}
	
	public static void main(String args[]){
		Q2 hello=new Q2();
		Node node=new Node(1);
		hello.insert(2);
		hello.insert(3);
		hello.insert(4);
		hello.insert(5);
		hello.display();
		Node no=reverse(node);
		System.out.println(no.data);
		
	}
}