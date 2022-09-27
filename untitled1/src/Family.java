public class Family extends Person{
    String meal;
    String color;
    Family(String name, int age, String gender, String meal, String color){
        super(name, age, gender);
        this.meal=meal;
        this.color=color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    @Override
    public String toString() {
        return "Name: "+name + "\t\tAge: "+age+"\t\tGender: "+gender+"\t\tFavourite meal: "+meal+"\t\tFavourtice color: "+color;
    }
    public void display()
    {
        System.out.println(toString());
    }
}
