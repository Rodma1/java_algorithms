package 字符串;

/**
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * 方法一：遍历替换
 * 方法二：java自带的api
 */
public class 剑指Offer05替换空格 {
//    通过for循环遍历
    public String replaceSpace(String s) {
//        获取长度
        int len=s.length();
//        初始化字符串变量
        StringBuffer stringBuffer=new StringBuffer();
        for (int i=0;i<len;i++){
//            如果字符为空格就替换
            if (String.valueOf(s.charAt(i)).equals(" ")){
                stringBuffer.append("%20");
            }
            else {
                stringBuffer.append(s.charAt(i));
            }
        }
        return  stringBuffer.toString();

    }
    /**
     * 直接使用api,不过这个效率没上面那个高
     */
    public String replaceSpace1(String s) {
//        return str.toString().replaceAll("\\s", "%20");
        return s.replaceAll(" ","%20");
    }

}
