package Interview;

import org.junit.jupiter.api.Test;

/**
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 *
 * 示例 1：
 *
 * 输入: s = "leetcode"
 * 输出: false 
 * 示例 2：
 *
 * 输入: s = "abc"
 * 输出: true
 *
 */
public class isUnique {
    
    public static boolean isUnique(String astr) {
        byte[] char_array=new byte[256];
        for(int i=0;i<astr.length();i++){
            if(char_array[(byte)astr.charAt(i)]==0){
                char_array[(byte)astr.charAt(i)]++;
            }
            else return false;
        }
        return true;    
    }
    public static void main(String[] args) {
        String str="leetcode";
        System.out.println(isUnique(str));
        String str2="chen";
        System.out.println(isUnique(str2)  );
    }
}
