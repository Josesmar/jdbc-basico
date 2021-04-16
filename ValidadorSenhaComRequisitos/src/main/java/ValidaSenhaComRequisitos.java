import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ValidaSenhaComRequisitos {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String nome = in.readLine();
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); // lê a primeira linha

            while (linha != null) {
                validadorDeSenha(linha);
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            arq.close();
        } catch (IOException e) {
        }
    }
    public static boolean senhaValida(String Senha){
        return "\"^(?=.*[az])(?=.*[AZ])(?=.*\\d)[a-zA-Z\\d]{6,32}$\"".matches(Senha);
    }
    public static void validadorDeSenha(String senha) {
        if ((senha.contains("'!@#$%¨&*()")) || (senha.length() < 6) || (senha.length() > 32) || (senha.length() == 0)
           && (!senhaValida(senha))) {
            System.out.println("Senha invalida.");
        } else {
            System.out.println("Senha valida.");
        }
    }
}
