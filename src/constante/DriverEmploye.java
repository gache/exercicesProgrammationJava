package constante;

public class DriverEmploye {
    public static void main(String[] args) {

        EmployeConstante employe1 = new EmployeConstante("Pedro");
        EmployeConstante employe2 = new EmployeConstante("Paco");
        employe1.setSection("RRHH");


        System.out.println(employe1.getSection());
        System.out.println(employe2.getSection());

    }
}


