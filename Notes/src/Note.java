import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The {@code Note} class creates some notes for the {@link Notepad} class.
 *
 * <p>
 *  The {@code Note} class creates notes in the{@code String s} field
 *  using the {@link java.io.BufferedReader}, {@link java.io.InputStreamReader}
 *  and {@link java.lang.System} classes.
 *
 *  @author a student
 *  @see java.io.BufferedReader
 *  @see java.io.InputStreamReader
 *  @see java.lang.System
 *  @see Notepad
 *  @version 1.0
 */

public class Note {
    public String s;

    /**
     * Adds new note to the {@code String s} field.
     *
     * @throws IOException if I/O error occurs
     */
    public void addNote() throws IOException {
        System.out.println("Add new note:");
        BufferedReader noteReader = new BufferedReader(new InputStreamReader(System.in));
        s = noteReader.readLine();
    }

    /**
     * Returns a string representation of the this class's object.
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString(){
        return s;
    }

}
