package behavioral.memento;

import static org.junit.Assert.*;

import org.junit.Test;

public class TextEditorTest {

	@Test
	public void testMemento() {
		TextEditor textEditor = new TextEditor(new TextWindowOriginator());
		textEditor.write("Memento Design Pattern");
		textEditor.hitSave();
		textEditor.write("This will be undone!");
		textEditor.hitUndo();
		assertEquals("Memento Design Pattern",textEditor.print());
	}	

}
