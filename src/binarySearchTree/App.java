package binarySearchTree;

public class App {

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(10, "Ten");
        tree.insert(23, "Twentythree");
        tree.insert(20, "Twenty");
        tree.insert(15, "Fifteen");
        tree.insert(5,"Five");
        tree.insert(89,"Eightynine");
        System.out.println("The minimum in our tree is: "+tree.findMinimumNode().key+
                "->"+tree.findMinimumNode().value);
        System.out.println("The maximum in our tree is: "+tree.findMaximumNode().key+
                "->"+tree.findMaximumNode().value);

    }

}
