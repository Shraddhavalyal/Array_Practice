import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int sum=0;
		for(int i=0;i<size;i++){
			System.out.print("Enter element: ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(arr[i]%2==1){
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum of odd elements: "+sum);
	}
}

