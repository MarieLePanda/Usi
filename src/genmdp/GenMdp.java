/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genmdp;

/**
 *
 * @author lug13995
 */
public class GenMdp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String leMdp;
       MotDePasse mdp = new MotDePasse(true, true, true);
       for(int i = 0; i < 25; i++ )
       {
           //Sans cacrtère spéciaux
           leMdp = mdp.generationMdp();
           System.out.println("Mot de passe : " + leMdp + " sécurité : " + mdp.testSecuriteMdp(leMdp) );
       }
       
       System.out.println("mdp 8xéty39F sécurité : " + mdp.testSecuriteMdp("8xéty39F"));
       
     
    }
}
