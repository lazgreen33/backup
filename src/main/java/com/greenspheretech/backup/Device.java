/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.greenspheretech.backup;

/**
 *
 * @author johni
 */

import java.io.IOException;
import java.util.ArrayList;
import java.nio.file .Files;
import java.nio.file.FileSystem;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Device {
    
    static boolean DEVICE_SAFE;
    
    // get device names from preference file
    public static void getDeviceInfo() {
        FileSystem fileSys = FileSystems.getDefault();
        for(Path fs : fileSys.getRootDirectories()) {
            System.out.println(fs);
        }
        
        
        for(FileStore locale : fileSys.getFileStores()) {
            String localeName = locale.name();
            String localeType = locale.type();
            try {
                long deviceSpace = locale.getUsableSpace();
                boolean spaceGood = Targets.checkSpace(deviceSpace);
                if(spaceGood == true) {
                    System.out.println("there is enough space");
                    DEVICE_SAFE = true;
                } else {
                    System.out.println("there is not enough space");
                    DEVICE_SAFE = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            
        }
        
        /*
        for( Path root : fileSys.getRootDirectories()) {
            System.out.println(root.getName());
            int scan = scanDevices(root);
        }
        */
        
    }
    
    // cehck if a device is availible
    public static void checkAvail () {
        
    } 
    
    // check if the device is avaible
    public static int scanDevices (Path rootPath) {
        
        return 0;
    }
    
}
