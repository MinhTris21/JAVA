public class Person {
    public String name;
    public int age;
    public String gender;
    Person(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getgender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: "+name + "\t\tAge: "+age+"\t\tGender: "+gender;
    }
    public void display()
    {
        System.out.println(toString());
    }
}
