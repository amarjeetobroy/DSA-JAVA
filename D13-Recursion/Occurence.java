// write a function to find the first occurence of an element in an array?

public class Recursion{	
public static int firstOccurence(int arr[], int key, int i){
		if(i == arr.length){
			return -1;
		}
		if(arr[i] == key){
			return i;
		}
		return firstOccurence(arr,key,i+1);
	}
	public static void main(String[] args) {
		int arr[]= {8,3,6,9,5,6,7,9,2,3,4};
		System.out.println(firstOccurence(arr, 5, 0));
	}
}


/* Output
  4
  */
