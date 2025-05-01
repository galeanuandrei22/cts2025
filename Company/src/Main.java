public class Main {
    public static void main(String[] args) {
        Department headOffice = new Department("Sediu central");
        Department itDept = new Department("Departament IT");
        itDept.add(new Employee("Andrei", "Programator"));
        itDept.add(new Employee("Iasmina", "Administrator sistem"));
        Department hrDept = new Department("Departament HR");
        hrDept.add(new Employee("Maria", "Recrutor"));
        hrDept.add(new Employee("Alexandru", "Manager HR"));
        headOffice.add(itDept);
        headOffice.add(hrDept);
        headOffice.add(new Employee("Vasile", "CEO"));
        headOffice.showDetails();

        System.out.println("Parcurgere iterator");
        CompanyIterator iterator = new CompanyIterator(headOffice);
        while(iterator.hasNext()) {
            Component component = iterator.next();
            if(component instanceof Employee) {
                component.showDetails();
            }
        }
    }
}
