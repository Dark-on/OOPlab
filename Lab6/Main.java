
public class Main {
    public static void main(String[] args) {

        GameRoom gameRoom1 = new GameRoom();
        gameRoom1.add(new ToyForSmall("ball",20));
        gameRoom1.add(new ToyForSmall("block", 30));
        gameRoom1.add(new ToyForMiddle("bear", 42));
        gameRoom1.add(new ToyForMiddle("car", 99));
        gameRoom1.add(new ToyForMiddle("doll", 59));
        gameRoom1.add(new ToyForBig("lego", 81));

        System.out.println( "Summary price of all toys in this game room - " + gameRoom1.getPriceAllGames());

        gameRoom1.printAllToys();

        gameRoom1.sortToys();

        gameRoom1.printAllToys();

        gameRoom1.searchToy(60, 106);
    }
}
