import java.util.Date;

public class Products {
    private String productName;
    private double productPrice;
    private Date manufacturingDate;

    public Products(){
        System.out.println("Default constuctor of Products is called");
        productName="";
        productPrice=0;
        manufacturingDate=new Date();
    }

    public Products(String productName, double productPrice, Date manufacturingDate) {
        System.out.println("Parameterised constuctor of Products is called");
        this.productName = productName;
        this.productPrice = productPrice;
        this.manufacturingDate = manufacturingDate;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }
}








