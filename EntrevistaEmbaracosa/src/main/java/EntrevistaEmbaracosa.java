import java.util.Scanner;

public class EntrevistaEmbaracosa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            String palavraDistorcida = scanner.nextLine();

            Integer tamanhoRestanteArredondado = (int) Math.floor(palavraDistorcida.length() / 2);
            Integer tamanhoPalavra = palavraDistorcida.length();
            Integer aux = 0;

            if(palavraDistorcida.length() == 1) {
                System.out.println(palavraDistorcida);
            } else
            if (tamanhoRestanteArredondado >= 1) {
                for (int i = tamanhoRestanteArredondado; i >= 1; i--) {
                    if(palavraDistorcida.substring(tamanhoPalavra-i, tamanhoPalavra)
                                        .equals(palavraDistorcida
                                        .substring(tamanhoPalavra-(2*i),tamanhoPalavra-i))) {
                        aux = i;
                        System.out.println(palavraDistorcida.substring(0, (tamanhoPalavra - aux)));
                    } else if (tamanhoRestanteArredondado == 1) {
                        System.out.println(palavraDistorcida);
                    }
                }
                if(tamanhoRestanteArredondado>1 && aux == 0) {
                    System.out.println(palavraDistorcida);
                }
            }
        } scanner.close();
    }
}