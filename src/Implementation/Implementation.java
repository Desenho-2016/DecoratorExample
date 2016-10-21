package Implementation;

import Decorators.JustLettersReader;
import Decorators.NoAccentReader;
import Decorators.UpperCaseReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * Created by pedro on 24/09/16.
 */
public class Implementation {

    public static void main(String[] args) throws IOException {

        String frase = new String("O pior não é morrer. É não poder espantar as moscas. ('Millôr Fernandes')");

        Reader noAccent = new NoAccentReader(new StringReader(frase));
        Reader justLetters = new JustLettersReader(new StringReader(frase));
        Reader upperCase = new UpperCaseReader(new StringReader(frase));

        noAccent.read(frase.toCharArray());
        justLetters.read(frase.toCharArray());
        upperCase.read(frase.toCharArray());

    }

}
