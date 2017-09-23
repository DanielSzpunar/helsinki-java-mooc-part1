public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    public String toString() {
        return "This card has " + this.balance + " euros.";
    }
    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance -= 2.50;
        }
    }
    public void payGourmet() {
        if (this.balance >= 4.00) {
            this.balance -= 4.00;
        }
    }
    public void loadMoney(double amount) {

        if (amount < 0) {
            this.balance = this.balance;
        }

        else if(amount + this.balance <= 150.00) {
            this.balance += amount;
        }
        else if (amount + this.balance >= 150.00) {
            this.balance = 150.00;
        }
    }
}
