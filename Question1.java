package capgemini;

public class Question1 {
    private static String CARACTER = "*";
    private static String ESPACO = " ";

    public String montaEscada(int n) {
        StringBuilder saida = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            String caracteres = CARACTER.repeat(i);
            String espacos = ESPACO.repeat(n - i);
            String linhas =  espacos + caracteres;
            if (i > 1) saida.append("\n");
            saida.append(linhas);
        }
        return saida.toString();
    }

}
