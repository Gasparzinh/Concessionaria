
//import	java.util.Date;  

public class Venda {

private int idVenda;
//private Date data;
private Vendedor vendedor;
private Veiculo veiculo; 

public Venda(int idVenda, Vendedor vendedor, Veiculo veiculo){
    this.idVenda=idVenda; 
   // this.data=data;
    this.vendedor=vendedor; 
    this.veiculo=veiculo; 
    this.confirmarVenda(); 
}
public void confirmarVenda(){
    this.vendedor.registraComissao(this.veiculo.getPreco());
}
 
public void cancelarVenda(){
    this.vendedor.cancelarComissao(this.veiculo.getPreco());
}

public int getIdVenda() {
    return idVenda;
}

/*public Date getData() {
    return data;
}
*/
public Vendedor getVendedor() {
    return vendedor;
}

public void setVendedor(Vendedor vendedor) {
    this.vendedor = vendedor;
}

public Veiculo getVeiculo() {
    return veiculo;
}

}
