package ExamenPrimerParcial;


public class EmpleadoVendedor extends Empleado{
    Double Montovendido;
    Double TasaComicion;
    public EmpleadoVendedor(String Nombre, String Apellidos, String RFC,Double Montovendido,Double TasaComicion){
        super(Nombre,Apellidos,RFC);
        this.Montovendido = Montovendido;
        this.TasaComicion= TasaComicion;
    }
    public void SetMonto(Double Monto){
        this.Montovendido= Monto;
    }
    public Double getMonto(){
        return Montovendido;
    }
    public void setTasa(Double tasa){
        this.TasaComicion= tasa;
    }
    public Double getTasa(){
        return TasaComicion;
    }
    public Double CalcularIngreso(){
        Double ingresos = Montovendido*TasaComicion;
        return ingresos;
    }
    public void calcularBonificacion(){
        double bonificacion=Montovendido;
        if(Montovendido<1000){
            System.out.println( "No tendra bonificacion");
        }else{
            if(Montovendido>1000&&Montovendido<5000){
                System.out.println( "Bonificacion sera de 5%");
                bonificacion = (Montovendido*105)/100;
                System.out.println(bonificacion);
            }else{
                if(Montovendido>5000){
                    System.out.println("Su bonificacion sera de 10%");
                    bonificacion = (Montovendido*110)/100;
                    System.out.println(bonificacion);
                }
            }
        }
    }
    public void calcularDescuento(){
        double bonificacion=0;
        if(Montovendido<1000){
            bonificacion=Montovendido;
        }else{
            if(Montovendido>1000&&Montovendido<5000){
                bonificacion = (Montovendido*105)/100;
                System.out.println(bonificacion);
            }else{
                if(Montovendido>5000){
                    bonificacion = (Montovendido*110)/100;
                    System.out.println(bonificacion);
                }
            }
        }
        if(bonificacion<1000){
            System.out.println("Descuento sera del 11%");
        }else{
            System.out.println("Su descuento sera del 15%");
        }
    }
    public void calcularSueldoNeto(){
        double bonificacion=0;
        double descuento;
        if(Montovendido<1000){
            bonificacion=Montovendido;
        }else{
            if(Montovendido>1000&&Montovendido<5000){
                bonificacion = (Montovendido*105)/100;
                System.out.println(bonificacion);
            }else{
                if(Montovendido>5000){
                    bonificacion = (Montovendido*110)/100;
                    System.out.println(bonificacion);
                }
            }
        }
        if(bonificacion<1000){
            descuento=bonificacion-(Montovendido*5/100);
        }else{
            descuento=bonificacion-(Montovendido*15/100);
        }
        System.out.println("Sueldo neto: "+ descuento);
    }
}
