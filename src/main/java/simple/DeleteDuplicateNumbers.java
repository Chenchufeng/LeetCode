package simple;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 删除排序数组中的重复项
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 *示例 1:
 *
 * 给定数组 nums = [1,1,2],
 *
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 *
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class DeleteDuplicateNumbers {

    public static int removeTheagain(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        if(array == null || array.length == 0) {
            return 0;
        } else if(array.length == 1) {
            return 1;
        } else {
            int i = 0;
            int n = array.length - 1; // 数组的最后一个元素的索引
            while (i <= n) {
                if(i == n) { // 走到了最后一个元素了,肯定是没有重复的 > 先先下面的算法
                    list.add(array[i]);
                } else {
                    int j = i+1; // 需要用来跟前面的元素进行比较的索引
                    if(array[i] == array[j]) { // 跟i索引大1的的元素跟i相等(相邻的两个元素相等)
                        // 跟i相邻的后一个元素跟i相等,那么还需要继续判断这个元素之后的元素是否跟i有相等的
                        while(j <= n && array[i] == array[j]) { // 遍历完元素,或者一旦发现没有相等了的就跳出来,(数组之前就已经进行了排序)
                            j++; // 如果后面的跟当前i有相等的,那么j就不断往后走,看后面是否还有相等的
                        }
                    }
                    list.add(i); // 需要把i索引加入到这个list集合中
                    // i的索引需要变成i相同元素的最后一个索引加1的位置(因为这个位置是跟i是不同的之后的第一个位置)
                    i = j;  // 此时还可能在循环中,还需要继续进行判断
                }
            }
        }
        for(int k = 0; k < list.size(); k++) {
            array[k] = list.get(k);
        }
        for (int i=0;i<list.size();i++){
            System.err.println(list.get(i));
        }
        return list.size();
    }

    public static void main(String[] args) {
        int array[] = new int[]{1,2,2};
        removeTheagain(array);
    }
}
