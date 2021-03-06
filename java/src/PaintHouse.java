public class PaintHouse {
    public int minCost(int[][] costs) {
     if(costs == null || costs.length == 0) return 0;
     int m = costs.length;
     int n = 3;
     int[][] mincosts = new int[m][3];
     mincosts[0][0] = costs[0][0];
     mincosts[0][1] = costs[0][1];
     mincosts[0][2] = costs[0][2];
     for(int i =1; i < m; i++)
     {
         mincosts[i][0] = Math.min(mincosts[i-1][1], mincosts[i-1][2]) + costs[i][0];
         mincosts[i][1] = Math.min(mincosts[i-1][0], mincosts[i-1][2]) + costs[i][1];
         mincosts[i][2] = Math.min(mincosts[i-1][0], mincosts[i-1][1]) + costs[i][2];
     }
     int min = Math.min(mincosts[m -1][0], mincosts[m -1][1]);
     min = Math.min(min, mincosts[m -1][2]);
     return min;
    }
    }
    
 
