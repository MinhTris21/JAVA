public class Inheritance {
    public static void main(String[] args) {
        //REPRESENT FOR PERSON CLASS

        Person Messi = new Person("Messi",35,"Male");
        Person Ronaldo = new Person("7Chuon",37,"Male");
        Person Iniesta = new Person("Iniesta",38,"Male");

        //REPRESENT FOR FAMILY CLASS
        Family Father = new Family("Thai",54,"Male","Sweet taste","Yellow");
        Family Mother = new Family("Nhan",52,"Female","Fish","Purple");
        Family Brother = new Family("Binh",26,"Male","Pumpkin","Black");
        Family Myself = new Family("Tris",20,"Male","Mi Tom","Cyan");
        Family Sister = new Family("Yen",9,"Female","Snack","Pink");

        //REPRESENT FOR SUPER CLASS
        Hero Batman = new Hero("Batman",60,"Male","Bat soup","DC COMIC");
        Hero Superman = new Hero("Superman",200,"Male","Laser eyes","DC COMIC");
        Hero Ironman = new Hero("Tony Stonk",46,"Male","Rich","Marvel");

        //USE OVERRIDE METHOD TO DISPLAY ATTRIBUTES OF EACH CLASS
        System.out.println("---------------------------------------PERSON CLASS------------------------------------------");
        Messi.display();
        Ronaldo.display();
        Iniesta.display();
        System.out.println("------------------------------------FAMILY CLASS----------------------------------------------");
        Father.display();
        Mother.display();
        Brother.display();
        Myself.display();
        Sister.display();
        System.out.println("---------------------------------------HERO CLASS---------------------------------------------");
        Ironman.display();
        Batman.display();
        Superman.display();
    }
}
