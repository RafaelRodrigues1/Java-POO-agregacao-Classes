package uec;

/**
 * @author RafaelRodrigues1
 */
public class Lutador {
    
    private String nome;
    private String nacionalidade;
    private Integer idade;
    private Double altura;
    private Double peso;
    private String categoria;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;
    
    public Lutador(){        
    }

    public Lutador(String nome, String nacionalidade, Integer idade,
            Double altura, Double peso, Integer vitorias,
            Integer derrotas, Integer empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
        setCategoria(peso);
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(Double peso) {
        if(peso<52.2 || peso>120.2){
            this.categoria = "Inválido";
        }else if(peso<=70.3){
            this.categoria = "Leve";            
        }else if(peso<=83.9){
            this.categoria = "Médio";
        }else{
            this.categoria = "Pesado";
        }    
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }
    
    public void apresentar(){
        System.out.println("Pesando " + getPeso() + " Kg de puro músculo,\nvindo diretamente da(o) " + 
                getNacionalidade() + ",\ncom vocês, O incrííííííível " + getNome().toUpperCase() + "!!");
    }
    
    public String status(){
        return "----------------------------------------------" +
                "\nNome:\t\t" + getNome() +
                "\nNacionalidade:\t" + getNacionalidade() +
                "\nIdade:\t\t" + getIdade() +
                "\nCategoria:\t" + getCategoria() +
                "\nCartel:\t\t" + getVitorias() + "/" + getDerrotas() + "/" + getEmpates();
    }
    
    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }
    
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }    
}
