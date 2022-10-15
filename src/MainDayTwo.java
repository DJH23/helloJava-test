import java.util.ArrayList;

public class MainDayTwo {

    public static void main(String[] args) {
        System.out.println("Welcome to day 2");

    //  conditions

        var age = 19;

        if(age >21){
            System.out.println("You can enter");
        } else if (age < 21 && age > 18) {
            System.out.println("You can enter but you can't drink alcohol");
        } else {
            System.out.println("You can't enter");
        }


        switch (age) {
            case 1 -> {
                System.out.println("You can enter");
                break;
            }
            case 19 -> {
                System.out.println("You can enter but you can't drink alcohol");
                break;
            }
            default -> {
                System.out.println("You can't enter");
                break;
            }
        }

        //  iterate (loop)

        for (int i = 0; i < 10; i++) {
            System.out.println("hello" + i);
        }

    // collections

        var name1 = "Xavi";
        var name2 = "Maria";
        var name3 = "Pedro";

        var students = new ArrayList<String>();
        students.add(name1);
        students.add(name2);
        students.add(name3);

        System.out.println(students.get(1));

        for (int i = 10; i > 0; --i) {
            System.out.println("tick tock " +i);
        }
            System.out.println("BOOM!");

        var dish1 = "pasta";
        var dish2 = "steak";
        var dish3 = "chocolate";
        var dish4 = "salad";
        var dish5 = "yoghurt";
        var dish6 = "salmon";

        var menuItems = new ArrayList<String>();
        menuItems.add(dish1);
        menuItems.add(dish2);
        menuItems.add(dish3);
        menuItems.add(dish4);
        menuItems.add(dish5);
        menuItems.add(dish6);

        System.out.println(menuItems);

        var menuCapitalised = new ArrayList<String>();
        for (String dish : menuItems)

    //  methods



    //  git


    }

}
