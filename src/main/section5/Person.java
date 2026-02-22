package main.section5;

public abstract class Person {    //đây là 1 class abstract(trừu tượng)
    private String fullname;
    private String DOB;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public abstract void eat(); // abstract funtion
    public abstract void sleep();
}
