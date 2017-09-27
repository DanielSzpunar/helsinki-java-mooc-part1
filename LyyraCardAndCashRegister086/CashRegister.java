public class CashRegister {
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000.00;
    }
    public double payEconomical(double cashGiven) {
        double economicalLunch = 2.50;

        if (cashGiven >= economicalLunch) {
            this.cashInRegister += 2.50;
            this.economicalSold++;
            return cashGiven - economicalLunch;
        }
        else return cashGiven;
    }
    public double payGourmet(double cashGiven) {
        double gourmetLunch = 4.00;
        if (cashGiven >= gourmetLunch) {
            this.cashInRegister += 4.00;
            this.gourmetSold++;
            return cashGiven - gourmetLunch;
        }
        else return cashGiven;
    }
    public String toString() {
        return "money in register " + this.cashInRegister + " economical lunches sold: " + this.economicalSold + " gourmet lunches sold: " + this.gourmetSold;
    }
    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= 2.50) {
            this.economicalSold++;
            return true;
        }
        else return false;
    }
    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= 4.00) {
            this.gourmetSold++;
            return true;
        }
        else return false;
    }

}
