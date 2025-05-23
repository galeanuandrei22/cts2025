public class FinanciarHandler extends HandlerConcediu {
    @Override
    public void handle(RequestConcediu request) {
        System.out.println("Financiar: verific bugetul pentru " + request.getNume());
        System.out.println("Financiar: se aproba plata concediului.");
    }
}
