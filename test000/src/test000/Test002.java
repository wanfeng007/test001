package test000;

public class Test002 {
	public static void main(String[] args) {
		int j=0;
		int temp=0;
		int[] arr = {3,4,6,2,7,1};
		for (int i=0;i<arr.length-1;i++){
		  for (j=arr.length-1;j>i ;j--){
			  if(arr[j-1]>arr[j]){
				  temp = arr[j-1];
				  arr[j-1]=arr[j];
				  arr[j]=temp;
			  }
		  }
		}
		System.out.println("第几个值为"+arr[2]);
	}
}
