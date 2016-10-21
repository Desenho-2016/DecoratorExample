package Decorators;

import java.io.Reader;
import java.text.Normalizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by pedro on 24/09/16.
 */
public class NoAccentReader extends DecoratorReader {

    public NoAccentReader(Reader readerFilter) {
        super(readerFilter);
    }

    private static final Logger LOGGER = Logger.getLogger( NoAccentReader.class.getName() );


    @Override
    public char[] applyFilter(char[] cbuf) {

        String noAccentString = new String(cbuf);
        noAccentString =  Normalizer.normalize(noAccentString, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        LOGGER.log(Level.INFO, noAccentString);
        return noAccentString.toCharArray();
    }

}
