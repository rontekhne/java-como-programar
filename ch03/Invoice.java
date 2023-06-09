/* ex. 3.12: Invoice.java
 * representa fatura de item vendido na loja de informatica */

public class Invoice
{
    private String number;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String number, String description, int quantity, double price)
    {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public void setNumber(String number) 
    { 
        this.number = number; 
    }
    
    public String getNumber() 
    { 
        return number; 
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public double getInvoiceAmount(int quantity, double price)
    {
        if (quantity < 0) {
            this.quantity = 0;
        }
        if (price < 0.0) {
            this.price = 0.0;
        }
        return quantity * price;
    }
}
