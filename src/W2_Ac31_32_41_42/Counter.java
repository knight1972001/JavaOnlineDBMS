package W2_Ac31_32_41_42;

public class Counter {
    private int quantity=0;
    private String maker;

    public Counter(int quantity, String maker) {
        this.quantity = quantity;
        this.maker = maker;
    }

    @Override
    public String toString() {
        return "Maker: "+maker +" | Quantity: "+quantity+"\n";
    }
}
