package Decorators;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by pedro on 24/09/16.
 */
public abstract class DecoratorReader extends Reader {

    private Reader readerFilter;

    public DecoratorReader(Reader readerFilter) {
        this.readerFilter = readerFilter;
    }

    @Override
    public int read(char[] cbuf) throws IOException {
        return readerFilter.read(applyFilter(cbuf));
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return readerFilter.read(applyFilter(cbuf), off, len);
    }

    @Override
    public void close() throws IOException {
        readerFilter.close();
    }

    public abstract char[] applyFilter(char [] cbuf);

}
