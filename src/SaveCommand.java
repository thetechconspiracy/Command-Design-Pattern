/*
 * Written by Joseph Still
 * Saves the document
 */

public class SaveCommand implements Command {

  private Document document;

  /**
   *
   * @param document: The document that the method operates on.
   */
  public SaveCommand(Document document) { this.document = document; }
  /**
   *Calls the Save command in the document
   */
  public void execute() { document.save(); }
}
