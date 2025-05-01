public class WriteCommand implements Command {
   private TextDocument document;
   private History history;
   private String newText;

   public WriteCommand(TextDocument document, History history, String newText) {
       this.document = document;
       this.history = history;
       this.newText = newText;
   }

    @Override
    public void execute() {
        history.saveState(document.save());
        document.setText(newText);
    }

    @Override
    public void undo() {
        document.restore(history.undo(document.save()));
    }
}
