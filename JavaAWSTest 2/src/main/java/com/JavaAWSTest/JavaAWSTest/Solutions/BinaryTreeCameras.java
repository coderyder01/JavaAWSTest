package com.JavaAWSTest.JavaAWSTest.Solutions;

public class BinaryTreeCameras {

    private static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private static int height(Node node) {
        if(node == null)
            return 0;

        int lh = height(node.left);
        int rh = height(node.right);
        return 1 + Math.max(lh, rh);
    }

    public static void main(String[] args) {
        int testCases = 2;
        // create tree 1
        //        0 1 -1 2 3 -1 -1 -1 -1
        Node root1 = new Node(0);
        root1.left = new Node(1);
        root1.left.left = new Node(2);
        root1.left.right = new Node(3);

        //create tree 2
//        0 1 -1 2 -1 3 -1 -1 4 -1 -1
        Node root2 = new Node(0);
        root2.left = new Node(1);
        root2.left.left = new Node(2);
        root2.left.left.left = new Node(3);
        root2.left.left.left.right = new Node(4);

        for(int i=0; i<testCases; i++) {
            int res = 0;
            if(i == 0)
                res = height(root1);
            else if(i == 1)
                res = height(root2);

            res = (int)Math.floor((double) res/2);
            System.out.println(res);
        }


    }
}
