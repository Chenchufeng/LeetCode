package Interview;

import java.util.Scanner;

/**
 
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 *
 * 示例 1：
 * 输入: s1 = "abc", s2 = "bca"
 * 输出: true 
 * 
 * 示例 2：
 * 输入: s1 = "abc", s2 = "bad"
 * 输出: false
 * 说明：
 * 0 <= len(s1) <= 100
 * 0 <= len(s2) <= 100
 */
public class CheckPermutation {
    //新方法：把双字符串变成对应整数累加，和相等即相同
    public static boolean CheckPermutation(String s1, String s2) {
        if (s1.length()!=s2.length()){
            return false;
        }
        int lens1=s1.length();
        int lens2=s2.length();
        int counts1=0;
        int counts2=0;
        for(int i=0;i<s1.length();i++){
            counts1+=(int) s1.charAt(i);
        }
        for (int i=0;i<s2.length();i++){
            counts2+=(int) s2.charAt(i);
        }
        if (counts1==counts2)
            return true;
        else return false;
        
    }
    public static void main(String[] args) {
        System.out.println("Please Input two String");
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        boolean flag=CheckPermutation(s1,s2);
        System.out.println("Result:"+' '+flag);
    }
}
