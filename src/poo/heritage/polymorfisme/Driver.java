package poo.heritage.polymorfisme;

public class Driver {
    public static void main(String[] args) {
//        Vehicule vehicule = new Vehicule("12GB","Ferrari", "A8");
//        Vehicule vehicule1 = new VehiculeTourisme("12GB","Ferrari", "A8", 5);
//        Vehicule vehicule2 = new VehiculeDeportive("12GB","Ferrari", "A8",1500);
//        Vehicule vehicule3 = new VehiculeFourgonnette("12GB","Ferrari", "A8", 500);

       /* System.out.println( vehicule.getDonner());
        System.out.println( vehicule1.getDonner());
        System.out.println( vehicule2.getDonner());
        System.out.println( vehicule3.getDonner());*/

        // ou je peux faire aussi
        Vehicule mesVehicule[] = new Vehicule[4];

        mesVehicule[0] = new Vehicule("12GB", "Ferrari", "A8");
        mesVehicule[1] = new VehiculeTourisme("12GB", "Ferrari", "A8", 5);
        mesVehicule[2] = new VehiculeDeportive("12GB", "Ferrari", "A8", 1500);
        mesVehicule[3] = new VehiculeFourgonnette("12GB", "Ferrari", "A8", 500);

        for (int i = 0; i < 4; i++) {
            System.out.println(mesVehicule[i].getDonner());

        }
        //Convertion type Upcasting
        Vehicule vehicule = new VehiculeTourisme("12GB", "Ferrari", "A8", 5);
        System.out.println(vehicule);
        // Convertion type Downcasting
        VehiculeTourisme vehiculeTourisme = (VehiculeTourisme) vehicule;
        System.out.println(vehiculeTourisme);


    }
}
