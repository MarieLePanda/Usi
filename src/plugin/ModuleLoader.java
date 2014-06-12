/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plugin;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

/**
 *
 * @author lug13995
 */
public class ModuleLoader { 
	private static List<URL> urls = new ArrayList<URL>(); 
 
	private static List<String> getModuleClasses(){ 
		List<String> classes = new ArrayList<String>(); 
 
		//On liste les fichiers de module  
		File[] files = new File("dossier").listFiles(new ModuleFilter()); 
 
		for(File f : files){ 
			JarFile jarFile = null; 
 
			try { 
				//On ouvre le fichier JAR 
				jarFile = new JarFile(f); 
 
				//On récupère le manifest 
				Manifest manifest = jarFile.getManifest(); 
 
				//On récupère la classe 
				String moduleClassName = manifest.getMainAttributes().getValue("Module-Class"); 
 
				classes.add(moduleClassName); 
 
				urls.add(f.toURI().toURL()); 
			} catch (IOException e) { 
				e.printStackTrace(); 
			} finally { 
				if(jarFile != null){ 
					try { 
						jarFile.close(); 
					} catch (IOException e) { 
						e.printStackTrace(); 
					} 
				} 
			} 
		} 
 
		return classes; 
	} 
 
	private static class ModuleFilter implements FileFilter { 
		@Override 
		public boolean accept(File file) { 
			return file.isFile() && file.getName().toLowerCase().endsWith(".jar"); 
		} 
	}
        
        
}
