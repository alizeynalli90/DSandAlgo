package az.alizeynalli.algo.recursion;

public class TowerOfHanoi {

    public void move(int discs, char from, char to, char inter) {
        if (discs == 1) {
            System.out.println("Moving disc 1 from " + from + " to " + to);
        } else {
            move(discs - 1, from, inter, to);
            System.out.println("Moving disc " + discs + " from " + from + " to " + to);
            move(discs - 1, inter, to, from);
        }
    }

}
