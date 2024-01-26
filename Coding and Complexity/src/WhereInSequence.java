public class WhereInSequence {
    public static int findClosestFib(int input) {

        if(input == 0){
            return 1;
        }
        if(input == 1){
            return 2;
        }

        int term = 1;
        int initial = 3;
        int current = 3;
        int counter = 3;
        while(input > current) {
            //generate next number and make it current
            current = (3*initial) + (2*term);
            term = initial;
            initial = current;
            counter ++;
        }

        if(input == current) {
            return current;
        }
        if(input < current) {
            return counter-1;
        }
        return -1;

    }
}
