package Decorators;

import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by pedro on 24/09/16.
 */
public class JustLettersReader extends DecoratorReader {

    public JustLettersReader(Reader readerFilter) {
        super(readerFilter);
    }

    private static final Logger LOGGER = Logger.getLogger( JustLettersReader.class.getName() );

    @Override
    public char[] applyFilter(char[] cbuf) {

        String justLettersString = new String(cbuf);
        justLettersString = justLettersString.replaceAll("[^A-Za-z]+", "");
        LOGGER.log(Level.INFO, justLettersString);
        return justLettersString.toCharArray();
    }

}
