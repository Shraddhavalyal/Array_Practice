import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.print("Enter element: ");
			arr[i]=sc.nextInt();
		}										System.out.println("Even no. are: ");
		for(int i=0;i<size;i++){	
			if(arr[i]%2==0){
			System.out.println(arr[i]);
		}
	}
}
}

