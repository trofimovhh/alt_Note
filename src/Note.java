public class Note {

    private String text;

    public Note(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText(Note this) {
        return this.text;
    }

    @Override
    public String toString() {
        return this.getText();
    }
}
