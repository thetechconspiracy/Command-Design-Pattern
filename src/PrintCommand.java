/**
 * @author Colin Bowes
 * executes print() method from Document class
 */
public class PrintCommand implements Command {
	
	private Document doc;

	/**
	 * @param doc  --	the document to be printed
	 * establishes the document
	 */
	public PrintCommand(Document doc) {
		this.doc = doc;
	}

	/**
	 * calls the document's print() method which displays the print message
	 */
	@Override
	public void execute() {
		doc.print();
	}

}