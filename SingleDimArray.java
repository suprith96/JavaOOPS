
import java.util.Scanner;

public class SingleDimArray {

	public static void main(String[] args) {
		
		int n,i;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many elements to store in array ?");
		n = scan.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter "+n+" elements:");
		for(i=0; i<n; i++)
		arr[i] = scan.nextInt();
		System.out.println("\nThe Array is:");
		for(i=0; i<n; i++)
			System.out.print(arr[i]+"");

	}

}
