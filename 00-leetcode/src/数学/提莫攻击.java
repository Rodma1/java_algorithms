package 数学;

/**
 * https://leetcode-cn.com/problems/teemo-attacking/
 * 这道题相当于区间合并问题
 * 每次中毒都加上duration,然后判断timeSeries[i]是否大于前面中毒结束的时间，没有大于就加上duration减去上一次中毒结束的时间
 */
public class 提莫攻击 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
//        每一次中毒的结束时间
        int end=0;
//        总中毒时间
        int sum=0;
        for (int i=0;i<timeSeries.length;i++){

//            如果第二次中毒时间大于等于第一次中毒结束时间，就加上总中毒时间
            if (timeSeries[i]>=end){
                sum+=duration;
            }
//            否则就是小于第一次中毒的结束时间，那么我们将这一秒的中毒结束时间减去上一秒的结束时间，就知道他持续中毒了多久
            else{
                sum+=timeSeries[i]+duration-end;
            }
//            中毒之后计算他结束的时间
            end=timeSeries[i]+duration;
        }
        return  sum;
    }
}
