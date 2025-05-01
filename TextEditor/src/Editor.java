public class Editor {
    public static void main(String[] args) {
        TextDocument document = new TextDocument();
        History history = new History();

        Command cmd1 = new WriteCommand(document, history, "Ce faci?");
        cmd1.execute();
        document.show();

        Command cmd2 = new WriteCommand(document, history, "Bine, tu?");
        cmd2.execute();
        document.show();

        cmd2.undo();
        document.show();

        document.restore(history.redo(document.save()));
        document.show();
    }
}
