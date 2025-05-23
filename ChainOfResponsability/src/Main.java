public class Main {
    public static void main(String[] args) {
        HandlerConcediu hr = new HrHandler();
        HandlerConcediu manager = new ManagerHandler();
        HandlerConcediu financiar = new FinanciarHandler();
        hr.setNext(manager).setNext(financiar);

        System.out.println("test 1");
        hr.handle(new RequestConcediu("alin", 10));

        System.out.println("test 2");
        hr.handle(new RequestConcediu("ionut", 35));

        System.out.println("test 3");
        hr.handle(new RequestConcediu("vali", 25));
    }
}
