public class VisaCard extends CreditCard
{
    public VisaCard(int debt)
    {
        super(debt);
    }

    //override normal behaviour of .pay with a discount for visacards
    @Override//a Visacard behaves slightly different compared to the basic method.
    public void pay(int amount)
    {
        amount = (int) Math.round(0.9*amount);//calculate discounted amount and round to an integer value.
        super.pay(amount);
    }

}
