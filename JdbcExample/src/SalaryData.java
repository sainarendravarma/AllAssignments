public class SalaryData {
	
    private int year;
    private double amount;

    public SalaryData(int year, double amount) {
        this.year = year;
        this.amount = amount;
    }

    @Override
    public String toString() {
       
    	return "Salary{" +"year=" + year +", amount=" + amount + '}';
    }
}