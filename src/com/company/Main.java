package com.company;
import java.io.*;

import static com.company.DirectoryLister.listDirectory;

public class Main {
    public static void main(String[] args) {

        String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);

        File directory = new File(dir);
        listDirectory(directory);
    }
}
