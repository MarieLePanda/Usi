/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plugin;

/**
 *
 * @author lug13995
 */
public interface IModule {
    
    public void plug();
    
    public void unplug();
    
    public String getName();
    
}
