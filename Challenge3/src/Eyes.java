public class Eyes extends Organ {
    private String color;
    private boolean opened;

    public Eyes(String name, String medical, String color, boolean opened) {
        super(name, medical);
        this.color = color;
        this.opened = opened;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: "+ this.getColor());
    }
    public void open(){
        this.setOpened(true);
        System.out.println("Patient's eyes is opened");
    }
    public void close(){
        this.setOpened(false);
        System.out.println("Patient's eyes is closed");
    }
}
