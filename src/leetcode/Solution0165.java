package leetcode;

import java.util.HashSet;


public class Solution0165 {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        for(int i = 0; i < Math.max(arr1.length, arr2.length); i ++) {
            int temp1 = 0, temp2 = 0;
            if (i < arr1.length) {
                temp1 = Integer.parseInt(arr1[i]);
            }
            if (i < arr2.length) {
                temp2 = Integer.parseInt(arr2[i]);
            }
            if (temp1 == temp2) {
                continue;
            } else if (temp1 > temp2) {
                return 1;
            } else {
                return -1;
            }
        }
        return 0;
    }
}
