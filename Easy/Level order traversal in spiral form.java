/*
Complete the function to find spiral order traversal of a tree. For below tree, function should return 1, 2, 3, 4, 5, 6, 7.


 
 

Example 1:

Input:
      1
    /   \
   3     2
Output:1 3 2

Example 2:

Input:
           10
         /     \
        20     30
      /    \
    40     60
Output: 10 20 30 60 40 
*/
class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null) return result;
        Queue<Node> que = new LinkedList<>();
        
        que.add(root);
        
        //false, stands for left to right
        Boolean dir = true;
        while(!que.isEmpty())
        {
            ArrayList<Integer> temp = new ArrayList<>();
            int count = que.size();
            
            while(count != 0)
            {
                Node curr = que.poll();
                temp.add(curr.data);
                if(curr.left!=null) que.add(curr.left);
                if(curr.right!=null) que.add(curr.right);
                count--;
            }
            //left to right
            if(dir==false)
            {
                for(int each:temp)
                {
                    result.add(each);
                }
                dir=true;
            }
            
            //right to left
            else if(dir==true)
            {
                Collections.reverse(temp);
                
                for(int each:temp)
                {
                    result.add(each);
                }
                dir = false;
            }
        }
        
        return result;
        //Time Complexity : O(n)
        //Space Complexity : O(n)
    }
}
