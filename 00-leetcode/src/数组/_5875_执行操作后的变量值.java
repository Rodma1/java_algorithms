package 数组;

public class _5875_执行操作后的变量值 {
    public int finalValueAfterOperations(String[] operations) {
    	int x=0;
    	for(String operation:operations) {
    		if (operation.equals("--X")||operation.equals("X--")) {
				x--;
			}
    		else {
    			x++;
			}
    	}
    	return x;
    }
}
