package 模拟;

public class _1189_气球的最大数量 {
    public int maxNumberOfBalloons(String text) {
        // 逐个统计他们的个数
        int[] cnt=new int[5];
        for(int i=0;i<text.length();i++){
            char s=text.charAt(i);
            if(s=='b'){
                cnt[0]++;
            }else if(s=='a'){
                cnt[1]++;
            }else if(s=='l'){
                cnt[2]++;
            }else if(s=='o'){
                cnt[3]++;
            }else if(s=='n'){
                cnt[4]++;
            }
        }
        cnt[2]/=2;
        cnt[3]/=2;
        int num=cnt[0];
        for(int i:cnt){
            if(num>i){
                num=i;
            }
        }
        return num;
    }
}
