import java.util.*;
public class QueueTwoStacks{
	public static void main(String args[]){
		//implement a Queue using two Stacks
		//use a stack normally
		//first value gets added
		//second value added, what till the queue is needed
		//pop all values from first stack to the second stack
		//pop values from the second stack, this is our queue

		Stack s = new Stack(5);
		Stack myQueue = new Stack(5);
		for(int i = 0; i < 5; i++){
			s.push(i+1);
		}

		for(int i = 0; i < 5; i++){
			myQueue.push(s.pop());
		}

		for(int i = 0; i < 5; i++){
			System.out.print(myQueue.pop() + " ");
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

	public int pop(){
		if(top < 0){
			System.out.println("Stack is empty");
		}else{
			if(arr[top] == 0) System.out.println("Stack is empty");
			else{
				//System.out.println(arr[top]);
				int LIFO = arr[top];
				arr[top] = 0;
				top--;

				if(top < 0){
					top = numItems - 1;
				}

				return LIFO;
			}
		}

		return -1;
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