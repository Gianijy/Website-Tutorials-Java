public class Castings 
{
    public static void main(String[] args)
    {
        //WIDENING CASTING (automatically) - converting a smaller type to a larger type size.
            System.out.println("\n" + "----------------------------------------------" + "\n");
            System.out.println("WIDENING CASTING :" + "\n");

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        //NARROWING CASTING (manually) - converting a larger type to a smaller size type
            System.out.println("\n" + "----------------------------------------------" + "\n");
            System.out.println("NARROWING CASTING :" + "\n");

        double myDouble1 = 9.2;
        int myInt1 = (int) myDouble1;

        System.out.println(myDouble1); // Outputs 9.2
        System.out.println(myInt1); // Outputs 9

    }
}
