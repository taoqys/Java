public class Tax {
    public static void main(String[] args) {
        Income[] income = {new SalaryIncome(7000), new Income(3000), new SpecialAllowance(8000), new Royalty(10000)};
        System.out.println(totalTax(income));
    }

    public static double totalTax(Income... income) {
        double total = 0;
        for (Income i : income) {
            total += i.getTax();
        }
        return total;
    }
}

class Income {
    protected int incomes;

    public Income(int income) {
        this.incomes = income;
    }

    public double getTax() {
        return incomes * 0.1;
    }
}

class SalaryIncome extends Income {
    public SalaryIncome(int income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (incomes <= 5000) {
            return 0;
        }
        return (incomes - 5000) * 0.05;
    }
}

class SpecialAllowance extends Income {
    public SpecialAllowance(int income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}

class Royalty extends Income {
    public Royalty(int income) {
        super(income);
    }

    @Override
    public double getTax() {
        return incomes * 0.3;
    }
}
