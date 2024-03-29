public class Patient{
    private String name;
    private int age;
    private Eyes lefteye;
    private Eyes righteye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    public Patient(String name, int age, Eyes lefteye, Eyes righteye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.lefteye = lefteye;
        this.righteye = righteye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Eyes getLefteye() {
        return lefteye;
    }

    public void setLefteye(Eyes lefteye) {
        this.lefteye = lefteye;
    }

    public Eyes getRighteye() {
        return righteye;
    }

    public void setRighteye(Eyes righteye) {
        this.righteye = righteye;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }
}
