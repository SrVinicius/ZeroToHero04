import java.util.Scanner;

public class calculo {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in); 
        Scanner on = new Scanner(System.in); 
        System.out.println("Insira o primeiro numero: ");
        int  num1  = in.nextInt();
        System.out.println("Insira o segundo numero: ");
        int  num2  = in.nextInt();
        System.out.println("Informe o caracter relacionado a operacao desejada(*, / , + , -) ");
        String operador = on.nextLine();
        switch(operador){
            case "*":
            int multi = num1*num2;
            System.out.println("Multiplicacao: "+ multi);
                break;
            case "/":
                int divisao = num1/num2;
                System.out.println("Divisao: "+ divisao);
                break;
            case "+":
                int adicao  = num1+num2;
                System.out.println("Adicao: "+ adicao);
                break;
            case "-": 
                int subtracao = num1-num2;
                System.out.println("Subtracao: "+ subtracao);
            break;
        }
        in.close();
        on.close();
    }
}
