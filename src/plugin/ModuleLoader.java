/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plugin;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

/**
 *
 * @author lug13995
 */
public class ModuleLoader { 
    public static void loadPlugin(){
        try{
            URLClassLoader systemClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
            File file = new File("C:\\Users\\lug13995\\Documents\\GitHub\\UsiImportModule\\dist");
            //C:\Users\lug13995\Documents\GitHub\UsiImportModule\dist
            //.\\.
            File[] files = file.listFiles();
            for (File f : files){
                try{
                    URL urlList[] = {f.toURL()};
                     ClassLoader loader = new URLClassLoader(urlList); 
                     String className = "usiimportmodule.PluginTest"; 

                     IModule o = (IModule) Class.forName(className,true,loader).newInstance();
                     o.plug();
                 }
                catch(Exception e){
                   System.out.println("loadPlugin 1" + e.toString());
                }
            }
        }catch(Exception e){
            System.out.println("loadPlugin 2" + e.toString());
        } 
       
    }
        
        
}
