import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Given a collection of intervals, merge all overlapping intervals.
public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> slotsList = new ArrayList<Interval>();
        Interval current;
        Interval last;
        if(intervals == null || intervals.size() == 0) return slotsList;
        Collections.sort(intervals, new Comparator<Interval>(){
           public int compare(Interval i1, Interval i2){
               if(i1.start == i2.start) return 0;
               if(i1.start < i2.start) return -1;
               return 1;
           } 
        });
        slotsList.add(intervals.get(0));
        for(int i = 1; i < intervals.size(); i++){
            last = slotsList.get(slotsList.size() - 1);
            current = intervals.get(i);
            if(last.end >= current.start)
            {
                last.end = Math.max(last.end, current.end);    
            }
            else
            {
                slotsList.add(current);
            }
        }
        return slotsList;
    }

    class Interval{
        long start;
        long end;
    }
}
