package uec;

/**
 * @author RafaelRodrigues1
 */
public class UEC {

    public static void main(String[] args) {
        
        Lutador[] l = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        l[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        l[5] = new Lutador("Nerdaard", "Eua", 30, 1.81, 105.7, 12, 2, 4);
        
        Luta uec = new Luta(l[2], l[3]);
        System.out.println(l[2].status());
        System.out.println(l[3].status());
        uec.marcarLuta();
        uec.lutar();
        System.out.println(l[2].status());
        System.out.println(l[3].status());
        
        
    }    
}
