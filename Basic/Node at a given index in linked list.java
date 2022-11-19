/*
Given a singly linked list with N nodes and a number X. The task is to find the node at the given index (X)(1 based index) of linked list. */

class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       int index = 1;//to keep track of index number
       
       while(node!=null)
       {
           if(index==ind)return node.data;//if index matches return the number
           index++;
           node = node.next;
       }
       return 0;
    }
    //Time Complexity : o(n)
    //Space Complexity : o(1)
}
