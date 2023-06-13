//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        //creating list of 1d arrays for storing result intervals
        List<int[]> result = new ArrayList<>();
        
        //checking for empty input
        if(Intervals.length == 0 || Intervals == null)
            return result.toArray(new int[0][]);
            
        //sorting based on first element on given intervals
        Arrays.sort(Intervals, (a, b) -> a[0] - b[0]);
        
        //marking start and end
        int start = Intervals[0][0];
        int end = Intervals[0][1];
        
        //looping through the entire Intervals
        for(int[] current : Intervals){
            //if interval is submerging
            if(current[0] <= end)
                end = Math.max(end, current[1]);
            //else add it to result list by updating start and end    
            else{
                result.add(new int[]{start, end});
                start = current[0];
                end = current[1];
            }    
        }
        result.add(new int[]{start,end});
        
        return result.toArray(new int[0][]);
        
        /**
        Complexity Analysis:
        Time -> O(N log N) for sorting
                O(n) for traversing
        therefore, O(N log N) + O(n) for Time
        
        Space -> O(n) at worst case if there 
        is no submerging intervals         
        */
    }
}
