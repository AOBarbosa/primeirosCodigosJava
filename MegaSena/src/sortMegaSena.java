import java.util.Random; // importado do JDK, ao esvrecer Random dentro do main selecionar a primeira opcao.

public class sortMegaSena {

    public static void main(String[] args) {
        Random generate = new Random();

        int i = 0;
        while (i < 6){
            int number = generate.nextInt(60);
            System.out.println(number);
            i++;
        }
        System.out.println("-----Agora para obter o mesmo resultado, mas usando a estrutura for!-----");

        for (int j = 0; j < 6; j++) {
            int number = generate.nextInt(60);
            System.out.println(number);
        }
    }
}
