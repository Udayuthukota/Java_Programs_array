

import java.util.ArrayList;
import java.util.List;

/**
 * @author uday uthukota

    1  2  3  5  6  the missing number is 4
 *
 */
public class FindMIssingNum {
	
	static void findmissingnumber(int[] arr,List<Integer> list) {
		
		
		int sum =0;
//		for(Integer x:arr)
//			sum = sum + x;
		
		for(Integer x:list)
			sum = sum + x;
		
		int len = list.size()+1; 
		int num = ((len*(len+1))/2);
		
		System.out.println("result="+(num-sum));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,6};
		
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(6);
		li.add(7);

		findmissingnumber(arr,li);
	}

}
