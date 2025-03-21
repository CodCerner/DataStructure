package datastructures.binarysearchtree;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);


        System.out.println("BST Contains 27:");
        System.out.println(myBST.contains(27));

        System.out.println("\nBST Contains 17:");
        System.out.println(myBST.contains(17));


        /*
            EXPECTED OUTPUT:
            ----------------
            BST Contains 27:
            true

            BST Contains 17:
            false

        */

        System.out.println("\nBreadth First Search:");
        System.out.println( myBST.BFS() );

        /*
            EXPECTED OUTPUT:
            ----------------
            Breadth First Search:
            [47, 21, 76, 18, 27, 52, 82]

        */

        System.out.println("\nDepth First Search PreOrder:");
        System.out.println( myBST.DFSPreOrder() );

        System.out.println("\nDepth First Search PostOrder:");
        System.out.println( myBST.DFSPostOrder() );

        System.out.println("\nDepth First Search InOrder:");
        System.out.println( myBST.DFSInOrder() );

    }
}
