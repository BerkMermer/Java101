public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (salary<100000){
            return 0;
        }else{
            return  salary*0.03;
        }

    }
    public double bonus(){
        if (workHours>40){
            return(workHours-40)*30;
        }else{
            return 0;
        }
    }

    public double raiseSalary(){
        int currentYear = 2021;
        int yearsWorked = currentYear - hireYear;

        if (yearsWorked < 10){
            return salary*0.05;
        }else if (yearsWorked < 20){
            return salary*0.10;
        }else{
            return salary*0.15;
        }
    }

    public String toString(){
        double taxAmount = tax();
        double bonusAmount = bonus();
        double raiseAmount = raiseSalary();
        double salaryWithTaxAndBonus = salary - taxAmount + bonusAmount;
        double totalSalary = salary + raiseAmount + bonusAmount - taxAmount;

        return "Adı: " + name + "\n" +
                "Maaşı:" + salary + "\n" +
                "Çalışma saati:" + workHours + "\n" +
                "Başlangıç Yılı: " + hireYear + "\n" +
                "Vergi:" + taxAmount + "\n" +
                "Bonus:" + bonusAmount + "\n" +
                "Maaş Artışı:" + raiseAmount + "\n" +
                "Vergi ve Bonnuslar ile birlikte maaş:" + salaryWithTaxAndBonus + "\n" +
                "Toplam Maaş:" + totalSalary;
    }
}
