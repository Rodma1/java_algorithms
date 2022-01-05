package 字符串;

public class _1576_替换所有的问号 {
    // 模拟
    public String modifyString(String s) {
        // 转为字符数组
        char[] ss=s.toCharArray();
        // for循环遍
        for(int i=0;i<ss.length;i++){
            if(ss[i]=='?'){
                char a='a';
                while((i>0&&ss[i-1]==a)||(i<ss.length-1&&ss[i+1]==a)){
                    a++;
                }
                ss[i]=a;
            }
        }
        return String.valueOf(ss);

    }
}
