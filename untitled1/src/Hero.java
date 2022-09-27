public class Hero extends Person {
    String power;
    String movie;

    Hero(String name, int age, String gender, String power, String movie) {
        super(name, age, gender);
        this.power = power;
        this.movie = movie;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\t\tAge: " + age + "\t\tGender: " + gender + "\t\tSuperpower: " + power + "\t\tMovie: " + movie;
    }
}
