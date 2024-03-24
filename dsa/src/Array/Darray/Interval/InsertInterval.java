package Darray.Interval;

// import java.io.*;
import java.util.*;

public class InsertInterval {

    // You are given an array of non-overlapping intervals intervals where
    // intervals[i] = [starti, endi]
    // represent the start and the end of the ith interval and intervals is sorted
    // in ascending order by
    // starti. You are also given an interval newInterval = [start, end] that
    // represents the start and
    // end of another interval.

    // Insert newInterval into intervals such that intervals is still sorted in
    // ascending order by
    // starti and intervals still does not have any overlapping intervals (merge
    // overlapping intervals if
    // necessary).

    // Return intervals after the insertion.

    // Note that you don't need to modify intervals in-place. You can make a new
    // array and return it.

    // Example 1:

    // Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
    // Output: [[1,5],[6,9]]

    public static void main(String[] args) {
        int[][] ans = Insert(new int[][] { { 1, 3 }, { 6, 9 } }, new int[] { 2, 5 });
        for (var i : ans) {
            System.out.println(i[0] + " " + i[1]);
        }
    }

    private static int[][] Insert(int[][] interval, int[] newInt) {
        List<int[]> res = new ArrayList<>();
        int ind=0;
        // Add the item to the list if the start of new interval is greater than end of existing
        while(ind<interval.length&& newInt[0]>interval[ind][1]){
            res.add(interval[ind++]);
        }

        while(ind<interval.length && (interval[ind][0]<=newInt[1]) ){
            newInt[0]=Math.min(interval[ind][0],newInt[0]);
            newInt[1]=Math.max(interval[ind][1],newInt[1]);
            ind++;
        }
        res.add(newInt);

        while(ind<interval.length){
            res.add(interval[ind++]);
        }

        return res.toArray(new int[res.size()][]);
    }

}
