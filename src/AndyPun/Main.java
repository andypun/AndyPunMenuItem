package AndyPun;

public class Main {

    public static void main(String[] args)
    {
        Sandwich reuben = new Sandwich();
        Sandwich bec = new Sandwich();
        Salad waldorf = new Salad();
        Salad caeser = new Salad();
        Drink icedTea = new Drink();
        Drink smoothie = new Drink();

        Trio trio1 = new Trio(reuben, waldorf, icedTea);
        Trio trio2 = new Trio(bec, caeser, smoothie);
        Trio trio3 = new Trio(bec, caeser, icedTea);

        System.out.println(trio1, getName() + "Price:")

    }
}
