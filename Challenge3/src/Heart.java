public class Heart extends Organ {
    private int bpm;

    public int getBpm() {
        return bpm;
    }
    public void getDetails(){
        super.getDetails();
        System.out.println("Heart rate: "+this.getBpm());
    }
    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public Heart(String name, String medical, int bpm) {
        super(name, medical);
        this.bpm = bpm;
    }
}
