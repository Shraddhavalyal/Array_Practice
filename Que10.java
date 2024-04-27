import java.util.*;
class StudenRollNo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of students: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("Enter student Roll No.: ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			System.out.println("Roll NO.s are: ");
			System.out.println(arr[i]);
		}
	}
}

