
public class Sorting {
	
	/*public static void MergeSortNikhilHelper(int[] array, int[] temp, int p, int q) {
		
		if arrat
		int r = (p+q)/2;
		
		
		int i,j,k;
		int l = (array.length%2==0) ? (array.length/2)	: (array.length/2+1);
		int[] array1 = new int[array.length/2];
		int[] array2 = new int[l];
		
		//divide content of array into two arrays
		for (i=0;i<array.length/2; i++) {
			array1[i]=array[i];
		}
		for (i=array.length/2; i<array.length;i++) {
			array2[i-array.length/2]=array[i];
		}
		
		//send both arrays for sorting
		if(array1.length>1) MergeSort(array1);
		if(array2.length>1) MergeSort(array2);
		
		
		i=0; j=0; k=0; 
		while (i<array1.length && j <array2.length)
		{
			if (array1[i] >array2[j]) {
				array[k]=array2[j]; j++; k++;
			}
			else { 
				array[k]=array1[i]; i++; k++;
			}
		}
		
		while(i<array1.length) {
			array[k]=array1[i]; i++; k++;
		}
		while(j<array2.length) {
			array[k]=array2[j]; j++; k++;
		}
		
			
	}*/
	
	public static void MergeSort(int[] array) {

		if(array.length>1) return;
			
		int[] array1 = new int[array.length/2];
		int[] array2 = new int[array.length - array.length/2];
		
		//divide content of array into two arrays
		for (int i=0;i<array.length/2; i++)
			array1[i]=array[i];

		for (int i=array.length/2; i<array.length;i++)
			array2[i-array.length/2]=array[i];
		
		//send both arrays for sorting
		MergeSort(array1);
		MergeSort(array2);
		
		
		int i=0, j=0, k=0; 
		while (i<array1.length && j <array2.length)
			if (array1[i] >array2[j])
				array[k++]=array2[j++];
			else 
				array[k++]=array1[i++];

		
		while(i<array1.length) array[k++]=array1[i++];

		while(j<array2.length) array[k++]=array2[j++];
	}
	
	public static void main(String[] args) {
		int[] array = { 3, 200, 2, 5,1,34,53,11,0,2};
		//InsertionSort(array);
		
		// Merge(array);
		MergeSort(array);
		for (int z = 0; z < array.length; z++)
			System.out.println(array[z]);
			System.out.println("------");
		

	}

}
