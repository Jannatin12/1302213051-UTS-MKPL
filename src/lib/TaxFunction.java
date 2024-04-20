package lib;

public class TaxFunction {

	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible,
			boolean isMarried, int numberOfChildren) {

		final int BASIC_DEDUCTIBLE = 54000000;
		final int CHILD_DEDUCTIBLE_PER_CHILD = 1500000;

		int tax = 0;
		int totalIncome = (monthlySalary + otherMonthlyIncome) * numberOfMonthWorking;
		int totalDeductible;

		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}


		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}

		totalDeductible = deductible + BASIC_DEDUCTIBLE;

		if (isMarried) {
			totalDeductible += numberOfChildren * CHILD_DEDUCTIBLE_PER_CHILD;
		}

		tax = (int) Math.round(0.05 * (totalIncome - totalDeductible));

		if (tax < 0) {
			return 0;
		} else {
			return tax;
		}


	}

}
