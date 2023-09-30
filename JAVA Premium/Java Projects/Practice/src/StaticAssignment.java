class Account {
    static int rateOfInterest = 5;
    static void setRateOfIntereset(int rate) {
        rateOfInterest = rate;
    }
    String accountNumber;
    void setAccountNumber(String accNum) {
        accountNumber = accNum;
    }
    String customerName;
    void setCustomerName(String custName) {
        customerName = custName;
    }
    double balance;
    void setBalance(double bal) {
        balance = bal;
    }

    double calcSimpleInterest(int time) {
        double si = balance * time * rateOfInterest / 100;
        return si;
    }

}

public class StaticAssignment {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.setBalance(5000);
        double si =  acc1.calcSimpleInterest(5);
        System.out.println(si);
    }
}
