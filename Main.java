public class Main {

	public static int chop(int target, int[] array){
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
		
		int low = 0;
		int high = array.length - 1;
		
		/*
		 * as long as there are more than two elements in the array, test what's in the middle
		 * if the value there is less than the target, then that location becomes the bottom of the range to test
		 * otherwise it becomes the top
		 */
		
		while(high - low >= 2){
			int guess = (high - low) / 2 + low;
			
			int currentVal = array[guess]; 
			if(currentVal == target){
				return guess;
			}
			else if (currentVal < target){
				low = guess;
			}
			else{
				high = guess;
			}
		}
		
		// if there are exactly two cases, then just test each one
		if(array[high] == target){
			return high;
		}
		if(array[low] == target){
			return low;
		}
		
		// if we reached this point, then the target wasn't found
		return -1;
	}
}
