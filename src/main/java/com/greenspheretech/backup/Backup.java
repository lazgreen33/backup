/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.greenspheretech.backup;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
/**
 *
 * @author johni
 */
public class Backup {
    
    static Path PREF_FILE_PATH;
    
    public static void setPrefPath() {
        Path projDir = Path.of(System.getProperty("user.dir"));
        PREF_FILE_PATH = projDir.resolve("preferences.txt");
    }
    
    public static void parseArgs () {
        
    }
    
    public static void editPrefs () {
        
    }
    
   
    
    public static int copyTargets () {
        Device.getDeviceNames();
        Targets.copyDirectories();
        Targets.copyFiles();
        
        return 0;
    }

    public static void main(String[] args) {
        setPrefPath();
        Device.getDeviceNames();
        Targets.getTargets();
        System.out.println(Targets.TARGET_DIRS);
        System.out.println(Targets.TARGET_FILES);
        System.out.println(Targets.TARGET_EMAILS);
        System.out.println(Targets.TARGETS);
    }
    
    
}

