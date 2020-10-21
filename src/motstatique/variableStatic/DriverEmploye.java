package motstatique.variableStatic;

public class DriverEmploye {
    public static void main(String[] args) {

        EmployeConstante employe1 = new EmployeConstante("Paco");
        EmployeConstante employe2 = new EmployeConstante("Maria");
        EmployeConstante employe3 = new EmployeConstante("Antoine");
        EmployeConstante employe4 = new EmployeConstante("Pedro");
        employe1.setSection("RRHH");

        System.out.println(employe1.getSection());
        System.out.println(employe2.getSection());
        System.out.println(employe3.getSection());
        System.out.println(employe4.getSection());
    }
}
