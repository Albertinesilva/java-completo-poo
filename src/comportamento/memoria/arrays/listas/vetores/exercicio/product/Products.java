package comportamento.memoria.arrays.listas.vetores.exercicio.product;

public class Products {
    
    private String name;
    private double price;

    public Products(){
    }

    public Products(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }   

    public void setPrice(double price) {
        this.price = price;
    }

}
