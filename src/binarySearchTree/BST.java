package binarySearchTree;

public class BST {

    private Node root;

    public void insert(int key, String value){
        Node newNode = new Node(key, value);
        if(root==null){
            root = newNode;
        }
        else {
            Node current = root;//these must exist before the meaty while loop
            Node parent;

            while (true){
                parent = current;
                if(key< current.key){//we go down left half of big tree
                    current = current.leftChild;//next we check has current a leftnode
                    if(current==null){//if false here the while loop continues
                        parent.leftChild = newNode;//else we're at leaf node
                        return;
                    }
                } else {//....or we go down right half of big tree
                    current = current.rightChild;
                    if (current==null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }


    }

}
