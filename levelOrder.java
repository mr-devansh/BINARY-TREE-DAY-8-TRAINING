	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void levelOrder(Node root) {
      
      // BFS using FIFO of Queue
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node cur = q.remove();
                if (cur == null) {
                    // System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(cur.data + " ");
                    if (cur.left != null) {
                        q.add(cur.left);
                    }
                    if (cur.right != null) {
                        q.add(cur.right);
                    }
                }
            }
    }