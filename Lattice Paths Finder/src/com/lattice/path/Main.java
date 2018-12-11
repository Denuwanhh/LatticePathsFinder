package com.lattice.path;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int gridCells;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of Horizontal & Vertical Cells : ");
        gridCells = scanner.nextInt();

        PathFinder.findPaths(new Node(1), new ArrayList());
    }
}
