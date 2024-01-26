public class NotFibonacci {

    public static void calculateFib(int input) {

        int term = 0;
        int initial = 1;

        //add print 0 and 1
        System.out.println(0);
        System.out.println(1);

        for(int i = 0; i < input; i++) {
            int next = (3*initial) + (2*term);
            System.out.println(next);
            term = initial;
            initial = next;
        }




    }


}
