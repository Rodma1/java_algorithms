package 栈;

import java.util.HashMap;
import java.util.Stack;

/*
 * 1
 * https://leetcode-cn.com/problems/valid-parentheses/
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 */
public class _20_有效的括号 {
//	方法一：遍历字符串，如果找到匹配的就删除。耗性能
	public boolean isValid(String s) {
		while (s.contains("{}")||s.contains("[]")||s.contains("()")) {
			s=s.replace("{}","");
			s=s.replace("[]","");
			s=s.replace("()","");
		}
//		如果是空就返回true，否则就false
		return s.isEmpty();
	}
//	方法二：通过栈判断
	public boolean isValid2(String s) {
//		new一个栈，泛型不能直接放基本输出类型char，只能放char对应的包装类Character
		Stack<Character> stack=new Stack<>();
		int len=s.length();
		for (int i=0;i<len;i++) {
			char c=s.charAt(i);
			if(c=='(' || c=='{'|| c=='[') {//左括号
//				将左括号的字符push进栈
				stack.push(c);
			}else {//右括号
				if (stack.isEmpty()) return false;
//				如果发现右括号就pop出来对比，比如栈里面有{，pop出来是栈顶的数}
				char left=stack.pop();
//				如果不匹配就返回false
				if (left=='('&& c!=')') return false;
				if (left=='{'&& c!='}') return false;
				if (left=='['&& c!=']') return false;
			}
		}
//		如果栈空说明全部匹配，返回true
		return stack.isEmpty();
	}
//	通过字典哈希map
	private static HashMap<Character, Character> map=new HashMap<>();
//	public _20_有效的括号() {
//		//key-value
//		map.put('(', ')');
//		map.put('{', '{');
//		map.put('[', ']');
//	}
	static {
		//key-value
		map.put('(', ')');
		map.put('{', '{');
		map.put('[', ']');
	}
//	通过栈判断
	public boolean isValid3(String s) {
//		new一个栈，泛型不能直接放基本输出类型char，只能放char对应的包装类Character
		Stack<Character> stack=new Stack<>();
		int len=s.length();
		for (int i=0;i<len;i++) {
			char c=s.charAt(i);
			if(map.containsKey(c)) {//左括号
//				将左括号的字符push进栈
				stack.push(c);
			}else {//右括号
				if (stack.isEmpty()) return false;
//				如果发现右括号就pop出来对比，比如栈里面有{，pop出来是栈顶的数}
				char left=stack.pop();
//				如果不匹配就返回false
				if(c!=map.get(left)) return false;
			}
		}
//		如果栈空说明全部匹配，返回true
		return stack.isEmpty();
	}	
}
