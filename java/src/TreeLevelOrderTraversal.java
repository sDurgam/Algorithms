import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> treeList = new ArrayList<List<Integer>>();
        List<Integer> nodesList = null;
        if(root == null)
        {
            return treeList;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int currentlevelcount = 0;
        int nextlevelcount = 0;
        TreeNode node;
        queue.add(root);
        nodesList = new ArrayList<Integer>();
        nodesList.add(root.val);
        treeList.add(nodesList);
        currentlevelcount = 1;
        nodesList = new ArrayList<Integer>();
        while(!queue.isEmpty())
        {
            node = queue.poll();
            currentlevelcount = currentlevelcount - 1;
            if(node.left != null)
            {
                queue.add(node.left);   
                nodesList.add(node.left.val);
                nextlevelcount ++;
            }
            if(node.right != null)
            {
                queue.add(node.right);
                nodesList.add(node.right.val);
                nextlevelcount ++;
            }
            if(currentlevelcount == 0 && nextlevelcount != 0)
            {
                    currentlevelcount = nextlevelcount;
                    nextlevelcount = 0;
                    treeList.add(nodesList);
                    nodesList = new ArrayList<Integer>();
            }
        }
        return treeList;
    }
}
