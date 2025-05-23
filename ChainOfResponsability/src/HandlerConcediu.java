public abstract class HandlerConcediu {
    protected HandlerConcediu next;

    public HandlerConcediu setNext(HandlerConcediu next) {
        this.next = next;
        return next;
    }

    public abstract void handle(RequestConcediu request);
}
