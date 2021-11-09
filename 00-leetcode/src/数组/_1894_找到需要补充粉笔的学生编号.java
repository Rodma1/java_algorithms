package 数组;

public class _1894_找到需要补充粉笔的学生编号 {
	//解题思路：获取数组长度遍历, k减去元素,直到k<chalk[i]	
//	第一种代码超时了
    public int chalkReplacer(int[] chalk, int k) {
		int n=chalk.length;
		int i = 0;
		if (n==0) {
			return 0;
		}
		while(k>=0) {
			i=0;
			for(int num:chalk) {
				k=k-chalk[i];
				if (k<0) {
					break;
				}
				i++;
			}			
		}

		return i;
    }
//第二种思路,先遍历一遍，获取其数组总值，然后求其与k的余数,他们的余数就是最后剩下需要遍历的值
	public int chalkReplacer1(int[] chalk, int k) {
		int i = 0;
		int sum=k;
//		先遍历第一遍
		for(int num:chalk) {
			sum=sum-chalk[i];
			if (sum<0) {
				return i;
			}
			i++;
		}
//		求出他的余数就是他的要找的数
		int s=k%(k-sum);
		i=0;
		for(int num:chalk) {
			s=s-chalk[i];
			if (s<0) {
				return i;
			}
			i++;
		}

		return i;
    }
}
