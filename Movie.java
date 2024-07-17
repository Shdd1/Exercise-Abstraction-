public class Movie extends Product{
    private String director;
    public Movie(){

    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Method
    @Override
    public double getDiscount() {
        double dis= getPrice()*0.1;
        return getPrice()-dis;

    }
}
