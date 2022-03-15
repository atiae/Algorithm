package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

import javax.swing.text.html.HTMLDocument.RunElement;

/**
 * leet435
 */
public class leet435 {

    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0){
            return 0;
        }
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] interval1,int[] interval2){
                return interval1[1] - interval2[1];
            }
        } );
        int size = intervals.length;
        int total = 0;
        int prev=intervals[0][1];
        for(int i=1;i<size;++i){
            if(intervals[i][0]<prev){
                ++total;
            }else{
                prev = intervals[i][1];
            }
        }
        return total;
    }
}