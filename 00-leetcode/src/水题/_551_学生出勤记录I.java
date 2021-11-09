package 水题;

public class _551_学生出勤记录I {
	public  static boolean checkRecord(String s) {
		int h=0,j=0;
		for (int i=0;i<s.length();i++) {
			
			if (s.charAt(i)=='A') {
				h++;
				if (j<3) {
					j=0;
				}
			}
			else if (s.charAt(i)=='L') {
				j++;
			}else {
				j=0;
			}
			if (h>=2 || j>=3) {
				return false;
			}
			System.out.print(h);
			System.out.print(j);
			
		}
		return true;
    }
	public static void main(String args[]) {
		String s="PPALLL";
		boolean c=checkRecord(s);
		System.out.print(c);
	}
}
