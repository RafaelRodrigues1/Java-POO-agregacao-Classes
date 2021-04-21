package uec;

import java.util.Random;

/**
 * @author RafaelRodrigues1
 */
public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private Integer rounds;
    private Boolean aprovada;
    
    public Luta(Lutador desafiado, Lutador desafiante){
        this.desafiado = desafiado;
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Integer getRounds() {
        return rounds;
    }

    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }
       
    public void marcarLuta(){
        if(!this.desafiado.equals(this.desafiante) && 
                desafiado.getCategoria().equals(desafiante.getCategoria())){
            setAprovada(true);
        }else{
            System.out.println("Luta não marcada");
            setAprovada(false);
        }
    }
    
    public void lutar(){
        Random ale = new Random();
        if(this.getAprovada()){
            System.out.println("----------------------------------------------");
            System.out.println("Na minha direita!");
            getDesafiado().apresentar();
            System.out.println("Na minha esquerda!");
            getDesafiante().apresentar();
            System.out.println("Lutando!");
            int vencedor = ale.nextInt(3);
            switch(vencedor){
                case 0 -> {
                    System.out.println(getDesafiante().getNome() + " e " + getDesafiado().getNome() + " Empataram!");
                    getDesafiante().empatarLuta();
                    getDesafiado().empatarLuta(); 
                    break;                    
                }
                case 1 -> {
                    System.out.println(getDesafiante().getNome() + " venceu a luta!");
                    getDesafiante().ganharLuta();
                    getDesafiado().perderLuta();
                    break;
                }
                case 2 -> {
                    System.out.println(getDesafiado().getNome() + " venceu a luta!");
                    getDesafiante().perderLuta();
                    getDesafiado().ganharLuta();
                    break;
                }
            }            
        }else{
            System.out.println("Luta não aprovada!");
        }
    }        
}
