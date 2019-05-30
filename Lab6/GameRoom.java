import java.util.Arrays;
import java.util.Comparator;

public class GameRoom {
    private static int MAX_NUMBER_OF_TOYS_IN_ROOM  = 12;
    private Toy [] toys = new Toy[MAX_NUMBER_OF_TOYS_IN_ROOM];
    private int counter;
    private static int priceAllGames = 0;
    private final static int LIMIT_OF_PRICE = 3000;

    public void add(Toy toy) {
        int bufferPrice = priceAllGames + toy.getPrice();
        if (bufferPrice <= LIMIT_OF_PRICE && counter <= MAX_NUMBER_OF_TOYS_IN_ROOM){
            priceAllGames = bufferPrice;
            toys[counter++] = toy;
        } else {
            System.out.println("Price out of limit. !!!You don't have money!!!");
        }
    }

    public static int getPriceAllGames() {
        return priceAllGames;
    }

    public void sortToys(){
        Toy [] bufferToys = new Toy [counter];
        for (int i = 0; i < counter; i++) {
            if (toys [i] != null){
                bufferToys[i] = toys[i];
            }
        }
        Arrays.sort(bufferToys, Comparator.comparing(Toy::getName));
        toys = bufferToys;
    }

    public void printAllToys(){
        System.out.println("============~~~GameRoom~~~=============");
        for (Toy toy : toys) {
            if (toy != null ) System.out.println("Name - " + toy.getName() + "\tPrice - " + toy.getPrice());
        }
        System.out.println("---------------------------------------");
    }
    public void searchToy(int start, int end) {
        if (start > 0 && start <= LIMIT_OF_PRICE && end > 0 && end <= LIMIT_OF_PRICE) {
            for (Toy toy: toys) {
                if (toy.getPrice() >= start && toy.getPrice() <= end){
                    System.out.println("========SearchToy========\nName - " + toy.getName() + "\tPrice - " + toy.getPrice());
                    return;
                }
            }
            System.out.println("There are not such toys");
            return;
        }
        System.out.println("Price is incorrect");
    }
}
