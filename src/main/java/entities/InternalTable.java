package main.java.entities;

import java.util.Random;

public class InternalTable {


    private int positions[] = new int[9];

    public void insertNumbersArray() {
        for (int i = 0; i < positions.length; i++) {
            int number = new Random().nextInt(9) + 1;
            positions[i] = number;
        }
    }

    public int[] getPositions() {
        return positions;
    }

    public void setPositions(int[] positions) {
        this.positions = positions;
    }

    public void valuePositionRow1() {
        for (int i = 0; i <= 2; i++) {
            System.out.print(positions[i] + "\t");
            if (i == 2) {
                System.out.print("\t");
            }
        }
    }

    public void valuePositionRow2() {
        for (int i = 3; i <= 5; i++) {
            System.out.print(positions[i] + "\t");
            if (i == 5) {
                System.out.print("\t");
            }
        }
    }

    public void valuePositionRow3() {
        for (int i = 6; i <= 8; i++) {
            System.out.print(positions[i] + "\t");
            if (i == 8) {
                System.out.print("\t");
            }
        }
    }


}
