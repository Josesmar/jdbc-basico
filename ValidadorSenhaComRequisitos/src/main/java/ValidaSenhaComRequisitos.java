
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ValidaSenhaComRequisitos {
    public final static int MAX = 200;
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//    static StringTokenizer st = new StringTokenizer("teste");

    public static void main(String[] args) throws IOException {
        String password = new String(String.valueOf(MAX));
        String senhaValidada;
        password = in.readLine();
        Boolean validou;

        do {
            validadorDeSenha(password);
            password = "";
        } while (password.length() > 0);

    }

    public static String validadorDeSenha(String senha) {

        if ((senha.length() < 6) || (senha.length() > 32) ||
                (senha.matches("(^|$)[a-z]+(^|$)[0-9]")) || (senha.length() == 0)) {
            System.out.println("Senha invalida.");
        } else {
            System.out.println("Senha valida.");
        }
        return senha;
    }
}







