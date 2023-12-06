public class Customer
{
     String name;
     String lastName;
     int customerNumber;
     private CreditCard creditCard;

//     public Customer(){} //empty constructor
     // CONSTRUCTORS
     public Customer(String name, String lastName, CreditCard creditCard)//constructor 3 param.
     {
        this.name = name;
        this.lastName = lastName;
        this.creditCard = creditCard;
     }

     public Customer(String name, String lastName, int customerNumber,CreditCard creditCard)//constructor 4 param.
     {
          this.name = name;
          this.lastName = lastName;
          this.customerNumber = customerNumber;
          this.creditCard = creditCard;
     }
     //Creditcard property getter and setter
     public CreditCard getCreditCard()
     {
          return this.creditCard;
     }

     public void setCreditCard(CreditCard creditCard)
     {
          this.creditCard = creditCard;
     }

     //PRINT METHOD
     public void printName()
     {
          System.out.print("Customer " + name);
     }
}
