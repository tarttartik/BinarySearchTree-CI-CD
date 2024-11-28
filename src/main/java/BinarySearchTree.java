import java.util.ArrayDeque;
import java.util.ArrayList;

public class BinarySearchTree{
    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode root = null;

    private ArrayList<Integer> visitedNodes = new ArrayList<>();

    public BinarySearchTree() {
        root = null;
    }

    public ArrayList<Integer> getVisitedNodes()
    {
        return visitedNodes;
    }

    public BinarySearchTree(int val) {
        root = new TreeNode(val);
    }

    public void insert(int key) {
        insertImp(root, key);
    }

    private TreeNode insertImp(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }

        if (key < root.val) {
            root.left = insertImp(root.left, key);
        }
        else
        {
            root.right = insertImp(root.right, key);
        }
        return root;
    }

    public void BFS() {
        BFSImp(root);
    }

    private void processVal(TreeNode node) {
        visitedNodes.add(node.val);
    }

    private void BFSImp(TreeNode root) {

        var nodes = new ArrayDeque<TreeNode>();
        nodes.addLast(root);

        while (!nodes.isEmpty()) {
            var level_nodes = new ArrayDeque<TreeNode>();

            for (var v : nodes) {
                processVal(v);

                if (v.left != null) {
                    level_nodes.addLast(v.left);
                }
                if (v.right != null) {
                    level_nodes.addLast(v.right);
                }

            }

            nodes = level_nodes;
        }
    }

    public void preorder() {
        preorderImp(root);
    }

    private void preorderImp(TreeNode root) {
        var result = new ArrayList<Integer>();

        if (root == null) {
            return;
        }

        processVal(root);
        preorderImp(root.left);
        preorderImp(root.right);
    }

}

