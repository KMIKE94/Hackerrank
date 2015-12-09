import java.util.*;

public class lists{
	public static void main(String [] args){
		LinkedList l = new LinkedList();

		//l.insert(3);
		//l.insert(5);
		//l.insert(5);
		//l.insert(4);
		//l.insert(5);
		//l.insert(3);
		///l.insert(3);
		//l.insert(3);
		//l.insert(5);
		//l.insert(3);
		//l.insert(3);
		//l.insert(5);

		//l.printLinkedList();
		//System.out.println();
		//removeDuplicates(l.root);

		//nthToLast(l.root, 3);

		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.insert(3);

		//deleteMiddle(l.root);

		l.printLinkedList();
	}

	static void removeDuplicates(Node root){
		Node current = root;

		while(current.next != null){
			int data = current.data;
			Node focus = current.next;
			Node prev = current;
			while(focus != null){
				if(data == focus.data){
					prev.next = focus.next;
				}

				focus = focus.next;
				prev = prev.next;
			}

			current = current.next;
		}
	}

	static void nthToLast(Node root, int nth){
		Node nthNode=null;

		Node current = root;
		Node behind = root;
		int count = 0;
		while(current != null){
			if(count >= nth){
				nthNode = behind;
				behind = behind.next;
			}
			current = current.next;
			count++;
		}

		System.out.println(nthNode.data);
	}

	static void deleteMiddle(Node root){
		//initial count

		Node current = root;
		int count = 0;
		while(current != null){
			count++;
			current = current.next;
		}

		int middleVal = count/2 + 1;

		count = 0;
		current = root;
		Node prev = current;
		while(current != null && count <= middleVal){
			count++;
			if(count == middleVal){
				prev.next = current.next;
				break;
			}
			if(count > 1) prev = current;
			current = current.next;
		}

	}

	static void circularLinkedList(Node root){
		Node current = root;

		if(current != null){
			Node focus = current;
			//123453
			int check = focus.data;
			while(focus != null){
				
			}
		}
	}	
}

class LinkedList{
	Node root;

	public void LinkedList(){
		root = null;
	}

	public void insert(int data){
		Node newLink = new Node(data);
		if(root == null)
			root = newLink;

		else{
			Node current = root;

			while(current != null){
				if(current.next == null){
					current.next = newLink;
					break;
				}else{
					current = current.next;
				}
			}
		}
	}

	public void printLinkedList(){
		Node current = root;

		while(current != null){
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
}

class Node{
	int data;
	Node next;
	Node prev;

	public Node(int data){
		this.data = data;
	}
}