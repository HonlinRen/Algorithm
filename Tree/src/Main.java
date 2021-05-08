public class Main {
    static class binaryTreeNode{
        private int data;
        private binaryTreeNode leftChild;
        private binaryTreeNode rightChild;
        public int getData(){
            return data;
        }
        public void setData(int data){
            this.data = data;
        }

        public binaryTreeNode getLeftChild() {
            return leftChild;
        }

        public binaryTreeNode getRightChild() {
            return rightChild;
        }

        public void setLeftChild(binaryTreeNode leftChild) {
            this.leftChild = leftChild;
        }

        public void setRightChild(binaryTreeNode rightChild) {
            this.rightChild = rightChild;
        }
    }
    static class binaryTree{
        private binaryTreeNode root;

        public binaryTree(){}
        public binaryTree(binaryTreeNode root){
            this.root = root;
        }

        public void setRoot(binaryTreeNode root){
            this.root = root;
        }

        public binaryTreeNode getRoot() {
            return root;
        }
    }
    //清空节点
    public void clear(binaryTreeNode node){
        if(node != null){
            clear(node.getLeftChild());
            clear(node.getRightChild());
            node = null;
        }
    }
    //清空二叉树
    public void clear(binaryTree root){
        clear(root);
    }
    //判断二叉树为空
    public boolean isEmpty(binaryTree root){
        return (root == null);
    }
    //获取二叉树高度
    public static int height(binaryTree tree){
        return height(tree.getRoot());
    }
    public static int height(binaryTreeNode node){

        if(node == null){
            return 0;
        }
        else {
            int lHeight = height(node.getLeftChild());
            int rHeight = height(node.getRightChild());
            return lHeight > rHeight ? (lHeight + 1) : (rHeight + 1);
        }
    }
    //获取二叉树节点数
    public static int size(binaryTree tree){
        return size(tree.getRoot());
    }
    public static int size(binaryTreeNode node){
        if(node == null){
            return 0;
        }
        else {
            return 1 + size(node.getLeftChild()) + size(node.getRightChild());
        }
    }
    //返回左右子树
    public binaryTreeNode getLeft(binaryTreeNode node){
        return node.getLeftChild();
    }
    public binaryTreeNode getRight(binaryTreeNode node){
        return node.getRightChild();
    }
    //插入 设置 左右子树
    public void inertLeft(binaryTreeNode parent,binaryTreeNode newNode){
        parent.setLeftChild(newNode);
    }
    public void inertRight(binaryTreeNode parent,binaryTreeNode newNode){
        parent.setRightChild(newNode);
    }
    //先根遍历
    public static void preOrder(binaryTreeNode node){
        if(node != null){
            System.out.println(node.getData());
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }
    //中根遍历
    public static void inOrder(binaryTreeNode node){
        if(node != null){
            inOrder(node.getLeftChild());
            System.out.println(node.getData());
            inOrder(node.getRightChild());
        }
    }
    //后根遍历
    public static void postOrder(binaryTreeNode node){
        if(node != null){
            postOrder(node.getLeftChild());
            postOrder(node.getRightChild());
            System.out.println(node.getData());
        }
    }
    public static void main(String[] args){
        binaryTreeNode node = new binaryTreeNode();
        binaryTreeNode lnode = new binaryTreeNode();
        binaryTreeNode rnode = new binaryTreeNode();
        binaryTree tree = new binaryTree();

        node.setData(1);
        lnode.setData(2);
        rnode.setData(3);
        tree.setRoot(node);
        node.setLeftChild(lnode);
        node.setRightChild(rnode);

        Object preOrder = new Object();
        preOrder(node);
        Object inOrder = new Object();
        inOrder(node);

    }
}
