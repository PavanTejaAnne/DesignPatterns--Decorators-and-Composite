//Split as a new class
import java.util.ArrayList;
public class PremiumToppingsDecorator extends BurgerDecorator
{  
    private ArrayList<String> premiumToppingsList;
    private double price;
public PremiumToppingsDecorator(Burger burger,ArrayList<String> PremiumToppingsList)
{
    super(burger);
    premiumToppingsList=PremiumToppingsList;
}

public double calculatePrice()
{
    price=super.calculatePrice();
    for(int i=0;i<premiumToppingsList.size();i++)
    {
        if(premiumToppingsList.get(i)=="Marinated Tomatoes")
        {
         price=price +2.00;   //added the if statement
 
        }
    }
    price=price+((premiumToppingsList.size())*1);//changed price value
     
    return price;
}
}