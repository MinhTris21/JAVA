public class Inheritance {
    public static void main(String[] args) {
        //REPRESENT FOR PERSON CLASS

        Person Human1 = new Person("Nguyet", 20, "Female");
        Person Human2 = new Person("Hung", 20, "Female");
        Person Human3 = new Person("Duc", 20, "Female");

        //REPRESENT FOR FAMILY CLASS
        Family Father = new Family("Thai", 54, "Male", "Sweet taste", "Yellow");
        Family Mother = new Family("Nhan", 52, "Female", "Fish", "Purple");
        Family Brother = new Family("Binh", 26, "Male", "Pumpkin", "Black");
        Family Myself = new Family("Tris", 20, "Male", "Mi Tom", "Cyan");
        Family Sister = new Family("Yen", 9, "Female", "Snack", "Pink");

        //REPRESENT FOR SUPER CLASS
        Hero Batman = new Hero("Batman", 60, "Male", "Bat soup", "DC COMIC");
        Hero Superman = new Hero("Superman", 200, "Male", "Laser eyes", "DC COMIC");
        Hero Ironman = new Hero("Tony Stonk", 46, "Male", "Rich", "Marvel");

        //REPRESENT FOR FOOTBALL CLASS
        Football Messi = new Football("Lionel Messi",34,"Male","PSG","Left Wing");
        Football Neymar = new Football("Neymar.Jr",30,"Male","PSG","Right Wing");
        Football Pedri = new Football("Perdi Gonzalez",19,"Male","FCB","CMD");


        //USE OVERRIDE METHOD TO DISPLAY ATTRIBUTES OF EACH CLASS
        System.out.println("---------------------------------------PERSON CLASS------------------------------------------");
        Human1.display();
        Human2.display();
        Human3.display();
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
        System.out.println("---------------------------------------FOOTBALL CLASS---------------------------------------------");
        Messi.display();
        Neymar.display();
        Pedri.display();
    }
}
