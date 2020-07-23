package main.java.entities;

public class ExternalTable {

    private InternalTable externalPosition[] = new InternalTable[9];

    InternalTable internalTable;

    public void insertInternalTables() {
        for (int i = 0; i < externalPosition.length; i++) {
            internalTable = new InternalTable();
            internalTable.insertNumbersArray();
            externalPosition[i] = internalTable;
        }
    }

    public InternalTable[] getExternalPosition() {
        return externalPosition;
    }

    public void setExternalPosition(InternalTable[] externalPosition) {
        this.externalPosition = externalPosition;
    }

    public void returnNumberPosition() {
        for (int i = 0; i < 12; i++) {
            if (i == 3 || i == 6 || i == 10) {
                System.out.println();
                for (int j = 0; j < 3; j++) {
                    if (i == 10) {
                        externalPosition[i - 2].valuePositionRow3();
                    } else {
                        externalPosition[i].valuePositionRow3();
                    }

                }
                System.out.println("\n");
            }
            if (i == 10) {
                return;
            }
            if (i != 9) {
                externalPosition[i].valuePositionRow1();
            }
            if (i == 2 || i == 5 || i == 9) {
                System.out.println();
                for (int j = 0; j < 3; j++) {
                    externalPosition[i - 2].valuePositionRow2();
                }
            }
        }
    }
}
