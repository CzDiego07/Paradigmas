    abstract class Employee {
        private String Name;
        private double Salary;

        public Employee(String Name, double Salary) throws InvalidBalanceException {
            if (Salary <= 0) {
                throw new InvalidBalanceException("Salary has to elder than 0.");
            }
            this.Name = Name;
            this.Salary = Salary;
        }

        public String getName() {
            return Name;
        }

        public double getSalary() {
            return Salary;
        }
    }
    //------------------------------------------------------------------------------------------------
    class EmployeeHour extends Employee {
        private int HourWorked;
        private double ValueHour;

        public EmployeeHour(String Name, double Salary, int HourWorked, double ValueHour) throws InvalidBalanceException {
            super(Name, Salary);
            if (Salary <= 0) {
                throw new InvalidBalanceException("Salary has to elder than 0.");
            }
            this.HourWorked = HourWorked;
            this.ValueHour = ValueHour;
        }

        public double calcularSalary() {
            return HourWorked * ValueHour;
        }
    }
    //----------------------------------------------------------------------------------------------------------
    class EmployeeAsalariado extends Employee implements Bonificable {
        private int DaysWorked;
        private double SalaryMensual;

        public EmployeeAsalariado(String Name, double Salary, int DaysWorked, double SalaryMensual) throws InvalidBalanceException {
            super(Name, Salary);
            if (Salary <= 0) {
                throw new InvalidBalanceException("Salary has to elder than 0.");
            }
            this.DaysWorked = DaysWorked;
            this.SalaryMensual = SalaryMensual;
        }

        public double calcularSalary() {
            return (SalaryMensual / 30) * DaysWorked;
        }

        public double calcularBonificacion() {
            return calcularSalary() * 0.1; // bonificación del 10%
        }
    }
    //----------------------------------------------------------------------------------------------------------
    interface Bonificable {
        public double calcularBonificacion();
    }
    //----------------------------------------------------------------------------------------------------------
    class InvalidBalanceException extends Exception {
        public InvalidBalanceException(String Message) {
            super(Message);
        }
    }
    //----------------------------------------------------------------------------------------------------------
    public class Main {
        public static void main(String[] args) {
            try {
                EmployeeHour emp1 = new EmployeeHour("Juan", 4000, 8, 10);
                System.out.println("El Salary de " + emp1.getName() + " es: " + emp1.calcularSalary());
                EmployeeAsalariado emp2 = new EmployeeAsalariado("Pedro", 10000, 20, 30000);
                System.out.println("El Salary de " + emp2.getName() + " es: " + emp2.calcularSalary());
                if (emp2 instanceof Bonificable) { // If the instance is of type 'EmployeeAsalariado'
                    System.out.println("La bonificación de " + emp2.getName() + " es: " + ((Bonificable) emp2).calcularBonificacion());
                }
                EmployeeAsalariado emp3 = new EmployeeAsalariado("María", 60000, 25, 40000); // intenta crear un Employee con Salary negativo
                System.out.println("El Salary de " + emp3.getName() + " es: " + emp3.calcularSalary());
            } catch (InvalidBalanceException e) { // capture of exception 'InvalidBalanceException'
                System.out.println(e.getMessage()); // Show message in case of error
            }
        }
    }