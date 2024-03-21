public abstract class computer {
    public String name;

    protected String ID;
    float price;
    abstract void showinfo();

    public computer(String name, String ID, float price) {
        this.name = name;
        this.ID = ID;
        this.price = price;
    }

}
