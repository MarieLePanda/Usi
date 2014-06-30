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
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import javax.swing.ListModel;

/**
 *
 * @author lug13995
 */
public class ModuleLoader { 
    public static ArrayList<IModule> listModule = new ArrayList<IModule>();
    public static void loadPlugin(){
        try{
            File file = new File(".\\.");
            //C:\Users\lug13995\Documents\GitHub\UsiImportModule\dist
            //E:\Programme\git\WorkspaceJava\UsiImportModule\dist
            //.\.
            Class tmpClass = null;
            ArrayList<Class> tabClass = new ArrayList<Class>();
            File[] files = file.listFiles();
            String tmp = null;
            Enumeration enumeration;
            ClassLoader loader = null;
            
            for (File f : files){
                try{
                    URL urlList[] = {f.toURL()};
                    System.out.println(f.toURL());
                    loader = new URLClassLoader(urlList); 
                    JarFile jar = new JarFile(f.getAbsolutePath());
                    enumeration = jar.entries();
                    while(enumeration.hasMoreElements()){
                        tmp = enumeration.nextElement().toString();
                        if(tmp.length() > 6 && tmp.substring(tmp.length()-6).compareTo(".class") == 0) {
                            tmp = tmp.substring(0,tmp.length()-6);
                            tmp = tmp.replaceAll("/",".");
                            tmpClass = Class.forName(tmp ,true,loader);  
                            for(int i = 0 ; i < tmpClass.getInterfaces().length; i ++ ){
                                System.out.println(tmpClass.getInterfaces()[i].toString());
                                boolean b = tmpClass.getInterfaces()[i].toString().substring(tmpClass.getInterfaces()[i].toString().length()-7).equals("IModule");
                                if(b) {
                                    tabClass.add(tmpClass);       
                                }
                            }
			}
                    }

                 }
                catch(Exception e){
                   System.out.println("loadPlugin 1" + e.toString());
                }
            }
            for(Class c : tabClass){
                System.out.println(c.getName());
                 IModule o = (IModule) Class.forName(c.getName(),true,loader).newInstance();
                 listModule.add(o);
                 o.plug();
            }
        }catch(Exception e){
            System.out.println("loadPlugin 2" + e.toString());
        } 
       
    }
        
        
}
