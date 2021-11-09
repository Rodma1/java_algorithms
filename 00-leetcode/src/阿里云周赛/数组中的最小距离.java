package 阿里云周赛;


public class 数组中的最小距离 {
    public int[] minimalDistance(int[] a, int[] b) {
        // Write your code here 
    	int[] res=new int[b.length];
    	
    	for(int i=0;i<b.length;i++) {
    		int min=Integer.MAX_VALUE;
    		int index=0;
    		for(int j=0;j<a.length;j++) {
    			int sum=Math.abs(b[i]-a[j]);
    			if (sum==0) {
					res[i]=b[j];
				}else if (sum==min) {
					if (a[index]>a[j]) {
						res[i]=a[j];
					}
				}else if(sum<min) {
					min=sum;
					index=j;
					res[i]=a[index];
				}
    		}
    	}
    	return res;
    }
}
