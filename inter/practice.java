public void insertionSort(int[] arr){
	

	int inner;
	for(int outer = 1; outer < arr.length; outer++){
		int temp = arr[outer];
		inner = outer;
		while(inner > 0 && (arr[inner-1] > temp || arr[inner - 1] == temp)){
			arr[inner] = arr[inner - 1];
			i--;
		}

		arr[inner] = temp;
	}
}

O()
public void mergsort(int low, int high){
	if(low < high){
	int middle = low + (high - low) / 2;
		mergesort(low, middle);
		mergesort(middle+1, high);
		merge(low, middle, high);
	}
}

public void merge(int low, int middle, int high){
	for(int i = low; i <= high; i++){
		helper[i] = numbers[i];
	}

	int i = low;
	int j = middle;
	int k = low;
	while(i <= middle && j <= high){
		if(helper[i] <= helper[j]){
			numbers[k] = helper[i];
			i++;
		}else{
			numbers[k] = helper[j];
			j++;
		}

		k++;
	}

	while(i <= middle){
	numbers[k] = helper[i];
	i++;
	k++;
	}
}



public void quicksort(int low, int high){
	//pivot
	int i = low, int j = high;

	int pivot = numbers[low + (high - low)/2];

	while(i <= j){

	while(numbers[i] < pivot){
	i++;
	}

	while(numbers[j] > pivot){
	j--;
	}

	if(i <= j){
	exchange(i, j);
	i++;
	j--;
	}
	}

	if(low < j){
	quicksort(low, j);
	}

	if(i < high){
	quicksort(i, high);
	}
}