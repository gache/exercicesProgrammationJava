package poo.motstatique.methodeStatic;

public class DriverMethodeStatic {
    public static void main(String[] args) {
        MethodeStatic employe1 = new MethodeStatic("Paco");
        MethodeStatic employe2 = new MethodeStatic("Maria");
        MethodeStatic employe3 = new MethodeStatic("Antoine");
        MethodeStatic employe4 = new MethodeStatic("Pedro");
        employe1.setSection("RRHH");

        System.out.println(employe1.getSection());
        System.out.println(employe2.getSection());
        System.out.println(employe3.getSection());
        System.out.println(employe4.getSection());
        System.out.println(MethodeStatic.getIdSuivant());

    }
}
