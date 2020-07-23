package main.java.application;

import main.java.entities.ExternalTable;
import main.java.entities.InternalTable;

import java.util.ArrayList;

public class MainGame {

    public static void main(String[] args) {

        ExternalTable externalTable = new ExternalTable();

        externalTable.insertInternalTables();

        externalTable.returnNumberPosition();

    }
}
