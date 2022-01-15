package 数学;

public class _1716_计算力扣银行的钱 {
    // 暴力破解
    public int totalMoney(int n) {
        int num=1;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=num;
            if(i%7==0){
                num=i/7;
            }
            num++;
        }
        return sum;
    }
}
