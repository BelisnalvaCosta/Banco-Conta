import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
                //Chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException exception) {
                //TODO: Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro

                System.out.println("O segundo parâmentro deve ser maior que o primeiro");
        }
        
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se o parametroUm é maior que o parametroDois e lançar a exceção
        if (parametroUm > parametroDois) 
                throw new ParametrosInvalidosException();
                            
        int contagem = parametroUm - parametroDois;
        //realizar o for para imprimir os números com base na variável contagem
        for(int numeroAtual = 1; numeroAtual <= contagem; numeroAtual++){
            System.out.println("Imprimindo o número " + numeroAtual);
        }
    }

    static void teste(){
        try {
                System.out.println("Primeriro valor: 4; Segundo valor: 9");   
                contar(4, 9); 
                System.out.println("Primeriro valor: 12; Segundo valor: 30");   
                contar(12, 30);    
                System.out.println("Primeriro valor: 16; Segundo valor: 8");   
                contar(16, 8);           

        } catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmentro deve ser maior que o primeiro");
        }
    }
}