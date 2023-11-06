public class Stomach extends Organ{
    private boolean isEmpty;

    public Stomach(String name, String medical, boolean isEmpty) {
        super(name, medical);
        this.isEmpty = isEmpty;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        if (this.isEmpty())
        {
            System.out.println("Need to be feed");
        }else{
            System.out.println("It's ok");
        }
    }
    public void digest(){
        System.out.println("Digest beginning...");
    }
}