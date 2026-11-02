public class Employee {
    private String name;
    public double salary;
    private int workHours, hireYears;

    Employee(int hireYears, int workHours, double salary, String name){
        this.name = name;
        this.hireYears = hireYears;
        this.workHours = workHours;
        this.salary = salary;
    }

    public double tax(){
        if (this.salary >= 1000){
            return this.salary * 0.03;
        }
        return  0.0;
    }

    public double bonus(){
        int fazlaMesai = this.workHours - 40;
        if(fazlaMesai > 0){
            return 30 * fazlaMesai;
        }
        return 0;
    }

    public double incrase(){
        int year = 2000 - this.hireYears;
        if(year < 10){
            return salary * 0.05;
        }else if(year >= 10 && year <= 20){
            return salary * 0.10;
        }else{
            return salary * 0.15;
        }
    }

}