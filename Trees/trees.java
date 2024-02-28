public class trees {
      // Creating the node of the binary tree.
      static class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                  this.data = data;
                  this.left = null;
                  this.right = null;
            }
      }

      static class BinaryTree {
            static int indx = -1;

            public static Node buildTree(int node[]) {
                  indx++;
                  if (indx >= node.length || node[indx] == -1) {
                        return null;
                  }

                  Node newNode = new Node(node[indx]);
                  newNode.left = buildTree(node);
                  newNode.right = buildTree(node);

                  return newNode;
            }

            // public static void preorder(Node root) {
            // if (root == null) {
            // return;
            // }
            // System.out.print(root.data + " "); // Print the data of the node
            // preorder(root.left);
            // preorder(root.right);
            // }

            // pre order practice

            // public static void preorder(Node root) {
            // if (root == null) {
            // System.out.print("-1" + " ");
            // return;
            // }

            // System.out.print(root.data + " ");
            // preorder(root.left);
            // preorder(root.right);
            // }

            // INORDER - Printing starts from left , root and right element.
            // public static void inorder(Node root) {
            // if (root == null) {
            // return;
            // }

            // inorder(root.left);
            // System.out.print(root.data + " ");
            // inorder(root.right);
            // }

            // POSTORDER - Priting starts from left , right and at last root .

            public static void postorder(Node root) {

                  if (root == null) {
                        return;

                  }

                  postorder(root.left);
                  postorder(root.right);
                  System.out.print(root.data + " ");
            }

      }

      public static void main(String[] args) {
            int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(node);
            // tree.preorder(root);
            // tree.inorder(root);
            tree.postorder(root);

      }
}
