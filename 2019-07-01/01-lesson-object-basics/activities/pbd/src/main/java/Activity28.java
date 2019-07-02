public class Activity28 {

    public static void main( String[] args ) throws Exception
    {
        for ( int i=0; i < 100; i++ )
        {
            if ( i % 16 == 0 )
                System.out.println(" *************************");
            else if ( i % 16 == 1 )
                System.out.println("   ***********************");
            else if ( i % 16 == 2 )
                System.out.println("     *********************");
            else if ( i % 16 == 3 )
                System.out.println("       *******************");
            else if ( i % 16 == 4 )
                System.out.println("         *****************");
            else if ( i % 16 == 5 )
                System.out.println("           ***************");
            else if ( i % 16 == 6 )
                System.out.println("             *************");
            else if ( i % 16 == 7 )
                System.out.println("               ***********");
            else if ( i % 16 == 8 )
                System.out.println("                 *********");
            else if ( i % 16 == 9 )
                System.out.println("               ***********");
            else if ( i % 16 == 10 )
                System.out.println("             *************");
            else if ( i % 16 == 11 )
                System.out.println("           ***************");
            else if ( i % 16 == 12 )
                System.out.println("         *****************");
            else if ( i % 16 == 13 )
                System.out.println("       *******************");
            else if ( i % 16 == 14 )
                System.out.println("     *********************");
            else if ( i % 16 == 15 )
                System.out.println("   ***********************");

            Thread.sleep(150);
        }

    }
}

//    Assignments turned in without these things will receive no credit.
//
//        Add several if statements in ModulusAnimation.java so that it draws a little animation of your choosing. You must have a minimum
//        of eight (8) different frames of animation, and it must loop smoothly.
