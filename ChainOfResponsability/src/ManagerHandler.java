public class ManagerHandler extends HandlerConcediu {
    @Override
    public void handle(RequestConcediu request) {
        System.out.println("Manager: evaluare concediu pentru: " + request.getNume());
        if(request.getZile() <= 20) {
            System.out.println("Manager: se aprova concediul");
            if(next != null) next.handle(request);
        } else {
            System.out.println("Manager: se respinge, prea multe zile.");
        }
    }
}
