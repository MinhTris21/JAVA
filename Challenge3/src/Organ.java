public class Organ {
    private String name;
    private String medical;
    public Organ(String name, String medical) {
        this.name = name;
        this.medical = medical;
    }
    public String getName() {
        return name;
    }
    public void getDetails(){
        System.out.println("Name: " + this.getName());
        System.out.println("Medical condition: "+ this.getMedical());
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMedical() {
        return medical;
    }

    public void setMedical(String medical) {
        this.medical = medical;
    }
}

