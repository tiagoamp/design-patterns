package behavioral.memento;

public class TextEditor {
	
	private TextWindowOriginator textWindow;
	private TextWindowStateMemento savedTextWindow;
	 
    public TextEditor(TextWindowOriginator textWindow) {
        this.textWindow = textWindow;
    }
    
    public void write(String text) {
    	textWindow.addText(text);
    }
    
    public String print() {
    	return textWindow.getText();
    }

    public void hitSave() {
        savedTextWindow = textWindow.save();
    }
     
    public void hitUndo() {
        textWindow.restore(savedTextWindow);
    }
}
