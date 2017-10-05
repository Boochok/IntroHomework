import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * The {@code Notepad} class represents the list of notes - the objects of {@link Note} class.
 *
 * <p>
 *  The {@code Notepad} class uses the object of the {@link java.util.ArrayList} class
 *  for storing and manipulating the {@link Note} class objects.
 * <p>
 *  The {@code addNotes}, {@code removeNotes}, {@code showAllNotes} operations
 *  are very simple and generally don't need to be represented, except a couple
 *  of details. But for practice author writes notes above each of them.
 *
 *  @author a student
 *  @see java.util.ArrayList
 *  @see Note
 *  @version 1.0
 */

public class Notepad {
    ArrayList<Note> notepad = new ArrayList<>();

    /**
     * Adds new note to the array of notes.
     *
     * @param note to add
     */
    public void addNotes(Note note) {
        notepad.add(note);
    }

    /**
     * Removes note from notepad.
     *
     * @param note to remove
     *
     * @exception NullPointerException if there is no such note in the notepad
     */
    public void removeNotes(Note note){
        if(notepad.contains(note))
            notepad.remove(note);
        else throw new NullPointerException();
    }
    /**
     * Creates a new object for {@code String s} field of {@link Note} class
     * by appending the value of new string to the current value of {@code String s}
     * using the {@link java.io.BufferedReader}, {@link java.io.InputStreamReader}
     *  and {@link java.lang.System} classes.
     *
     * @throws IOException if I/O error occurs
     *
     * @param note the refer to the {@link Note} class object
     *
     * @see java.io.BufferedReader
     * @see java.io.InputStreamReader
     * @see java.lang.System
     *
     */
    public void editNote(Note note) throws IOException {
        System.out.println("Edit: " + note);
        BufferedReader noteReader = new BufferedReader(new InputStreamReader(System.in));
        String temp = noteReader.readLine();
        note.s += temp;
    }

    /**
     * Shows all notes in the notepad.
     */
    public void showAllNotes(){
        System.out.println("All current notes:");
        for (Note note:notepad) {
            System.out.println(note);
        }
    }

}
