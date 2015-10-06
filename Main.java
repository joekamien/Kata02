import java.util.*;

public class Main {
	
	public static int chop(int target, int[] array){
		System.out.println(Arrays.toString(array));
		//handle base cases
		if (array.length == 0){
			return -1;
		}else if (array.length == 1){
			if (array[0] == target){
				return 0;
			}
			else{
				return -1;
			}
		}
		
		//if we reached here, then the array has at least two values
		int halfwayPoint = array.length / 2;
		int halfwayVal = array[halfwayPoint];
		System.out.println(halfwayPoint);
		System.out.println(halfwayVal);
		
		if (halfwayVal == target){
			return halfwayPoint;
		} else if (halfwayVal < target){
			//generate new array from top half of array and run recursively
			int searchVal = chop(target, Arrays.copyOfRange(array, halfwayPoint + 1, array.length));
			if(searchVal >= 0){
				return halfwayPoint + 1 + searchVal;
			}
		}
		else{
			//generate new array from bottom half of array and run recursively
			return chop(target, Arrays.copyOfRange(array, 0, halfwayPoint));
		}
		
		return -1;
	}
}
