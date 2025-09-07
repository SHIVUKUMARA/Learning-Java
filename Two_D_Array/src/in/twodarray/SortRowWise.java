package in.twodarray;

public class SortRowWise {

	public static void main(String[] args) {
		int[][] arr = {{15,1,7},{5,4,10},{9,22,11}};
		
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("sorted Row Wise");
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j< arr[i].length-1; j++) {
				for(int k=0; k<arr.length-j-1; k++) {
					if(arr[i][k] > arr[i][k+1]) {
						int temp = arr[i][k];
						arr[i][k] = arr[i][k+1];
						arr[i][k+1] = temp;
					}	
				}
			}
			System.out.println();
		}
		
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Sorted Column Wise");
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j< arr[i].length-1; j++) {
				for(int k=0; k<arr.length-i-1; k++) {
					if(arr[k][j] > arr[k+1][j]) {
						int temp = arr[k][j];
						arr[k][j] = arr[k+1][j];
						arr[k+1][j] = temp;
					}	
				}
			}
			System.out.println();
		}
		
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
