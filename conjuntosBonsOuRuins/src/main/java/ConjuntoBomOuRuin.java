import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ConjuntoBomOuRuin {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());

       List<String> conjunto = new ArrayList(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
       List<String> entrada = new ArrayList<String>();

       Scanner ler = new Scanner(System.in, "ISO-8859-1");
       String conjuntoPalavras = ler.next();

        System.out.println(validarConjuntoBomOuRuim(conjuntoPalavras));
        System.out.println("teste");

    }
    public static String validarConjuntoBomOuRuim(String conjuntoDigitado){

        for (String str : conjuntoDigitado.split(" ")) {
            System.out.println(str.substring(0,1));
        }
        return validarConjuntoBomOuRuim(conjuntoDigitado);
    }
}
