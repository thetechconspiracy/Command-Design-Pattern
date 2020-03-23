/**
 * 
 * @author Brian Remer
 * This is the SpellCommand class. Its purpose is to execute the spell method from the given document
 */
public class SpellCommand implements Command {
	
	private Document document;
	
	/**
	 * 
	 * @param document, the document on which the method will be called
	 * This is the constructor that establishes the document
	 */
	public SpellCommand(Document document) {
		this.document = document;
	}
	
	/**
	 * this is the execute method that must be run from the interface
	 * it calls the document's sell method which displays the load message
	 */
	public void execute() {
		document.spell();
	}
}
