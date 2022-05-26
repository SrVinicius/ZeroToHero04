import java.util.Scanner;

public class caixa {
    public static void main(String[] args) throws Exception {
        System.out.println("Insira um numero de 1 a 4: ");
        Scanner in = new Scanner(System.in); 
        int numero = in.nextInt();
        if(numero == 1 || numero == 2 || numero == 3 || numero == 4){
            switch(numero){
                case 1: 
                    System.out.println("saldo");
                    break;
                case 2:
                    System.out.println("extrato");
                    break;
                case 3: 
                    System.out.println("Saque");
                    break;
                case 4: 
                    System.out.println("sair");
                    break;
            }
        }else{
            System.out.println("Erro! Favor inserir apenas numeros entre 1 e 4!");
        }
        
        in.close();
    }
}
