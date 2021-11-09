package 数组;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.omg.CORBA.PUBLIC_MEMBER;
/*
 * https://leetcode-cn.com/problems/valid-sudoku/submissions/
 */
public class _36_有效的数独 {
//通过哈希表判断是否有重复的数字，在通过for循环一个个遍历
    public boolean isValidSudoku(char[][] board) {
//	通过哈希映射,如果有数大于2的就返回false
//    	我们这里设置存储列的哈希，行的哈希和子独数的哈希
    	HashMap<Integer, Integer>[] rows=new HashMap[9];//行
    	HashMap<Integer, Integer>[] colums=new HashMap[9];//列
    	HashMap<Integer, Integer>[] boxes=new HashMap[9];//子独数
//    	由于这里是九行九列,所以我们要遍历一下给每个都设置一个哈希空间
    	for(int i=0;i<9;i++) {
    		rows[i]=new HashMap<>();
    		colums[i]=new HashMap<>();
    		boxes[i]= new HashMap<>();
    	}
    	
//    	先遍历每一行,在遍历每一列
    	for(int row=0;row<9;row++){
//    		遍历每行每一列
    		for(int colum=0;colum<9;colum++) {
//    			或去row行colum列的值
    			char num=board[row][colum];
//    			如果不是.号就转化为数字存入哈希中
    			if (num!='.') {
					int n=(int)num;
//					存入每一行
					rows[row].put(n, rows[row].getOrDefault(n, 0)+1);
//					存入每一列
					colums[colum].put(n, colums[colum].getOrDefault(n, 0)+1);
//					设定每一个小独数，跟人工智能的
					int box_index=(row/3)*3+(colum/3);
//					存入每一个小独数的元素
					boxes[box_index].put(n, boxes[box_index].getOrDefault(n, 0)+1);
//					在判断一下这三个哈希表的值是否存在大于1的，因为大于一就说明有重复的值
					if (rows[row].get(n)>1||colums[colum].get(n)>1||boxes[box_index].get(n)>1) {
						return false;
					}
				}
    		}
    	}
    	
    	
    	return true;
    }
}
