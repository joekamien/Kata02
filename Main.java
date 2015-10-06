import java.util.*;

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
		
		
	}
}
