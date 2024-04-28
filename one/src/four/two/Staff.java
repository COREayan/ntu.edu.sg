package four.two;

public class Staff {
    private String school;
    private double pay;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff["+super.toString()+",school="+this.school+",pay="+this.pay+"]";
    }
}
