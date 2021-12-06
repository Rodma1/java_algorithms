package 字符串;

public class _1816_截断句子 {
    public String truncateSentence(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ss : s.toCharArray()) {
            if (ss == ' ') {
                k--;
                if (k == 0) {
                    return stringBuilder.toString();

                }
            }
            stringBuilder.append(ss);
        }

        return stringBuilder.toString();
    }
    public String truncateSentence1(String s, int k) {
        String[] ss= s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<k;i++){
            stringBuilder.append(ss[i]+' ');
        }
        return stringBuilder.toString().trim();
    }
}
