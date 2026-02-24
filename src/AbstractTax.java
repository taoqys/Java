public class AbstractTax {
    public static void main(String[] args) {
        IndvidualIncome[] incomes = {new Salary(10000)};
        System.out.println(totalTax(incomes));
    }

    public static double totalTax(IndvidualIncome... income) {
        double total = 0;
        for (IndvidualIncome i : income) {
            total += i.getTax();
        }
        return total;
    }
}

abstract class IndvidualIncome {
    public int income;

    public IndvidualIncome(int incomes) {
        this.income = incomes;
    }

    public abstract double getTax();
}

class Salary extends IndvidualIncome {
    public Salary(int income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income-5000) * 0.1;
    }
}