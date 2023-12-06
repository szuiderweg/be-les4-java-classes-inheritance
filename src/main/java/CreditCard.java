abstract class CreditCard
{
    private int debt;

    public CreditCard(int debt)//creditcard constructor
    {
        this.debt = debt;
    }

    //Getter and setter of debt property
    public int getDebt()//get debt of this creditcard
    {
      return this.debt;
    }

    public void setDebt(int debt)////set debt of creditcard
    {
        this.debt = debt;
    }

    public void pay(int amount)
    {
        this.debt+= amount;//perform payment (which means: add amount to debt)
    }

}
