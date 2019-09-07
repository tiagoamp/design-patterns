package behavioral.memento;

public class TextWindowStateMemento {

	private String text;
	 
    public TextWindowStateMemento(String text) {
        this.text = text;
    }
 
    public String getText() {
        return text;
    }
    
}
