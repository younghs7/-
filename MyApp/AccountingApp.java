
public class AccountingApp {

	public static void main(String[] args) {
		
		double ValueOfSupply = Double.parseDouble(args[0]);
		double VatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = ValueOfSupply*VatRate;
		double total = ValueOfSupply + VAT;
		double expense = ValueOfSupply*expenseRate;
		double income = ValueOfSupply - expense;
		double dividend1 = income*0.5;
		double dividend2 = income*0.3;
		double dividend3 = income*0.2;
		
		System.out.println("Value of supply: "+ValueOfSupply);
		System.out.println("VAT:"+ VAT);
		System.out.println("Total:"+ total);
		System.out.println("Expense:"+expense);
		System.out.println("Income:"+income);
		System.out.println("Dividend 1:"+dividend1);
		System.out.println("Dividend 2:"+dividend2);
		System.out.println("Dividend 3:"+dividend3);

	}

}
