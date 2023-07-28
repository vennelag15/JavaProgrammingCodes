public class BST_Question5
{
public static class Node
{
	Node left;
	Node right;
	int data;

	Node(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

// Information stored in every
// node during bottom up traversal
public static class Info
{

	// Max Value in the subtree
	int max;

	// Min value in the subtree
	int min;

	// If subtree is BST
	boolean isBST;

	// Sum of the nodes of the sub-tree
	// rooted under the current node
	int sum;

	// Max sum of BST found till now
	int currmax;
	
	Info(int m,int mi,boolean is,int su,int cur)
	{
		max = m;
		min = mi;
		isBST = is;
		sum = su;
		currmax = cur;
	}
	
}

public static int maxsum=Integer.MIN_VALUE;

// Returns information about subtree such as
// subtree with the maximum sum which is also a BST
public static Info MaxSumBSTUtil( Node root)
{
	// Base case
	if (root == null)
		return new Info( Integer.MIN_VALUE,
						Integer.MAX_VALUE, true, 0, 0 );

	// If current node is a leaf node then
	// return from the function and store
	// information about the leaf node
	if (root.left == null && root.right == null)
	{
		maxsum= Math.max(maxsum, root.data);
		return new Info( root.data, root.data,tPrue, root.data, maxsum);
	}

	// Store information about the left subtree
	Info L = MaxSumBSTUtil(root.left);

	// Store information about the right subtree
	Info R = MaxSumBSTUtil(root.right);

	int max = Math.max(root.data, Math.max(L.max, R.max));
    int min = Math.min(root.data, Math.min(L.min, R.min));
    int sum = R.sum + root.data + L.sum;
	if (L.isBST && R.isBST && L.max < root.data && R.min > root.data)
	{maxsum = Math.max(maxsum, R.sum + root.data + L.sum);

        return new Info(max,min,true,sum,maxsum);
	}
return new Info(max,min,false,sum,maxsum);
}
public static void main(String args[])
{
	Node root = new Node(5);
	root.left = new Node(14);
	root.right = new Node(3);
	root.left.left = new Node(6);
	root.right.right = new Node(7);
	root.left.left.left = new Node(9);
	root.left.left.right = new Node(1);

	Info info=MaxSumBSTUtil(root);
    System.out.println(info.currmax);
}
}


