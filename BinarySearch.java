
// removed the comment

class BinarySearch{

	public static void main(String[] args) {
		
		System.out.println("satish");

		int arr[] = { 2, 3, 4, 10, 40 };

		int n = arr.length;

		int x = 10;

		System.out.println(binarySearch(arr,0,n-1,x));


 	}

 	public static int binarySearch(int arr[], int start, int end, int x){

 		if (end>=start)
 		{
 			int mid = start + (end-1)/2;

 			if(arr[mid]==x)
 				return mid;

 			if (arr[mid]>x) {
 				binarySearch(arr,start,mid-1,x); 				
 			}
 			
 			return binarySearch(arr,mid+1,end,x);

 		}
 		return -1;


 	}
}