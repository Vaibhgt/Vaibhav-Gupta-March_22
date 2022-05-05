import java.util.Scanner;
public class Q1{

	static void insertionSort(int n, int []arr){
		int a=arr[n-1];
		for (int i=n-2;i>=0;i--){
			if(arr[i]<a){
				arr[i+1]=a;
				print(arr);
				break;
			}else{
				arr[i+1]=arr[i];
				print(arr);
				if (i==0){
					arr[i]=a;
					print(arr);
				}
			}
		}
	}
	static void print(int a[]){
		for(int i:a)
			System.out.print(i+" ");
			System.out.println();
	}
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of element you want in array:");
			int n=sc.nextInt();
			int arr[]=new int [n];
			System.out.println("Enter number of element you want in array:");
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			insertionSort(n,arr);
			
		}
}


