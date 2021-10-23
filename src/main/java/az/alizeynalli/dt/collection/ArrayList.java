package az.alizeynalli.dt.collection;

public class ArrayList {

    public static void main(String[] args) {
        java.util.ArrayList<String> games = new java.util.ArrayList<String>();
        games.add("Call of Duty");
        games.add("Battlefield");
        System.out.println(games);
        games.add(0, "Zelda");
        System.out.println(games);
        games.remove(1);
        System.out.println(games);
    }

}
