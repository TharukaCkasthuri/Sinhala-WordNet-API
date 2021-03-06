package net.sf.extjwnl.util.factory;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.dictionary.Dictionary;

/**
 * Supports ownership information.
 * @author  <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public interface Owned {

    /**
	 * Returns the dictionary this object belongs to.
	 * @return    the dictionary this object belongs to
	 * @uml.property  name="dictionary"
	 * @uml.associationEnd  
	 */
    Dictionary getDictionary();

    /**
	 * Sets the dictionary this object belongs to.
	 * @param dictionary  the dictionary this object belongs to
	 * @throws JWNLException  JWNLException
	 * @uml.property  name="dictionary"
	 */
    void setDictionary(Dictionary dictionary) throws JWNLException;
}
