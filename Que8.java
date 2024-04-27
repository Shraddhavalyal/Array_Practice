import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter count of Employee's: ");
		int count=sc.nextInt();
		int age[]=new int[count];
		for(int i=0;i<count;i++){
			System.out.print("Enter age ");
			age[i]=sc.nextInt();
		}											for(int i=0;i<count;i++){	
			System.out.println(age[i]);
		}
	}
}


