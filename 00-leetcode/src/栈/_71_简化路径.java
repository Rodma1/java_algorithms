package 栈;

import java.util.ArrayDeque;
import java.util.Deque;

public class _71_简化路径 {
    // 通过栈进行遍历，有效值才入栈
    // 如何找到有效值:遍历到当前/,下一个/
    public String simplifyPath(String path) {
        // 定义栈
        Deque<String> stack = new ArrayDeque<>();
        int len=path.length();
        for(int i=1;i<len;i++){
            // 如果当前是/就跳过
            if(path.charAt(i)=='/') continue;
            // 否者就开始遍历值，我们这里先循环到下一个/的位置
            int j=i+1;
            while(j<len&&path.charAt(j)!='/') j++;
            // 通过substring切割获取值
            String item=path.substring(i,j);
            // 将i放入到j的位置
            i=j;
            // 如果是..就出栈
            if(item.equals("..")){
                // 如果不为空
                if(!stack.isEmpty()){
                    stack.pollLast();
                }
            }
            // 否则如果item不为.
            else if(!item.equals(".")){
                stack.addLast(item);
            }
        }
        StringBuilder s=new StringBuilder();
        while(!stack.isEmpty()){
            s.append('/'+stack.pollFirst());
        }
        return s.length()==0?"/":s.toString();

    }
}
