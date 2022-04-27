class Main {

    public static void main(String[] args) {

    double Price = 4.95;
    double itemTax = Price * .05;
    double totalCost = Price + itemTax;

        System.out.println("The item costs:" + Price);
        System.out.println("The sales tax on the item is: " + itemTax);
        System.out.println("The total cost of this item including sales tax is: " + totalCost);

    }
}
