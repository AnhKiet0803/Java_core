package main.asm7;

public class Manager extends Employee implements BonusEligible {
    private int teamSize;

    public Manager(int teamSize) {
        this.teamSize = teamSize;
    }

    public Manager(String id, String name, double baseSalary, int teamSize) {
        super(id, name, baseSalary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + teamSize * 1_000_000;
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }

    @Override
    public double calculateBonus() {
        return getBaseSalary() * 30/100;
    }

    @Override
    public String getPosition() {
        return "Manager";
    }
}
