package Interview;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * 面试题 01.03. URL化
 * URL化。编写一种方法，将字符串中的空格全部替换为%20。
 * 假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。
 * （注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 *
 * 示例1:
 *
 *  输入："Mr John Smith    ", 13
 *  输出："Mr%20John%20Smith"
 * 示例2:
 *
 *  输入："               ", 5
 *  输出："%20%20%20%20%20"
 * 提示：
 *
 * 字符串长度在[0, 500000]范围内。
 */
public class replaceSpaces {
    @Test
    public static String replaceSpaces(String S, int length) {
        //解法一:char数组替换（时间空间最少）
        char[] cs=new char[length*3];
        int i=0;//用于遍历S字符串
        int j=0;//用于遍历cs字符转数组
        char c;
        while (i<length){
            c=S.charAt(i);
            if (c==' '){
                cs[j++]='%';
                cs[j++]='2';
                cs[j++]='0';
            }
            else{
                cs[j++]=c;
            }
            i++;
        }
        return new String(cs,0,j); 
        
    }
    
    //解法二,使用StringBuilder
    public static String solution2(String S, int length){
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<length;i++){
            if (S.charAt(i)==' '){
                sb.append("%20");
            }
            else{
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一串字符串");
        String line=in.nextLine();
        String str=replaceSpaces(line,line.length());
        System.out.println("URL后的字符串");
        System.out.println(str);
        System.out.println("------------------------");
        System.out.println("方法二，使用Stringbuilder");
        String str2=solution2(line,line.length());
        System.out.println("URL后的字符串");
        System.out.println(str2);
    }

}
