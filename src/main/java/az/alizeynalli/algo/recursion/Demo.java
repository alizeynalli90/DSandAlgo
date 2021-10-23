package az.alizeynalli.algo.recursion;

public class Demo {

    public static void main(String[] args) {
        System.out.println("+++Factorial+++");
        System.out.println(Factorial.calculateFactorial(3));

        System.out.println("+++TowerOfHanoi+++");
        TowerOfHanoi toh = new TowerOfHanoi();
        toh.move(3, 'A', 'C', 'B');
    }

}
