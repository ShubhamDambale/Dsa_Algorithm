package Dsa_Algorithm.Array;

import java.util.ArrayList;
import java.util.List;

public class Insert_Interval {
    
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> res = new ArrayList<>();
        int i = 0;
        
        // Add all the intervals which end before newInterval starts.
        while(i < intervals.length && intervals[i][1] < newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        
        // merge all overlapping intervals into one newInterval.
        while(i < intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1]= Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        res.add(newInterval); //Add the newInterval which we found above.
        
        //Add rest;
        while(i < intervals.length){
            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int[res.size()][]);
    }
}
