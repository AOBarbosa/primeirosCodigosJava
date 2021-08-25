public class CalculadoraBasica {
    // Programa feito para rodar na prompt de comando
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);  // precisou 'envelopar' o argumento para transformar a string em inteiro
        int y = Integer.parseInt(args[2]);

        if (args[0].equals("somar")){
            sum(x, y);
        }else if (args[0].equals("subtrair")){
            minus(x, y);
        }else if (args[0].equals("multiplicar")){
            mult(x, y);
        }else if(args[0].equals("dividir")) {
            div(x, y);
        }else{
            System.out.println("Nenhuma instrucao valida foi passada ainda.");
        }
    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }
    static void minus(int x, int y) {
        System.out.println(x - y);
    }
    static void mult(int x, int y) {
        System.out.println(x * y);
    }
    static void div(int x, int y) {
        System.out.println(x / y);
    }
}
