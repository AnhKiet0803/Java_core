package main.asm7;

public class Developer extends Employee implements BonusEligible{
    private int overtimeHours;

    public Developer(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public Developer(String id, String name, double baseSalary, int overtimeHours) {
        super(id, name, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + overtimeHours * 50_000;
    }

    @Override
    public double calculateBonus() {
        return getBaseSalary() * 20/100;
    }

    @Override
    public String getPosition() {
        return "Developer";
    }
}
