package GraphTheory;

public class Vertex<T> implements Comparable<T>{
	T value;
	
	public Vertex(T value){
		this.value = value;
		System.out.println("New Vertex added to Graph");
	}
	
	public T getVertexValue(){
		return this.value;
	}
	
	public void setVertexValue(T value){
		this.value = value;
		System.out.println("************************\n" + value + " was added as a Vertex\n************************");
	}

	@Override
	public int compareTo(T arg0) {
		// TODO Auto-generated method stub
		if(this.value.toString().compareTo(arg0.toString()) < 0)
			return 1;
		else if(this.value.toString().compareTo(arg0.toString()) > 0)
			return -1;
		return 0;
	}
}