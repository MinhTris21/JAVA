public class Football extends Person{
    String fc;
    String pos;
    Football(String name, int age, String gender, String fc, String pos )
    {
        super(name,age,gender);
        this.fc=fc;
        this.pos=pos;
    }
    public String getFc() {
        return fc;

    }

    public void setFc(String fc) {
        this.fc = fc;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\t\tAge: " + age + "\t\tGender: " + gender + "\t\tFC: " +fc+"\t\tPosition: "+pos;
    }
    public void display(){
        System.out.println(toString());
    }
}
