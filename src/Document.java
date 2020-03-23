/**
 * 
 * @author Brian Remer
 * This is the document class. The purpose is to establish what should be printed out when different methods are invoked. 
 */
public class Document {
	
	private String name;
	/**
	 * 
	 * @param name, String to be printed out
	 * This class prints out the name of the document
	 */
	Document(String name){
		this.name = name;
		System.out.println("Document name " + this.name + " is created.");
	}
	
	/**
	 * This is the load method.
	 * It displays the load message.
	 */
	public void load() {
		System.out.println("document " + this.name + " is loaded into view");
	}
	
	/**
	 * This is the spell method.
	 * It displays the spell message.
	 */
	public void spell() {
		System.out.println("document " + this.name + " is being checked for spelling errors");
	}
	
	/**
	 * This is the save method.
	 * It displays the save message.
	 */
	public void save() {
		System.out.println("document " + this.name + " is being saved...");
	}
	
	/**
	 * This is the print method.
	 * It displays the print message.
	 */
	public void print() {
		System.out.println("document " + this.name + " is printing...");
	}
	
}
