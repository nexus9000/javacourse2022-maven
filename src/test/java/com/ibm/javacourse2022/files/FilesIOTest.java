package com.ibm.javacourse2022.files;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilesIOTest {
    private static Logger logger = Logger.getLogger(FilesIOTest.class);
    private final String TEMP_FILE = "test.txt";//relative path
    @Test
    @DisplayName("test file creation")
   void testCreateFile()throws IOException{
        File tempFile = new File(TEMP_FILE);
        assertEquals(false, tempFile.createNewFile());
        assertEquals("test.txt",tempFile.getName());
        System.out.println(tempFile.getAbsolutePath());
        System.out.println(tempFile.getName());
        assertTrue(tempFile.canRead());
        assertTrue(tempFile.canWrite());
        assertTrue(tempFile.exists());
        //assertTrue(tempFile.delete());


    }
    @DisplayName("test write content")
    @Test
    void testWriteContent()throws Exception{
        try{
            FileWriter fw = new FileWriter(TEMP_FILE);
            fw.write("Test message");
            fw.close();
        }catch(IOException io){
            logger.error(io.getMessage());
        }
    }
    @DisplayName("test read content")
    @Test
    void testReadContent()throws IOException{
        Scanner scanner = new Scanner(new File(TEMP_FILE));
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            assertEquals("Test message",line);
        }
        scanner.close();
    }
    @Test
    void createDir()throws Exception{
        Path dest = Paths.get("C:\\Users\\User\\testDir");
        Path source = Paths.get("C:\\Users\\User\\IdeaProjects\\java-course-2022");
      if(!new File(dest.toString()).exists()) {
           Files.createDirectories(dest);
       }
        Files.move(source, dest);
        Files.copy(dest,source);
    }
}
