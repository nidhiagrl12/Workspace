
		
public class LinkedList
{
	public static LinkedNode CreateList(int[] array)
	{
		LinkedNode head = null;
		
		for(int i=0; i< array.length; i++)
			if (head == null)
			{
				head = new LinkedNode(array[i]);
			}
			else
			{
				LinkedNode current = head;
				while(current.next != null)
					current = current.next;
				current.next = new LinkedNode(array[i]);
			}

		return head;
	}
	
	public static void Print(LinkedNode x)
	{
		while(x!=null)
		{
			System.out.println(x.data);
			x = x.next;
		}
	}

	public static void main(String[] args)
	{
		int[] array = { 1, 2, 3, 4,5 ,6,  7};
		
		LinkedNode head = CreateList(array);
		Print(head);
	}
}
