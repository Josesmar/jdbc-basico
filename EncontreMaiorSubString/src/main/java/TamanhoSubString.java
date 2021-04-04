import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TamanhoSubString {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String primeiraString, segundaString, tamanhoMaximo, tamanhoMinimo ;

        while ((primeiraString = in.readLine()) != null) {
            segundaString = in.readLine();

            if (primeiraString.length() >= segundaString.length() ) {
                tamanhoMaximo = primeiraString;
                tamanhoMinimo = segundaString;
            } else {
                tamanhoMaximo = segundaString;
                tamanhoMinimo = primeiraString;
            }
            int minLength = tamanhoMinimo.length();
            int maxS = minLength;
            boolean f = true;

            while (maxS > 0 && f) { //altere as variaveis, se achar necessario
                int diff = minLength - maxS;

                for (int i = 0; i <= diff; i++ ) { //complete o laco de repeticao
                    if (tamanhoMaximo.contains(tamanhoMinimo.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }

}