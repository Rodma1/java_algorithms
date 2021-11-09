package ks;
/*
 * 物品类
 */
public class Article {
//	重量
	public int weight;
//	价值
	public int value;
//	密度
	public double ValueDensity;
	public Article(int weight,int value) {
		this.weight=weight;
		this.value=value;
		ValueDensity=value*1.0/weight;
	}
//	打印
	public String toString() {
		return "[weight="+weight+",value="+value+",ValueDensity"+ValueDensity+"]";
	}
}
