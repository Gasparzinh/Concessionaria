public class Vendedor {
    private int matricula; 
    private String nome; 
    private double valorComissao; 

public Vendedor(int matricula, String nome){
    this.matricula=matricula;
    this.nome=nome;  
}
public void registraComissao(double valorVenda){
    this.valorComissao+=valorVenda*0.1; 
}
public void cancelarComissao(double valorVenda){
    this.valorComissao-=valorVenda*0.1; 
}

public int getMatricula() {
    return matricula;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public double getValorComissao() {
    return valorComissao;
}


}
