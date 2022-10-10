package HackerRank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
            
        int count =0;
        HashSet<Integer> set = new HashSet<>();
        
        for (int i=0;i<n;i++)
        {
            int element = ar.get(i);
            if(set.contains(element))
            {
                set.remove(element);
                count++;
            }
            else
            {
                set.add(element);
            }
            
            
        }
        return count;
    }

}

public class SalesByMatch {
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter The Array Range :=>");
	int n = sc.nextInt();
	
	System.out.println("You Entered" +n);
	
	
	
	
	
	
	List<Integer> al = new ArrayList<Integer>();

	for (int i = 0; i < n; i++) 
	{
		System.out.println("Enter Array Element");
		al.add(sc.nextInt());
		
	}
//	System.out.println("Enter  1 List Element"+al.add(+sc.nextInt()));
//	System.out.println("Enter  2 List Element"+al.add(+sc.nextInt()));
//	System.out.println("Enter  3 List Element"+al.add(+sc.nextInt()));
//	System.out.println("Enter  4 List Element"+al.add(+sc.nextInt()));
//	System.out.println("Enter  5 List Element"+al.add(+sc.nextInt()));
//	System.out.println("Enter  6 List Element"+al.add(+sc.nextInt()));
//	System.out.println("Enter  7 List Element"+al.add(+sc.nextInt()));
//	System.out.println("Enter  8 List Element"+al.add(+sc.nextInt()));
//	System.out.println("Enter  9 List Element"+al.add(+sc.nextInt()));
//	10, 20, 20, 10, 10, 30, 50, 10, 20
	Result r = new Result();
	System.out.println(r.sockMerchant(n, al));
	
	}
}
