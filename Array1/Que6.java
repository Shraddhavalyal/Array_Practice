import java.util.*;
class ARRAYDEMO{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		char arr[]=new char[size];
		for(int i=0;i<size;i++){
			System.out.print("Enter Element: ");
			arr[i]=sc.next().charAt(0);
		}
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+",");
		}
	}
}
