package 数学;
//通过公式(x+1)*x/2=n  通过判别式知道n的公式
public class _441_排列硬币 {
    public  static int  arrangeCoins(int n) {
    	System.out.println(Math.sqrt((long)8*n+1));
//    	sqrt是取他的根号
        return (int)(Math.sqrt((long)8*n+1)-1)/2;
    }
    public static void main(String[] args) {
		arrangeCoins(9);
	}
}
