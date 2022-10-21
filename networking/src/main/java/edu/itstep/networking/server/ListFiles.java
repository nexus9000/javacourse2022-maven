package edu.itstep.networking.server;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ListFiles {
    private File sharedDir;
    private final ArrayList<File> files = new ArrayList<>();
    public ListFiles(File sharedDir){
        this.sharedDir = sharedDir;
    }

    protected ArrayList<File> listDirectory()throws IOException{
        File[] lists = sharedDir.listFiles();
        for(File file : lists){
            if(file.isFile())files.add(file);
        }
        return files;
    }
}
