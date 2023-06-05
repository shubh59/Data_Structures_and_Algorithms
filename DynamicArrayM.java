
public class DynamicArrayM{
public static void main(String args[])
 {
	DynamicArray dynamicArray = new DynamicArray();
	
	dynamicArray.add("A");
	dynamicArray.add("B");
	dynamicArray.add("C");
	dynamicArray.add("D");
	dynamicArray.insert(3,"f");
	
	System.out.println(dynamicArray);
	System.out.println("size : " + dynamicArray.size);
	System.out.println("capacity : " + dynamicArray.capacity);
	System.out.println("empty: " + dynamicArray.isEmpty());
	
 }

}