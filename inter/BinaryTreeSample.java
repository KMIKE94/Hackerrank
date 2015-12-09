import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeSample{
	public static void main(String args[]){
		BinaryTree bt = new BinaryTree();

		bt.insert(7);
		bt.insert(4);
		bt.insert(2);
		bt.insert(3);
		bt.insert(7);
		bt.insert(5);
		bt.insert(4);

		//System.out.println("inOrder");

		bt.preOrder(bt.root);
		System.out.println("");
		DFS(bt.root);
		System.out.println("");
		BreathFirstSearch(bt.root);
	}

	public static void DFS(Node root){
		//if(root != null){
		//	System.out.print(root.data + " ");
		//	DFS(root.left);
		//	DFS(root.right);
		//}

		Stack<Node> s = new Stack<Node>();
		Node p = root;
		while(!s.isEmpty() || p != null){
			if(p != null){
				s.push(p);
				System.out.print(p.data + " ");
				p = p.left;
			}

			else{
				Node t = s.pop();
				p = t.right;
			}
		}
	}

	public static void BreathFirstSearch(Node root){
		Queue<Node> queue = new LinkedList<Node>(); 
		queue.add(root);
		while(!queue.isEmpty()){
			Node node = queue.poll();
			System.out.print(node.data + " ");
			if(node.left != null)queue.add(node.left);
			if(node.right != null)queue.add(node.right);
		}
	}
}

class BinaryTree{
	public Node root;

	public BinaryTree(){
		root = null;
	}

	public void insert(int data){
		Node newNode = new Node(data);

		if(root == null){
			root = newNode;
		}else{
			Node current = root;

			while(current != null){
				Node focus = current;
				if(focus.data > newNode.data|| focus.data == newNode.data){
					focus = focus.left;
					if(focus == null){
						current.left = newNode;
						System.out.println("Entered " + data + " to left");
						break;
					}

					current = current.left;
				}else if(focus.data < newNode.data){
					focus = focus.right;
					if(focus == null){
						current.right = newNode;
						System.out.println("Entered " + data + " to right");
						break;
					}
					current = current.right;
				}
			}
		}
	}

	public void inOrder(Node root){
		if(root != null){
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}

	public void preOrder(Node root){
		if(root != null){
			System.out.print(root.data + " ");

			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void postOrder(Node root){
		if(root != null){
			postOrder(root.left);
			postOrder(root.right);

			System.out.println(root.data);
		}
	}
}

class Node{
	int data;
	Node left, right;

	public Node(int data){
		this.data = data;
	}
}