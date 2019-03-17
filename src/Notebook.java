import java.util.Arrays;

public final class Notebook {

    private int index = 0;

    private Note[] myNotebook;

    protected Notebook(int size) {
        if (size < 0) {
            throw new NullPointerException("Size can't be negative");
        } else {
            this.myNotebook = new Note[size];
        }
    }

    protected void addNote(String text) {
        if (index < myNotebook.length) {
            myNotebook[index] = new Note(text);
            index++;
        } else {
            myNotebook = Arrays.copyOf(myNotebook, myNotebook.length + 1);
            myNotebook[index] = new Note(text);
            index++;
        }
    }

    protected void deleteNote(int index) {
        if (index >= myNotebook.length) {
            System.out.println("No note with this index");
        } else {
            if (index != myNotebook.length - 1) {
                for (int id = index; id < myNotebook.length - 1; id++) {
                    myNotebook[id] = myNotebook[id + 1];
                }
            } else {
                myNotebook[index] = null;
            }
            myNotebook = Arrays.copyOf(myNotebook, myNotebook.length - 1);
            index--;
        }
    }

    protected void editNote(int index, String text) {
        if (index >= myNotebook.length) {
            System.out.println("Can't edit a nonexistent note");
        } else {
            myNotebook[index].setText(text);
        }
    }

    protected void showAllNotes() {
        for (int noteID = 0; noteID < myNotebook.length; noteID++) {
            System.out.print("NoteID: " + noteID + " " + "Note: " + myNotebook[noteID] + ";    " + "\n");
        }
    }
}
