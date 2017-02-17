

/**
 * Created by ernestine on 2/16/2017.
 */
public class Car {
    //these are my instance variables
    private String make;
    private String model;
    private int year;
    private int price;


    public Car() {
        make = "";
        model = "";
        year = 0;
        price = 0;

    }

    //"all-arguments"constructor
  public Car(String make, String model, int year,
               int price) {
        //taking arguments
        //storing their valued in the instance variables/because
        // the local variables/arguments will ren out of scope
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;

    }



 /*   public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


    public int getPrice() {
        return price;
    }*/




 /*  public void setMake(String make) {this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

   public void setYear(int year) {
        this.year = year;
    }

   public void setPrice(int price) {
        this.price = price;
    }/*/



    @Override
    public String toString() {
        return make + "\t" +
                model + "\t" +
                year + "\t" +
                "$" + price;
    }
}
