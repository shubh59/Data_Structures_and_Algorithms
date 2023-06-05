class LinearSearch 
{
	public static void main(String[] args) 
	{
		int[] array = {7,6,9,587,6,44,78,59,20,1,69};
		int index = linearSearch(array, 69);
		if (index != -1)
		{
			System.out.println("Element found at index : " + index);
		}
		else
			System.out.println("Element Not found");
	}

	private static int linearSearch(int[] array, int value){
		for(int i = 0; i < array.length; i++){
			if(array[i] == value){
				return i;
			}
		}
		return -1;
	}
}
