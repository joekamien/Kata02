import java.util.*;

public class Main {

	public static void main(String[] args) {
		
	}

	public static int chop(int target, int[] array){
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
		
		int halfwayPoint = array.length / 2;
		int halfwayVal = array[halfwayPoint];
		
		if (halfwayVal == target){
			return halfwayPoint;
		} else if (halfwayVal < target){
			//generate new array from top half of array and run recursively
			return halfwayPoint + chop(target, Arrays.copyOfRange(array, halfwayPoint, array.length - 1));
		}
		else{
			//generate new array from bottom half of array and run recursively
			return chop(target, Arrays.copyOfRange(array, 0, halfwayPoint));
		}
	}
}
