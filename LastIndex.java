// last occurence of element in java
import java.util.*;
public class LastIndex {
	
	private static int lastOccurence(int[] input, int key, int startIndex) {
		if(startIndex == input.length) {
			return -1;
		}
		int smallAns = lastOccurence(input, key, startIndex+1);
		if(smallAns != -1) {
			return smallAns;
		}
		if(input[startIndex] == key) {
			return startIndex;
		}
		else {
			return -1;
		}
	}
	
	public static int lastOccurence(int[] input, int key) {
		return lastOccurence(input, key, 0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(lastOccurence(arr, x));
		sc.close();
	}

}