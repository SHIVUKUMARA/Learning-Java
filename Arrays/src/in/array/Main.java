package in.array;


class CustomArray{
	private int size;
	int[] arr;
	
	CustomArray(int size){
		this.size = size;
		this.arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	public void printArray() {
		for(int i = 0; i < size; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	
	public void getElementAtGivenIndex(int index) {
		if(index < 0 || index >= size) {
			System.out.println("Invalid Index Position");
			return;
		}
		System.out.println("Element at index : "+ index + " = "+arr[index]);
	}
	
	public void insertElementAtGivenIndex(int index, int data) {
		if(index < 0 || index >= size) {
			System.out.println("Invalid Index Position");
			return;
		}
		if(arr[index]!= Integer.MIN_VALUE) {
			System.out.println("Index position is not empty");
			return;
		}
		arr[index] = data;   //O(1) while inserting value at given index
		System.out.println("Element add to position of : "+index);
	}
	
	public void updation(int index, int updatedData) {
		if(index < 0 || index >= size) {
			System.out.println("Invalid Index Position");
			return;
		}
		if(arr[index] == Integer.MIN_VALUE) {
			System.out.println("No elements to update");
			return;
		}
		arr[index] = updatedData;  //O(1)
		System.out.println("Element updated at position of : "+index);
	}
	
	public void deleteElement(int index) {
		if(index < 0 || index >= size) {
			System.out.println("Invalid Index Position");
			return;
		}
		if(arr[index] == Integer.MIN_VALUE) {
			System.out.println("No elements to delete");
			return;
		}
		arr[index] = Integer.MIN_VALUE;  //O(1)
		System.out.println("Element deleted at position of : "+index);
	}
}


public class Main {

	public static void main(String[] args) {
       
		
		CustomArray arr = new CustomArray(5);
		arr.printArray();
		
		arr.getElementAtGivenIndex(4);
		arr.insertElementAtGivenIndex(2, 6);
		arr.insertElementAtGivenIndex(2, 11);
		arr.getElementAtGivenIndex(2);
		arr.updation(2,8);
		arr.getElementAtGivenIndex(2);
		arr.deleteElement(2);
		arr.getElementAtGivenIndex(2);
		arr.printArray();
	}

}
