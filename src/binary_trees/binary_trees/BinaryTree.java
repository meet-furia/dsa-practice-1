package binary_trees.binary_trees;

import java.util.Scanner;

public class BinaryTree {
    static private class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void populate(Scanner scanner) {
        System.out.println("Enter the root value: ");
        int value = scanner.nextInt();
        Node root = new Node(value);
        populate(root, scanner);
    }

    public void populate(Node node, Scanner scanner) {
        System.out.println("Do you want to enter left of: " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of: " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(node.left, scanner);
        }

        System.out.println("Do you want to enter right of: " + node.value);
        boolean right = scanner.nextBoolean();
        if (right)  {
            System.out.println("Enter the value of the right of: " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(node.right, scanner);
        }
    }

    public void display() {

    }

    private void display(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        display(node.left);
        display(node.right);
    }
}
