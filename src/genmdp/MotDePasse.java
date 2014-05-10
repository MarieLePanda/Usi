/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genmdp;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author lug13995
 */
public class MotDePasse {
    
    private boolean majuscule = false;
    private boolean speciaux = false;
    private boolean chiffre = false;
    private int longueur = 8;
    private int securite = 0;
    
    private String[] alphabet = { "za", "ze", "zy", "zu", "zi", "zo", "ra", "re", "ry", "ru", "ri", "ro",
        "ta", "te", "ty", "tu", "ti", "to", "pa", "pe", "py", "pu", "pi", "po",  "qa", "qe", "qy", "qu", "qi", "qo",
        "sa", "se", "sy", "su", "si", "so", "da", "de", "dy", "du", "di", "do", "fa", "fe", "fy", "fu", "fi", "fo",
         "ga", "ge", "gy", "gu", "gi", "go", "ha", "he", "hy", "hu", "hi", "ho", "ja", "je", "jy", "ju", "ji", "jo", "ka",
          "ke", "ky", "ku", "ki", "ko", "la", "le", "ly", "lu", "li", "lo", "ma", "me", "my", "mu", "mi", "mo", "wa",
           "we", "wy", "wu", "wi", "wo", "xa", "xe", "xy", "xu", "xi", "xo", "ca", "ce", "cy", "cu", "ci", "co", "va",
            "ve", "vy", "vu", "vi", "vo", "ba", "be", "by", "bu", "bi", "bo", "na", "ne", "ny", "nu", "ni", "no" };
    private String[] numerique = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
    private String[] symbole = { "&", "é", "\"", "\'", "(", "-", "è", "_", "ç", "à",
            ")", "=", "}", "]", "@", "^", "\\", "`", "|", "[", "{", "#", "~", "$",
            "£", "¤", "%", "ù", "*", "µ", ",", ";", ":", "!", "§", "/", ".", "?" };
    
    public MotDePasse()
    {
        
    }
    
    public MotDePasse(boolean majuscule, boolean speciaux, boolean chiffre)
    {
        this.majuscule = majuscule;
        this.speciaux = speciaux;
        this.chiffre = chiffre;
    }
        
    public MotDePasse(boolean majuscule, boolean speciaux, boolean chiffre, int longueur)
    {
        this.majuscule = majuscule;
        this.speciaux = speciaux;
        this.chiffre = chiffre;
        this.longueur = longueur;
    }
    
    public String generationMdp()
    {
        StringBuilder mdp = new StringBuilder();
        int coef = this.longueur;
        
        for(int i = 0; i < this.longueur; i += 1)
        {
            Random chance, choix;
            chance = new Random();
            choix = new Random();
            
            if(this.speciaux & chance.nextInt(coef) == 1)
                mdp.append(symbole[choix.nextInt(symbole.length)]);
            else if(this.chiffre & chance.nextInt(coef) == 1)
                mdp.append(numerique[choix.nextInt(numerique.length)]);
            else if(this.majuscule & chance.nextInt(coef) == 1)
                mdp.append(alphabet[choix.nextInt(alphabet.length)].toUpperCase());
            else
                mdp.append(alphabet[choix.nextInt(alphabet.length)]);
        }
        
        if(this.majuscule || this.chiffre)
        {
            
        }
            
        return mdp.toString().substring(0, longueur);
    }
    
    public int testSecuriteMdp(String unMdp)
    {
        int nivSecurtie = 0;
        // Plus de 8 carctère
        if(unMdp.matches("(?=.{8,}).*"))
             nivSecurtie = 1;
        // Plus de 8 caractère, une majuscule ou un chiffre
        if(unMdp.matches("^(?=.{8,})(((?=.*[A-Z])(?=.*[a-z]))|((?=.*[A-Z])(?=.*[0-9]))|((?=.*[a-z])(?=.*[0-9]))).*$"))
             nivSecurtie = 2;
        
        // Plus de 8 carctèreune majuscule et un chiffre
        if(unMdp.matches("^(?=.{8,})(((?=.*[A-Z])(?=.*[a-z]))).*$") && unMdp.matches("^(?=.{8,})(((?=.*[A-Z])(?=.*[0-9]))).*$") 
                &&  unMdp.matches("^(?=.{8,})(((?=.*[A-Z])(?=.*[a-z]))).*$"))
            nivSecurtie = 3;
        if(this.contientSymbole(unMdp))
            nivSecurtie++;
        
        
       
        return nivSecurtie;
    }
    
    public boolean contientSymbole(String unMdp)
    {
        for(int i = 0; i < this.symbole.length; i++)
        {
           if(unMdp.contains(this.symbole[i]))
               return true;
        }
        
        return false;
    }
   
}
