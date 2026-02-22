package main.asm7;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new Developer("DEV01", "Trần Tiến Huy", 15_000_000, 10),
                new Tester("TES01", "Nguyễn Thị Trúc Lan", 12_000_000, 15),
                new Manager("MAN01", "Hoàng Công Minh", 25_000_000, 5),
                new Developer("DEV02", "Trần Sở Khanh", 14_000_000, 5)
        };

        double totalSalary = 0;
        double totalBonus = 0;

        for (Employee emp : employees) {
            System.out.println("------------------------");
            emp.showInfo();

            totalSalary += emp.calculateSalary();

            if (emp instanceof BonusEligible) {
                double bonus = ((BonusEligible) emp).calculateBonus();
                System.out.println("Tiền thưởng: " + bonus);
                totalBonus += bonus;
            }
        }

        System.out.println("-----------------------------");
        System.out.println("Tổng lương phải trả toàn bộ cho công ty: " + totalSalary);
        System.out.println("Tổng tiền thưởng: " + totalBonus);
    }
}
