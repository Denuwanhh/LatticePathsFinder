package com.lattice.path;

public class Node {

    private int nodeValue;
    private Node leftNode;
    private Node rightNode;

    public Node(int nodeValue) {
        this.nodeValue = nodeValue;
        this.leftNode = (nodeValue + (Main.gridCells + 1)) > ((Main.gridCells + 1) * (Main.gridCells + 1)) ? null : new Node(nodeValue + (Main.gridCells + 1));
        this.rightNode = nodeValue % (Main.gridCells + 1) == 0 ? null : new Node(nodeValue + 1);
    }

    public int getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(int nodeValue) {
        this.nodeValue = nodeValue;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
}
