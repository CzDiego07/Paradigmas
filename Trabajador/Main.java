import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Obrero> Obrero = new ArrayList<>();
        Obrero O1 = new Obrero("Juan", 30, 3000.0);
        Obrero O2 = new Obrero("Ivan", 32, 3000.0);
        Obrero O3 = new Obrero("Jesus", 37, 3000.0);
        Obrero O4 = new Obrero("Daniel", 40, 3000.0);
        Obrero.add(O1);
        Obrero.add(O2);
        Obrero.add(O3);
        Obrero.add(O4);

        ArrayList<Supervisor> Supervisor = new ArrayList<>();
        Supervisor S1 = new Supervisor("Samuel",40,5000.0);
        Supervisor S2 = new Supervisor("Javier",43,5000.0);
        Supervisor S3 = new Supervisor("Carlos",49,5000.0);
        Supervisor.add(S1);
        Supervisor.add(S2);
        Supervisor.add(S3);

        ArrayList<Gerente> Gerente = new ArrayList<>();
        Gerente G1 = new Gerente("Jose", 56, 7000.0);
        Gerente G2 = new Gerente("David", 50, 7000.0);
        Gerente G3 = new Gerente("Jorge", 59, 7000.0);
        Gerente.add(G1);
        Gerente.add(G2);
        Gerente.add(G3);
        System.out.println("-------------------------------------");
        System.out.println("Obreros: ");
        for(int i=0;i<Obrero.size();i++){
            System.out.println(Obrero.get(i));
        }
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("Supervisadores: ");
        for(int i=0;i<Supervisor.size();i++){
            System.out.println(Supervisor.get(i));
        }
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("Gerentes: ");
        for(int i=0;i<Gerente.size();i++){
            System.out.println(Gerente.get(i));
        }
        System.out.println("-------------------------------------");
    }
}
