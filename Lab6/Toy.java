public abstract class Toy {

    private String name;
    private int price;
    public Toy(String name, int price) {
        if (name == null || name == "") {
            System.out.println("You didn't type name");
            System.exit(1);
        }
        if (price <= 0) {
            System.out.println("You typed incorrect price");
        }
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;
    }
}
