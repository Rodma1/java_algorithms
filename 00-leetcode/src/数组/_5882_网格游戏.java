package 数组;

public class _5882_网格游戏 {
    public long gridGame(int[][] grid) {
//    	如果他向下移动就只能一直右走
//    	先将二维数组第一个走过的设置为零
    	long max=0;
    	grid[0][0]=0;
    	grid(grid);
    	int left=1;
    	

    	return max;
    	
    }
    public long grid(int[][] grid){
        int left=1;
    	long max1=grid[0][0];
    	long max2=0;
    	int p=0;
    	while(left<grid[0].length) {
    		
    		if (p==0&&grid[0][left]<grid[1][left-1]) {
    			long max=max1;
    			int left1=left-1;
    	    	while(left1<grid[0].length) {

    				max+=grid[1][left1];
    				left1++;
    				
    	    	}
    	    	p++;
    	    	max2=Math.max(max, max2);
			}else if(p==1&&grid[0][left]>grid[1][left-1]){
                
				long max=max1+grid[0][left];
    			int left1=left;
    	    	while(left1<grid[0].length) {

    				max+=grid[1][left1];
    				left1++;
    				
    	    	}
    	    	p--;
    	    	max2=Math.max(max, max2);
                // System.out.print(max+max1);
			}
//    		else if (grid[0][i]==grid[1][i-1]) {
//    			
//				grid[0]
//			}
            max1+=grid[0][left];
    		left++;
    	}
        return max2;
    }
    
    public void gridG(int[][] grid) {
        int left=1;
     	long max1=grid[0][0];
     	long max2=0;
     	int p=0;
     	while(left<grid[0].length) {
     		
     		if (p==0&&grid[0][left]<grid[1][left-1]) {
     			long max=max1;
     			int left1=left-1;
     			
     	    	while(left1<grid[0].length) {

     				max+=grid[1][left1];
     				left1++;
     				
     	    	}
     	    	p++;
     	    	max2=Math.max(max, max2);
 			}else if(p==1&&grid[0][left]>grid[1][left-1]){
                 
 				long max=max1+grid[0][left];
     			int left1=left;
     	    	while(left1<grid[0].length) {

     				max+=grid[1][left1];
     				left1++;
     				
     	    	}
     	    	p--;
     	    	max2=Math.max(max, max2);
                 // System.out.print(max+max1);
 			}
//     		else if (grid[0][i]==grid[1][i-1]) {
//     			
// 				grid[0]
// 			}
            max1+=grid[0][left];
     		left++;
     	}
 
    }
}
