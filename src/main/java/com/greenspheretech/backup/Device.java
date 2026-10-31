/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.greenspheretech.backup;

/**
 *
 * @author johni
 */

import java.util.ArrayList;
import java.nio.file .Files;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Device {
    // get device names from preference file
    public static void getDeviceNames() {
        FileSystem fileSys = FileSystems.getDefault();
        
        for( Path root : fileSys.getRootDirectories()) {
            int scan = scanDevices(root);
        }
    }
    
    // cehck if a device is availible
    public static void checkAvail () {
        
    } 
    
    public static int scanDevices (Path rootPath) {
        
        return 0;
    }
    
}
