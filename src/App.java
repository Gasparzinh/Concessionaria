import java.util.Scanner;
//import java.util.Date;


public class App {
 
  static Scanner read = new Scanner(System.in);
  //static final int TAMANHO_VETOR=2;

    public static void main(String[] args) throws Exception {
       boolean status=true;    
    // int opcao=0;
  
     /*do{
       System.out.println("****Escolha uma opção****");
       System.out.println();
       System.out.println("1-Iniciar Programa de Vendas");
       System.out.println("2-Fechar Programa de Vendas");

       try{
         System.out.println("\nOpção: ");
         opcao=read.nextInt();
         ;
       }
       catch(Exception e){
         System.out.println("A opção deve ser apenas numérica!!");
         read.nextLine();
         continue;
       }
      
      switch(opcao){
        case 1:
        iniciarVenda()
        break

      }
    */
      

    //public static void iniciarVenda(){
      System.out.print("\n****Venda iniciada****");

      System.out.println("\nMatricula Do Vendedor:");
      int matricula=read.nextInt();
     
     
     System.out.println("Nome do Vendedor: ");
       read.nextLine();
      String nome=read.nextLine();

     Vendedor vendedor=new Vendedor(matricula, nome);

     System.out.println("Digite o codigo do carro:");
     int codigo =read.nextInt();
    
     System.out.println("Descrição do carro:");
     read.nextLine();
     String descricao=read.nextLine(); 

     System.out.println("Preço do Veiculo:");
     double preco=read.nextDouble();
     
     Veiculo veiculo=new  Veiculo(codigo, descricao, preco,status);

     System.out.println("Id da Venda:");
     int idVenda=read.nextInt();
     
     
     Venda venda=new Venda(idVenda, vendedor, veiculo);


     System.out.println("***********Matricula: "+vendedor.getMatricula());
     System.out.println("************Vendedor:  "+vendedor.getNome());
     System.out.println("********Codigo carro: "+veiculo.getCodigo());
     System.out.println("Descrição do veiculo: "+veiculo.getDescricao());
     System.out.println("**Preço do Veiculo R$ "+veiculo.getPreco());
     System.out.println("*********Id da venda: "+venda.getIdVenda());
     System.out.println("Valor da comissão R$"+vendedor.getValorComissao());

     

 
    

    
      
     
    


  }
}
