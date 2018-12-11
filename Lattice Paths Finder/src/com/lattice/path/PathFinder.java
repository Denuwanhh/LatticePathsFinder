package com.lattice.path;

import java.util.ArrayList;

public class PathFinder {

    private static int pathCount = 1;

    public static void findPaths(Node node, ArrayList path){
        if(node == null)
            return;

        path.add(node.getNodeValue());

        if(node.getLeftNode() == null && node.getRightNode() == null) {
            System.out.println((pathCount++)+" "+(path.toString()));
        }else{
            findPaths(node.getLeftNode(), new ArrayList(path));
            findPaths(node.getRightNode(), new ArrayList(path));
        }

    }

}
