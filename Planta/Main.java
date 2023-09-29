public class Main {
    public static void main(String[] args) {
        PlantaExterior exterior = new PlantaExterior("Planta 1","Exterior omniciente");
        PlantaInterior interior = new PlantaInterior("Planta 2","Interior omniciente");

        System.out.println("El nombre de la planta: "+ exterior.getNombre()+" Tipo de planta: "+exterior.getTipo());
        exterior.regar();
        exterior.podar();
        System.out.println("El nombre de la planta: "+ interior.getNombre()+" Tipo de planta: "+interior.getTipo());
        interior.regar();
        interior.podar();
    }
}