
public class Movies {

    private String name;
    private double ticketPrice;
    private double budget;

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setTicketPrice(double ticketPrice) {
        if (ticketPrice > 0) {
            this.ticketPrice = ticketPrice;
        }
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setBudget(double budget) {
        if (budget > 0) {
            this.budget = budget;
        }
    }

    public double getBudget() {
        return budget;
    }

    public double income(double[] numberOfVisitors, double ticketPrice) {
        return 0;
    }

    public boolean pechalba(double income, double budget) {
        if (income - budget > 0) {
            return true;
        }
    }

    public Movies(String name, double ticketPrice, double budget) {
        setName(name);
        setTicketPrice(ticketPrice);
        setBudget(budget);
    }

    public Movies() {
        this("Ivan Geshev", 8.76, 10000000);
}
public void Movies(Movies obj3) {

    }

    public String toString() {
        return String.format("Име на посетителя: %s, Цена на билета му: %f", getName(), getTicketPrice());
    }
}
