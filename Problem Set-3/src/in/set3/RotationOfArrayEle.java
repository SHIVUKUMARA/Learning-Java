//24.	Rotation of elements of array- left and right 

package in.set3;

public class RotationOfArrayEle {

	public static void main(String[] args) {
		 int arr[] = { 10, 20, 30, 40, 50, 60, 70};
	        int k = 3;
	        
	        int[] temp;
	         
	        temp =  new int[arr.length];
	        
	        for(int i=0; i<k; i++)
	            temp[i] = arr[i];
	    
	        int x = k;
	        for(int i=0; x < arr.length; i++){
	            arr[i] = arr[x++];
	        }
	        
	        x = 0;
	    
	        for(int i=arr.length-k; i<arr.length; i++)
	            arr[i] = temp[x++];
	    
	   
	        for (int i = 0; i < arr.length; i++)
	            System.out.print(arr[i] + " ");

	}

}
