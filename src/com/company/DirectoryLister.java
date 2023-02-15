package com.company;

import java.io.File;

public class DirectoryLister {
    public static void listDirectory(File dir) {
        System.out.println(dir.getName());

        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    printDirectory(file);
                } else {
                    printFile(file);
                }
            }
        }
    }

    private static void printDirectory(File file) {
        System.out.print("\t\t\n");
        listDirectory(file);
    }

    private static void printFile(File file) {
        System.out.print("\t");
        System.out.println(file.getName());
    }
}
