package exercise;

public class MethodObject {

	class Account {
		private int delta() {
			return 10;
		}
		// TODO: replace this gamma method with method object (make a class for the gamma logic)  
//		public int gamma(int inputVal, int quantity, int yearToDate) {
//			    int importantValue1 = (inputVal * quantity) + delta();
//			    int importantValue2 = (inputVal * yearToDate) + 100;
//			    if ((yearToDate - importantValue1) > 100) {
//			      importantValue2 -= 20;
//			    }
//			    int importantValue3 = importantValue2 * 7;
//			    // and so on�
//			    return importantValue3 - 2 * importantValue1;
//			  }
		public int gamma(int inputVal, int quantity, int yearToDate) {
			return new GammaCalc(this, inputVal, quantity, yearToDate).compute();
		}

	}
	
	class GammaCalc {
		private final Account account;
		private final int inputVal;
		private final int quantity;
		private final int yearToDate;
		private int importantValue1;
		private int importantValue2;
		private int importantValue3;

		public GammaCalc(Account account, int inputVal, int quantity, int yearToDate) {
			this.account = account;
			this.inputVal = inputVal;
			this.quantity = quantity;
			this.yearToDate = yearToDate;
		}

		public int compute() {
			calculateImportantValues();
			applyBusinessLogic();
			return computeFinalValue();
		}

		private void calculateImportantValues() {
			importantValue1 = (inputVal * quantity) + account.delta();
			importantValue2 = (inputVal * yearToDate) + 100;
		}

		private void applyBusinessLogic() {
			if ((yearToDate - importantValue1) > 100) {
				importantValue2 -= 20;
			}
			importantValue3 = importantValue2 * 7;
		}

		private int computeFinalValue() {
			return importantValue3 - 2 * importantValue1;
		}
	}
	
	private void test() {
		Account account = new Account();
		System.out.println(account.gamma(15,10,2010));
		
	}
	public static void main(String[] args) {
		MethodObject p = new MethodObject();
		p.test();
	}

}
