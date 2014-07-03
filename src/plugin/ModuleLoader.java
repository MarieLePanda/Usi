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
    public static ArrayList<IModule> listModule=new ArrayList<IModule>();
    public static ArrayList<String> names = new ArrayList<String>();
    
    public static void loadPlugin()
    {
        
        try
        {
            URLClassLoader search;
            // répertoire de plugins
            File fichier= new File("E:\\Programme\\git\\WorkspaceJava\\Usi\\dist\\plugin");
            // liste des plugins
            File [] listeFichier = fichier.listFiles();
            //classe loarder
            ArrayList<ClassLoader> cl =new ArrayList<ClassLoader>();
            // Liste denumeration
            Enumeration enums;
            String name=null;
            Class nameClass=null;
            ArrayList<Class> tabClass = new ArrayList<Class>();
            //parcours de la lsite des pulgins
            int place=0;
            for(File f : listeFichier)
            {
                try
                {
                    URL [] listeUrl = {f.toURL()};
                    cl.add( new URLClassLoader (listeUrl));
                    JarFile ficjar = new JarFile(f.getAbsolutePath());
                    enums=ficjar.entries();
                    // parcours de l'énumération
                    
                    while(enums.hasMoreElements())
                    {
                        name = enums.nextElement().toString();
                        if(name.length() > 6 && name.substring(name.length()-6).compareTo(".class") == 0)
                        {
                            name = name.substring(0,name.length()-6);
                            name = name.replaceAll("/",".");
                            nameClass = Class.forName(name ,true,cl.get(place));
                            for(int i = 0 ; i < nameClass.getInterfaces().length; i ++ )
                            {
                                System.out.println(nameClass.getInterfaces()[i].toString());
                                boolean b = nameClass.getInterfaces()[i].toString().substring(nameClass.getInterfaces()[i].toString().length()-7).equals("IModule");
                                if(b) {
                                    tabClass.add(nameClass);
                                }
                            }
                        }
                    }
                }catch(Exception e){
                    e.printStackTrace();
                    System.out.println();
                }
                place++;
            }
            place=0;
            for(Class c : tabClass)
            {
                names.add(c.getName().substring(c.getName().indexOf(".")+1));
                IModule myGestionnaire=(IModule) Class.forName(c.getName(),true,cl.get(place)).newInstance();
                listModule.add(myGestionnaire);
                place++;
            }
        } catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("erreur lecture plugin");
        }
    }
}