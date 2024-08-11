package datastructures.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {

    private Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public List<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        List<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            results.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return results;
    }

    public List<Integer> DFSPreOrder() {
        return preOrder(root, new ArrayList<>());
    }

    private List<Integer> preOrder(Node node, List<Integer> result) {
        if (node == null) return null;

        result.add(node.value);
        if (node.left != null) {
            preOrder(node.left, result);
        }
        if (node.right != null) {
            preOrder(node.right, result);
        }

        return result;
    }

    public List<Integer> DFSInOrder() {
        return inOrder(root, new ArrayList<>());
    }

    private List<Integer> inOrder(Node node, List<Integer> result) {
        if (node == null) return null;

        if (node.left != null) {
            inOrder(node.left, result);
        }
        result.add(node.value);
        if (node.right != null) {
            inOrder(node.right, result);
        }

        return result;
    }

    public List<Integer> DFSPostOrder() {
        return postOrder(root, new ArrayList<>());
    }

    private List<Integer> postOrder(Node node, List<Integer> result) {
        if (node == null) return null;

        if (node.left != null) {
            postOrder(node.left, result);
        }
        if (node.right != null) {
            postOrder(node.right, result);
        }
        result.add(node.value);

        return result;
    }

}
