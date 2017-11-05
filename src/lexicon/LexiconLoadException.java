package lexicon;

/**
 * This class ...
 *
 * @author   Ricardo Rodrigues
 * @version  0.9.7
 */
public class LexiconLoadException extends Exception{
  private static final long serialVersionUID = 1L;

  /**
   * Creates a new ...
   * 
   */
  public LexiconLoadException() {
    super();
  }

  /**
   * Creates a new ...
   * 
   * @param  message ...
   */
  public LexiconLoadException(String message) {
    super(message);
  }
}
