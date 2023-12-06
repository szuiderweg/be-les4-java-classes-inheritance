public class Main
{

    public static void main(String[] args)
    {
//        CreditCard card1 = new CreditCard(20);
        Customer customer = new Customer("Sophie", "Zuiderweg", new VisaCard(2));//klant met naam en creditcard aanmaken. de creditcard heeft geen eigen naampje, maar is van het type Visacard.
        customer.printName();
        System.out.println(" has debt of " +customer.getCreditCard().getDebt());
        customer.getCreditCard().pay(5800);
        customer.printName();
        System.out.println(" now has a debt of " +customer.getCreditCard().getDebt());

        Customer customer2 = new Customer("Pietje", "de Vries", new MasterCard(3000));
        customer2.printName();
        System.out.println(" has debt of " +customer2.getCreditCard().getDebt());

    }
}
