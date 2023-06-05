import java.util.Arrays;

class BinarySearch 
{
	public static void main(String[] args) 
	{
		int array[] = new int[100];
		int target = 59;
		for(int i = 0; i < array.length; i++){
			array[i] = i;
		}
		
		int index = Arrays.binarySearch(array, target);

		if(index == target){
			System.out.println(target + " Found at index:" + index);
		}
		else
			System.out.println("Element is not found");
	}
}
