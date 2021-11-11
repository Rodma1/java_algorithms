package 字符串;

/**
 * https://leetcode-cn.com/problems/longest-common-prefix/
 * 横向扫描:一个个比较
 */
public class _14最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
//        初始判断
        if (strs==null||strs.length==0){
            return "";
        }
//        定义返回值
        String prexi=strs[0];
        for (int i=1;i<strs.length;i++){
//            查看两个字符串那短
            int len=Math.min(prexi.length(),strs[i].length());
            int index=0;
//            遍历比较两个字符串
            while (index<len&&prexi.charAt(index)==strs[i].charAt(index)) {
                index++;
            }
//            获取到了他们两个相等的最长字符下标index
            prexi=prexi.substring(0,index);//裁剪
//            如果等于零说明没有相等字符
            if (prexi.length()==0){
                break;
            }
        }
        return  prexi;

    }

}
