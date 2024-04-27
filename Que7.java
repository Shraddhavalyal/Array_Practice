import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.print("Enter element: ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(arr[i]%4==0){
				System.out.println(arr[i]+" is divisible by 4 and its index is "+i);
			}
		}
	}
}

