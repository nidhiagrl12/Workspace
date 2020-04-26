
public class Sorting {
	
	public static void InsertionSort(int[] array) {
		
		int y;
		
		for (int j=array.length;j>=0;j--)
		
		for (int i = 0; i <j-1; i++) {
			if (array[i] > array[i + 1]) {
				y = array[i + 1];
				array[i + 1] = array[i];
				array[i] = y;

			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void FacebookOn2(int[] a) {
		int b[] = new int[a.length];
			
		for (int i=0;i<a.length;i++ ) {
			b[i]=1;
			for (int j=0;j<a.length; j++) {
				if(i==j) continue;
				b[i]=b[i]*a[j];
			}
		}
		
		

		for (int i = 0; i < a.length; i++) {
			System.out.println(b[i]);
		}
	}
	
	public static int[] FacebookOn(int[] a) {

		int b[] = new int[a.length];
		
		int zeroctr = 0, zeroLoc = 0, value = 1;

		for (int i=0;i<a.length;i++ )
		{
			b[i]=0;
			if(a[i]==0)  
			{
				zeroctr++;
				zeroLoc = i;
			}
			else
				value *= a[i];
			
		}
		
		if(zeroctr > 1) return b;
		
		if(zeroctr == 1)
		{
			b[zeroLoc] = value;
			return b;

		}
		
		for (int i=0; i<=a.length-1; i++)
			b[i] = (int) (value/a[i]);

		
		return b;
	}
	
	
	public static void MergeHelper(int[] array, int start, int end, int[] temp)
	{
		
		if ((end - start ) < 2 ) // Stopping condition
		{
			if (((end-start) == 1) && (array[end] > array[start]))
			{
				int tmp = array[end];
				array[end] = array[start];
				array[start] = tmp;
			}
		}
		else
		{
			int mid = start + (end-start)/2;
			MergeHelper(array, start, mid, temp);
			MergeHelper(array, mid+1, end, temp);
			
			int i = start;
			int j = mid+1;
			int k = 0;
			
			while ((i<=mid) && (j<=end))
				if (array[i]>array[j])
					temp[k++] = array[j++];
				else
					temp[k++] = array[i++];
			
			while (i<=mid)
				temp[k++] = array[i++];

			while (j<=end)
				temp[k++] = array[j++];

			for(int kk=0; k<kk; k++)
				array[start+kk] = temp[kk];
		}
	}
	
	public static int[] Merge(int[] array)
	{
		int[] temp = new int[array.length];
		MergeHelper(array, 0, array.length-1, temp);
		return array;
	}
	
	

	/*public static int[] Merge(int[] array, int p, int q, int r) {
		
		int array_c[] = new int[r+1];
		int Len_c = r+1;
		int Len_a = q-p+1;
		int Len_b = r-q;
		int k = 0, j=q+1,i=p;
		
		while(k<Len_c) {
			if(Len_a >= i+1 && Len_b >=j+1) {
				if(array[i] > array[j]) {
					array_c[k]=array[j];j++;
				}
				else {
					array_c[k]=array[i];i++;
				}
			}
			else {
				if(Len_a <i) {
					array_c[k]=array[j];j++;
				}
				else {
					array_c[k]=array[i];i++;
				}
			}
			k++;		
		}
		return array_c;
	}*/
	
	
	public static void main(String[] args) {
		// int[] array = { 100, 543, 3, 200, 2, 1, 8, 11, 45, 11, 66,3,7,100,34,44 };
		int[] array2= {3,2, 5,3,4,4};

		/* InsertionSort(array);*/
		/*FacebookOn2(array2);*/
		/*int[] answer = FacebookOn(array2);*/
		
		// int p= 0, q=(array2.length)/2-1, r=array2.length-1;
		
		// int[] answer = Merge(array2,p,q,r);
		
		
		int[] answer = Merge(array2);
		
		for (int i = 0; i < answer.length; i++)
			System.out.println(answer[i]);

	}

}
