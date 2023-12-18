public class MyBST {
    private TreeNode mroot;

    public MyBST() {
        System.out.println("Contructor MyBST ");
    }

    public TreeNode getMroot() {
        return mroot;
    }

    public void setMroot(TreeNode mroot) {
        this.mroot = mroot;

    }

    public TreeNode insert(TreeNode root, int value) {
        TreeNode newNode = new TreeNode(value);
        if (root == null) {
            root = newNode;
            return root;
        } else {
            // node temp để duyệt cây
            TreeNode temp = root;
            while (true) {
                if (value >= temp.val) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {
                        temp = temp.right;
                    }
                } else {
                    if (value < temp.val) {
                        if (temp.left == null) {
                            temp.left = newNode;
                            break;
                        } else {
                            temp = temp.left;
                        }
                    }
                }
            }
            return root;
        }
    }
}