package 字符串;

import java.util.ArrayList;
import java.util.List;

public class _412_Fizz_Buzz {
    public List<String> fizzBuzz(int n) {
    	List<String> list=new ArrayList<String>();
    	int i=0;
    	while(i++<n) {
    		if (i%3==0&&i%5==0) {
    			list.add("FizzBuzz");
			}
    		else if (i%3==0) {
    			list.add("Fizz");
			}else if (i%5==0) {
				list.add("Buzz");
			}else {
				list.add(String.valueOf(i));
			}
    		
    	}
    	return list;
    }
}
