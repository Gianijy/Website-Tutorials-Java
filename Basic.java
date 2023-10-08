//THE FILE NAME AND THE CLASS NAME SHOULD BE THE SAME (IT IS CASE SENSITIVE. Basic is different from BASIC).
class Basic
{
    public static void main(String[] args)
    {
        // BASIC OUTPUT
            System.out.println("\n" + "--------------------------------");
            System.out.println("BASIC INPUT/OUTPUT :" + "\n");

        System.out.println("Hello World!");
        final int myNum = 3000;
        System.out.println("I love you " + myNum);
        
        //STRINGS
            System.out.println("\n" + "--------------------------------");
            System.out.println("STRINGS :" + "\n");

        String FirstName = "Gian Ijy";
        String LastName = "Clemente";
        System.out.println(FirstName + " " + LastName);
        FirstName = "Gian";
        System.out.println(FirstName + " " + LastName);
        
        //NUMBERS
            System.out.println("\n" + "--------------------------------");
            System.out.println("NUMBERS :" + "\n");

        int myNum1 = 1000;
        float myNum2 = (float) 74.55;
        double myNum3 = 294.98;
        System.out.println(myNum1 + myNum2 + myNum3);
        int myNum4 = 1;
        int myNum5 = 2;
        int myNum6 = 3;
        System.out.println(myNum4 + myNum5 + myNum6);

        //BOOLEAN
            System.out.println("\n" + "--------------------------------");
            System.out.println("BOOLEAN :" + "\n");
        
        boolean isProgrammingFun = true;
        boolean isLiftingFun = true;
        boolean Gymbro = true;
        boolean Programmer = true;
        String GymbroProgrammer = "BROGRAMMER";
        System.out.println("Is programming fun? " + isProgrammingFun);
        System.out.println("Is Lifting fun? " + isLiftingFun);
        System.out.println("Are you a Gymbro? " + Gymbro);
        System.out.println("Are you a Programmer? " + Programmer);
        System.out.println("What are you called then? " + GymbroProgrammer);

            System.out.println("\n" + "--------------------------------");
    }
}