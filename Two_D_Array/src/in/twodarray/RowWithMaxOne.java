package in.twodarray;

public class RowWithMaxOne {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {1,3,1}, {1,1,1}};
       
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int maxCount = 0;
		int rowIndex = -1;
		for(int i = 0; i<arr.length; i++) {
			int count = 0;
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==1) {
					count++;
				}
			}
			if(count > maxCount) {
				maxCount = count;
				rowIndex = i;
			}
		}
		System.out.println(rowIndex);
	}

}
