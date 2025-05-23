public class HrHandler extends HandlerConcediu {
    @Override
    public void handle(RequestConcediu request) {
        System.out.println("HR: verific eligibilitate pentru " + request.getNume());
        if(request.getZile() <= 30) {
            System.out.println("HR: eligibil. Se trimite la manger.");
            if(next != null) next.handle(request);
        } else {
            System.out.println("HR: se respinge. Prea multe zile. (" + request.getZile() + ")");
        }
    }
}
