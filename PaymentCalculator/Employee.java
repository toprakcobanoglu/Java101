package java101.oop.PaymentCalculator;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear)   {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000)  {
            return 0;
        }else {
            return salary *0.03;
        }
    }

    public double bonus()   {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }else {
            return 0;
        }
    }

    public double raiseSalary() {
        int year = 2021;
        int workYear = year - hireYear;
        if (workYear < 10)  {
            return salary * 0.05;
        }else if ((workYear > 9) && (workYear < 20))    {
            return salary * 0.10;
        }else {
            return salary * 0.15;
        }
    }

    public String toString()    {
        System.out.println("Adi : "+this.name);
        System.out.println("Maasi : "+this.salary);
        System.out.println("Calisma Saati : "+this.workHours);
        System.out.println("Baslangic Yili : "+this.hireYear);
        System.out.println("Vergi : "+this.tax());
        System.out.println("Bonus Maas : "+this.bonus());
        System.out.println("Maas Artisi : "+this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte Maas : "+    (this.salary - this.tax() + this.bonus()));
        System.out.println("Toplam Maas : "+ (this.salary - this.tax() + this.bonus() + this.raiseSalary()));
        return "";
    }
}
