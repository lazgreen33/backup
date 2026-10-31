/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.greenspheretech.backup;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
/**
 *
 * @author johni
 */
public class Targets {
    
    ArrayList<Path> TARGET_DIRS;
    ArrayList<Path> TARGET_FILES;
    
    // parse a single line from the preference file
    // 0 = linetype: header    |    path   |    end of section
    // 1 = dir, file, email          |    paths |    {
     public static String[] parseLine(String line) {
        String[] lineFragment = {null, null};
        String[] lineSplit = line.split(" ");
        if(lineSplit[0].equals("#")) {   //header
            lineFragment[0] = "header";
            lineFragment[1] = lineSplit[1];
        } else if(lineSplit[0].equals("}")) {
            lineFragment[0] = "eos";
            lineFragment[1] = lineSplit[0];
        } else {    
            lineFragment[0] = "path";
            lineFragment[1] = lineSplit[0];
        }
        return lineFragment;
    }
    
    //get directories from preference file
    public static Iterable<Path> getTargets () {
        Path prefFile = Backup.PREF_FILE_PATH;
        String currentSection;
        
        try(BufferedReader reader = Files.newBufferedReader(prefFile)) {
            String line;
            
            while((line = reader.readLine()) !=  null) {
                if(line.length() == 0 || line.charAt(0) == '%') {
                    continue;
                } else {
                    String[] lineParts = parseLine(line);
                    System.out.println(lineParts[0] + " : " + lineParts[1]);
                    
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        
        return dirPaths;
    }
    
    //get files from preference files or directories
   
    
    // copy directories recursively to devices
    public static void copyDirectories () {
        
    }
    
    //copy files to devices
    public static void copyFiles () {
        
    }   
}
