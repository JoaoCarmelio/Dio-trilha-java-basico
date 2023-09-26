import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("OLÁ,SEJA BEM VINDO!");

        
        
        
        System.out.println(" POR FAVOR,DIGITE O NUMERO : ");
        int numero = scanner.nextInt();
        

        
        System.out.println(" POR FAVOR,DIGITE SUA AGENCIA : " );
        String agencia = scanner.next();
       

        System.out.println(" POR FAVO,DIGITE SEU NOME : ");
        String NomeDoCliente = scanner.next();
        
        

   
        System.out.println(" POR FAVOR,DIGITE SEU SALDO : ");
        Double saldo = scanner.nextDouble();

        scanner.close();
   
        

         System.out.println(" Olá " + NomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
         

       
    
      
    }
}
