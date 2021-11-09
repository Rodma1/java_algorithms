package 双指针;

import javax.security.auth.x500.X500Principal;

/*
 * https://leetcode-cn.com/problems/compare-version-numbers/
 */
public class _165_比较版本号 {
//	可以用双指针遍历判断两个字符串标点符号前面的数和后面的的数是否对应相等，判断01和001是否相等可以直接用加法就行
//	也就是说我们先将字符变成整数才能判断,version1.charAt(i) - '0'
    public int compareVersion(String version1, String version2) {
//    	定义两个指针
    	int left1=0,left2=0;
//    	获取字符长度
    	int len1=version1.length(),len2=version2.length();
//    	while循环遍历两个字符串
    	while(left1<len1||left2<len2) {
    		
//    		定义一个值来统计逗号前后的数
    		int sum1=0;
//    		通过for循环遍历字符转换成整形数字，直到遇见逗号或字符串末尾结束
    		for(;left1<len1&&version1.charAt(left1)!='.';left1++) {
//    			字符0的ascll是48,比如'1'-'0'=1
    			sum1=sum1*10+(version1.charAt(left1)-'0');
    		}
    		left1++;//跳过逗号
//    		第二个字符串同理
    		int sum2=0;
//    		通过for循环遍历字符转换成整形数字，直到遇见逗号或字符串末尾结束
    		for(;left2<len2&&version2.charAt(left2)!='.';left2++) {
//    			字符0的ascll是48,比如'1'-'0'=1
    			sum2=sum2*10+(version2.charAt(left2)-'0');
    		}
    		left2++;//跳过逗号
//    		最后通过比较sum1和sum2,根据题目要求小于就返回-1大于就返回1
//    		if (sum1<sum2) {
//				return -1;
//    		}else {
//				return 1;
//    		}
    		if (sum1!=sum2) {
//    			三目运算
				return sum1<sum2?-1:1;
			}
    			
    	}    	
//    	如果相等就返回0
    	return 0;
    }
}
