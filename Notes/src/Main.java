import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Notepad notepad = new Notepad();
        Note note1 = new Note();
        Note note2 = new Note();
        note1.addNote();
        note2.addNote();
        notepad.addNotes(note1);
        notepad.addNotes(note2);
        notepad.editNote(note2);
        notepad.showAllNotes();
        notepad.removeNotes(note2);
        notepad.showAllNotes();

    }
}
