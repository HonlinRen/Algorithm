public class Main {
    public static void main(String[] args){
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        Solution newSolution = new Solution();
        TreeNode newNode = newSolution.buildTree(preorder,inorder);
        System.out.println("answer");
    }
}
