package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution0012 {
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num) {
        if (num < 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            if (num < 1) {
                break;
            }
            if (num == values[i]) {
                sb.append(symbols[i]);
                break;
            }
            if (num > values[i]) {
                int flag = num / values[i];
                for (int j = 0; j < flag; j++) {
                    sb.append(symbols[i]);
                }
                num = num % values[i];
            }
        }
        return sb.toString();
    }

}
