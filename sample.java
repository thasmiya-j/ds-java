package arrays;
import java.util.Scanner;
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		if(sc.hasNextInt()) 
    {
		int arr_size = sc.nextInt();
    }
		int[]arr = new  int[arr_size];
		System.out.println("Enter the elements of the array : ");
		
		for (int i=0;i<arr_size;i++)
		{
			if(sc.hasNextInt())
      {
				arr[i] = sc.nextInt();
			}
			
		}
		System.out.println(" The elements of the array are : ");
		
		for (int i=0;i<arr_size;i++)
    {
			System.out.println(arr[i] + " ");
		}
		

	}

}
