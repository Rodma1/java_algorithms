package ks;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
 * 有 n 件物品和一个最大承重为 W 的背包，每件物品的重量是 𝑤i、价值是 𝑣
 * 价值密度=价值/重量
 */
public class 背包问题 {
	public static void main(String args[]) {
//		由于重量要小到大,所以a1-a2
		run("重量主导", (Article a1,Article a2)->{return a1.weight-a2.weight;});
//	价格肯定要大到小
		run("价格主导", (Article a1,Article a2)->a2.value-a1.value);
//		由于密度是价格除重量,所以也是大到小
		run("密度主导", (Article a1,Article a2)->Double.compare(a2.ValueDensity,a1.ValueDensity));
/*
 * 	compare()方法用于检查给定两个双精度值的相等或不相等，换句话说，可以说此方法用于比较两个双精度值。
 *在第一种情况下，如果value1在数学上等于value2 ，则它返回0。
 *在第二种情况下，如果value1在数学上小于value2 ，则它返回值<0。
 *在第三种情况下，如果value1在数学上大于value2 ，则返回值> 0。
 */
		
	}
//	Comparator<Article> comparator是排序算法的比较器
	public static void run(String titile,Comparator<Article> comparator) {
//		调用物品类,定义数组
		Article[] articles=new Article[] {
				new Article(35, 10),new Article(30, 40),
				new Article(60, 30),new Article(50, 50),
				new Article(40, 35),new Article(10, 40),
				new Article(25, 30)
		};
//		将数组里的元素按照比较器排序
		Arrays.sort(articles,comparator);
//		设定限定重量,物品重量，物品价值
		int capacity=150,weight=0,value=0;
//		定义list方便打印输出观察
		List<Article> selectedArticles=new ArrayList<>();
//		通过for循环遍历数组重量来进行比较
		for(Article article:articles ) {
////			如果大于限定的重量,循环结束
			if (weight>capacity) {
				break;
			}
//			追加重量
			int newWeight=article.weight+weight;
//			如果追加的重量小于限定重量就可以增加
			if (newWeight<=capacity) {
//				存入列表
				selectedArticles.add(article);
//				保存重量
				weight=newWeight;
//				追加价格
				value+=article.value;
			}
		}
//		输出
		System.out.println("————————"+titile+"————————————");
		System.out.println("总价值："+value);
		for(Article article:selectedArticles) {
			System.out.println(article);
		}
		
		
	}
}
