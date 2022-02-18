package capgemini;

import java.util.Scanner;

public class Question3 {
        private static void ;
        }

        public static void imprimeAnagramas(String prefix, String word) {
            if (word.length() <= 1) {
                System.out.println(prefix + word);
            } else {
                for (int i = 0; i < word.length(); i++) {
                    String cur = word.substring(i, i + 1);
                    String before = word.substring(0, i);
                    String after = word.substring(i + 1);
                    imprimeAnagramas(prefix + cur, before + after);
                }
            }
        }
}
