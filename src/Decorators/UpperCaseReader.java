package Decorators;

import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by pedro on 24/09/16.
 */
public class UpperCaseReader extends DecoratorReader {

    public UpperCaseReader(Reader readerFilter) {
        super(readerFilter);
    }

    private static final Logger LOGGER = Logger.getLogger( UpperCaseReader.class.getName() );


    @Override
    public char[] applyFilter(char[] cbuf) {

        String upperCaseString = new String(cbuf).toUpperCase();
        LOGGER.log(Level.INFO, upperCaseString);
        return upperCaseString.toCharArray();
    }

}
