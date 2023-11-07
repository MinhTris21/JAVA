public class ElectricCar implements CarInterface{
    private String name;

    public ElectricCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printName(String name) {

    }

    @Override
    public void start() {
        System.out.println("The car is beginning to move...");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " speed is moving at "+ speed);
    }
}
