import java.util.Scanner;

public class estadocivil {
    public static void main(String[] args) throws Exception {
        System.out.println("Insira uma letra (S, C, D ou V): ");
        Scanner in = new Scanner(System.in); 
        String letra = in.nextLine();
            switch(letra){
                case "S":
                    System.out.println("Solteiro!");
                    break;
                case "s":
                    System.out.println("Solteiro!");
                    break;
                 case "C":
                    System.out.println("Casado!");
                    break;
                case "c":
                    System.out.println("Casado!");
                    break;
                case "D":
                    System.out.println("Divorciado!");
                    break;
                case "d":
                    System.out.println("Divorciado!");
                    break;
                case "V":
                    System.out.println("Viuvo!");
                    break;
                case "v":
                    System.out.println("Viuvo!");
                    break;
            }
        in.close();
    }
}
