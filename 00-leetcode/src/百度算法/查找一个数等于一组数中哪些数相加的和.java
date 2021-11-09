package 百度算法;
import java.util.ArrayList;
import java.util.List;
public class 查找一个数等于一组数中哪些数相加的和 {
	 public static List<Double> list = new ArrayList<Double>();

	    public static void main(String[] args) {
	        double[] keys = { 1};
	        System.err.println(getNum(keys, 1));
	    }

	    static int getNum(double[] keys, double kill) {
	        int n = keys.length;
	        int nbit = 1 << n;
	        double in;
	        int ans=0;
	        List<Double> list = new ArrayList<Double>();
	        for (int i = 0; i < nbit; i++) {
	            in = 0;
	            list.clear();
	            for (int j = 0; j < n; j++) {
	                int tmp = 1 << j; // 由0到n右移位
	                if ((tmp & i) != 0) { // 与运算，同为1时才会是1
	                    in += keys[j];
	                    list.add(keys[j]);
	                }
	            }
	            if (in == kill)
	                ans++;
	        }
	        return ans;
	    }

}
