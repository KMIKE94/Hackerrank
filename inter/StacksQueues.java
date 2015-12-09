import java.util.*;
public class StacksQueues{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.println("Do you wish to start?");
		String y = in.nextLine();

		Stack s = new Stack(5);
		Queue q = new Queue(5);

		while(!y.equalsIgnoreCase("q")){
			System.out.println("Do you wish to push or pop?");
			y = in.nextLine();
			if(y.equalsIgnoreCase("p")){
				System.out.println("Enter value: ");
				int val = in.nextInt();
				q.push(val);
			}else if(y.equalsIgnoreCase("pop")){
				q.pop();
			}else if(y.equalsIgnoreCase("q")){
				break;
			}else{
				//go around again
				System.out.println("Reenter entry");
			}
		}
	}
}

class Stack{
	//LIFO
	int[] arr;
	int top;
	int numItems;
	int min = 0;
	public Stack(int numItems){
		arr = new int[numItems];
		top = -1;
		this.numItems = numItems;
	}	

	public void pop(){
		if(top < 0){
			System.out.println("Stack is empty");
		}else{
			if(arr[top] == 0) System.out.println("Stack is empty");
			else{
				System.out.println(arr[top]);
				arr[top] = 0;
				top--;

				if(top < 0){
					top = numItems - 1;
				}
			}
		}
	}

	public void push(int num){
		if(top < 0){
			top++;
			arr[top] = num;
			min = num;
		}else{
			top++;
			if(top == numItems){
				top = 0;
			}

			if(min > num) min = num;
			arr[top] = num;
		}
	}

}

class Queue{
	//FIFO
	int[] arr;
	int top;
	int first;
	int numItems;
	public Queue(int numItems){
		arr = new int[numItems];
		top = -1;
		first = -1;
		this.numItems = numItems;
	}

	public void pop(){
		if(top < 0){
			System.out.println("Queue is empty");
		}else{
			if(arr[first] == 0) System.out.println("queue is empty");
			else{			
				System.out.println(arr[first]);
				arr[first] = 0;
				first++;
				if(first == numItems) first = 0;
			}
		}
	}

	public void push(int num){
		if(top < 0){
			top++;
			arr[top] = num;
			first = top;
		}else{
			top++;
			if(top == numItems){
				top = 0;
				first = top+1;
				arr[top] = num;
			}else arr[top] = num;
		}
	}

}

class Node{

}