/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void inOrder(Node node) {
if (node == null)
                return;
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
    }