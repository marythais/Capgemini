package capgemini;

public class Question2 {
    private static int CARACTERES = 6;

    public static int testaSenha(String senha) {
        int caracteresFaltantes = CARACTERES - senha.length();
        return Math.max(caracteresFaltantes, 0);
    }
}