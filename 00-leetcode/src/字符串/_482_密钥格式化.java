package 字符串;

public class _482_密钥格式化 {
    public String licenseKeyFormatting(String s, int k) {
    	StringBuilder s1=new StringBuilder();
    	int j=k;
    	for(int i=s.length()-1;i>=0;i--) {
    		if (j!=0&&s.charAt(i)=='-') {
                
				continue;
			}else if (j==0) {
                j=k;
                if(s.charAt(i)!='-'){
                    
                    s1.append('-');
                }
                // System.out.println(s1);
                
			}
            
            if(s.charAt(i)!='-'){
                j--;
            }
            if(s.charAt(i)>='a'){
                s1.append((char)(s.charAt(i)-32));
            }else{
                s1.append(s.charAt(i));
            }
            
    		
    	}
        s1=s1.reverse();

        if(s1.length()!=0&&s1.charAt(0)=='-'){
            s1.deleteCharAt(0);
        }
    	return s1.toString();
    }
}
