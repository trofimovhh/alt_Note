import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many notes do you want to create?");
        int notebookSize = sc.nextInt();
        Notebook myNotebook = new Notebook(notebookSize);
        String yourText = sc.nextLine();
        for (int notes = 0; notes < notebookSize; notes++) {
            System.out.println("Enter your note");
            yourText = sc.nextLine();
            myNotebook.addNote(yourText);
        }
        System.out.println("Congrats. Your notebook is full with awesome notes:");
        myNotebook.showAllNotes();

        System.out.println("If you want to delete note press 1, then <Enter>  \n" +
                "if you want to edit note - press 2, then <Enter>\n" +
                "if you want to add note - press 3, then <Enter>\n" +
                "if you want to print all notes - press 4, then <Enter>");
        int press = sc.nextInt();
        switch (press) {
            case 1:
                System.out.println("Enter NoteID that you want to delete");
                int noteIDtoDelete = sc.nextInt();
                myNotebook.deleteNote(noteIDtoDelete);
                myNotebook.showAllNotes();
                break;
            case 2:
                System.out.println("Enter NoteID that you want to change");
                int noteIDtoChange = sc.nextInt();
                System.out.println("Enter new text");
                String textToChange = sc.next();
                myNotebook.editNote(noteIDtoChange, textToChange);
                myNotebook.showAllNotes();
                break;
            case 3:
                System.out.println("Enter note that you want to add");
                String textToAdd = sc.next();
                myNotebook.addNote(textToAdd);
                myNotebook.showAllNotes();
                break;
            case 4:
                myNotebook.showAllNotes();
                break;
            default:
                System.out.println("Restart this program and try again!");
                break;
        }
        System.out.println("Restart this program and try again!");
    }
}
