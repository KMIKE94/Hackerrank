import java.util.*;
public class StackOfPlates{
	public static void main(String args[]){

	}
}

class Stack{
	//LIFO
	int[] arr;
	int top;
	int numItems;
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
		}else{
			top++;
			if(top == numItems){
				top = 0;
			}

			arr[top] = num;
		}
	}

}

class SetOfStacks{
	ArrayList<Stack> myStacks = new ArrayList<Stack>();

	public SetOfStacks(){

	}

	public void push(int num){
		
	}
}