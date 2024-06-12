package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * 实现RandomizedSet 类：
 *
 * RandomizedSet() 初始化 RandomizedSet 对象
 * bool insert(int val) 当元素 val 不存在时，向集合中插入该项，并返回 true ；否则，返回 false 。
 * bool remove(int val) 当元素 val 存在时，从集合中移除该项，并返回 true ；否则，返回 false 。
 * int getRandom() 随机返回现有集合中的一项（测试用例保证调用此方法时集合中至少存在一个元素）。每个元素应该有 相同的概率 被返回。
 * 你必须实现类的所有函数，并满足每个函数的 平均 时间复杂度为 O(1) 。
 */
public class Solution0308 {
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(1);
        boolean param_2 = obj.remove(2);
        int param_3 = obj.getRandom();
    }
}
class RandomizedSet {
    private Set<Integer> set;
    private List<Integer> list;
    private Random random;
    public RandomizedSet() {
        random = new Random();
        list = new ArrayList<>();
        set = new HashSet<>();
    }

    public boolean insert(int val) {
        if (set.add(val)) {
            list.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if (set.remove(val)) {
            list.remove((Object)val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
