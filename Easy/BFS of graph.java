/*
Given a directed graph. The task is to do Breadth First Traversal of this graph starting from 0.
Note: One can move from node u to node v only if there's an edge from u to v and find the BFS traversal of the graph starting from the 0th vertex, from left to right according to the graph. Also, you should only take nodes directly or indirectly connected from Node 0 in consideration.


Example 1:

Input:

Output: 0 1 2 3 4
Explanation: 
0 is connected to 1 , 2 , 3.
2 is connected to 4.
so starting from 0, it will go to 1 then 2
then 3.After this 2 to 4, thus bfs will be
0 1 2 3 4.
Example 2:

Input:

Output: 0 1 2
Explanation:
0 is connected to 1 , 2.
so starting from 0, it will go to 1 then 2,
thus bfs will be 0 1 2. 
*/

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfs = new ArrayList<>();
        
        Queue<Integer> que = new LinkedList<>();
        
        boolean[] visited = new boolean[V];
        
        que.add(0);
        
        while(!que.isEmpty())
        {
            int front = que.peek();
            que.remove();
            
            //If already visited just skip that element
            if(visited[front])
            {
                continue;
            }
            
            //else process. that before that mark it as visited
            visited[front] = true;
            //add element to result list
            bfs.add(front);
            
            //check all vertex connected to it
            for(int neighbour : adj.get(front))
            {
                if(visited[neighbour]==false) 
                    que.add(neighbour);
            }
        }
        
        return bfs;
        //Time Complexity : O(V+E)
        //Space Complexity : O(V)
    }
}
