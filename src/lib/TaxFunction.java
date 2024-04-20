package lib;

public class TaxFunction {

	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible,
			boolean isMarried, int numberOfChildren) {

		int tax = 0;
		int totalIncome = (monthlySalary + otherMonthlyIncome) * numberOfMonthWorking;
		int totalDeductible;

		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}


		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}


		if (isMarried) {
			totalDeductible = deductible + 58500000 + (numberOfChildren * 1500000);
		} else {
			totalDeductible = deductible + 54000000;
		}

		tax = (int) Math.round(0.05 * (totalIncome - totalDeductible));

		if (tax < 0) {
			return 0;
		} else {
			return tax;
		}


	}

}
