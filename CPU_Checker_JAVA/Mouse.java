
public class Mouse {

    String brand;
    int programmable_buttons;
    int price;
    Boolean RGB;
    Boolean Wired;
    double Star_Review;
   

    Mouse(String brand, int programmable_buttons, int price, Boolean RGB, Boolean Wired, double Star_Review){
        this.brand = brand;
        this.programmable_buttons = programmable_buttons;
        this.price = price;
        this.RGB = RGB;
        this.Wired = Wired;
        this.Star_Review = Star_Review;
        
    }

    public void setBrand(String brand){


        if(brand.equals("Logitech") || brand.equals("Razer") || brand.equals("ReDragon") || brand.equals("Apple") ){
        this.brand = brand;
        } else{
            this.brand = "Not a registered brand of a keyboard!";
        }

    }

    public void setProgrammableButtons(int programmable_buttons){
        if (programmable_buttons < 6) {
            this.programmable_buttons = programmable_buttons;
        } else{
         System.out.println("Does that mouse really even exist?");
        }
    }

    public void setStarReview(double Star_Review){
        if(Star_Review <= 5.0){
            this.Star_Review = Star_Review;
        } else{
            System.out.println("Review should not exceed to 5.0");
        }
    }

    
}
