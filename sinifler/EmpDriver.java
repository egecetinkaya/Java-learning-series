public class EmpDriver {
    public static void main(String[] args){
        Employee Emp1 = new Employee(1985, 45, 2000.0, "Kemal");
        System.out.println("Tax :" + Emp1.tax());
        System.out.println("bonus :" + Emp1.bonus());
        System.out.println("increase :" + Emp1.incrase());
        double totalSalary = Emp1.salary - Emp1.tax() + Emp1.bonus();
        System.out.println("Tax and bonus:" + totalSalary);
        System.out.println("raise of salary :" + (Emp1.salary+Emp1.incrase()));
    }
}
