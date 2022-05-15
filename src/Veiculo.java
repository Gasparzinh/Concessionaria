public class Veiculo {
private int codigo; 
private String descricao; 
private double preco; 
private boolean status; 

public Veiculo(int codigo, String descricao, double preco, boolean status){
    
    this.codigo=codigo; 
    this.descricao=descricao;
    this.preco=preco;
    this.status=false;
   
}

public void Vendido(){
    this.status=true; 
}

public void naoVendido(){
    this.status=false; 
}

public int getCodigo() {
    return codigo;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

public double getPreco() {
    return preco;
}

public void setPreco(double preco) {
    this.preco = preco;
}

public boolean isStatus() {
    return status;
}

}
