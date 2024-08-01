public class Employee {
    String name;
    double salary;
    int workHouse;
    int hireYear;

    Employee(String name, Double salary, int workHouse, int hireYear ){
        this.name = name;
        this.salary = salary;
        this.workHouse = workHouse;
        this.hireYear = hireYear;
    }

    double tax(){
        double appliedTax = 0;
        if(this.salary > 1000){
          appliedTax = this.salary * 0.03;
          return appliedTax;
        }
        return this.salary;
    }
    int bonus(){
        int bonusMoney = 0;
        if(workHouse > 40){
            bonusMoney = (workHouse - 40) * 30;
            return bonusMoney;
        }
        return bonusMoney;
    }
    double raiseSalary(){
        int control = 0;
        double payRaise = 0.0;
        control = 2024 - this.hireYear;
        if(control > 10){
            payRaise = this.salary * 0.05;
            return payRaise;
        }
        else if(control > 9 && 20 > control ){
            payRaise = this.salary * 0.10;
            return payRaise;
        }
        else if(control > 19){
            payRaise = this.salary * 0.15;
            return payRaise;
        }
        return payRaise;
    }
    double totalSalary(){
        double totalSalary=(this.salary+bonus()+raiseSalary())-tax();
        return totalSalary;
    }
    void employeeInfo(){
        System.out.println("Adı:"+this.name);
        System.out.println("Maaşı:"+this.salary);
        System.out.println("Çalışma Saati:"+this.workHouse);
        System.out.println("Başlangıç Yılı:"+this.hireYear);
        System.out.println("Vergi:"+tax());
        System.out.println("Bonus:"+bonus());
        System.out.println("Maaş Artışı:"+raiseSalary());
        System.out.println("Toplam Maaş:"+totalSalary());
    }
}
