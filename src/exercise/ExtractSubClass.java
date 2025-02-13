package exercise;
public class ExtractSubClass {
// todo: extract subclass PartsItem & LaborItem from JobItem
//	class JobItem {
//	  private int quantity;
//	  private int unitPrice;
//	  private Employee employee;
//	  private boolean isLabor;
//
//	  public JobItem(int quantity, int unitPrice, boolean isLabor, Employee employee) {
//		this.quantity = quantity;
//		this.unitPrice = unitPrice;
//		this.isLabor = isLabor;
//		this.employee = employee;
//	  }
//	  public int getTotalPrice() {
//		return quantity * getUnitPrice();
//	  }
//	  public int getQuantity() {
//		return quantity;
//	  }
//	  public int getUnitPrice() {
//		return (isLabor) ? employee.getRate() : unitPrice;
//	  }
//	  public Employee getEmployee() {
//		return employee;
//	  }
//	}

	abstract class JobItem {
	    private int quantity;
	    private int unitPrice;

	    protected JobItem(int quantity, int unitPrice, boolean isLabor) {
	        this.quantity = quantity;
	        this.unitPrice = unitPrice;
	    }

	    public int getTotalPrice() {
	        return quantity * getUnitPrice();
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public int getUnitPrice() {
	        return unitPrice;
	    }
	}

	class PartsItem extends JobItem {
	    public PartsItem(int quantity, int unitPrice) {
	        super(quantity, unitPrice, false);  
	    }

	    @Override
	    public int getUnitPrice() {
	        return super.getUnitPrice();
	    }
	}

	class LaborItem extends JobItem {
	    private Employee employee;

	    public LaborItem(int quantity, Employee employee) {
	        super(quantity, 0, true); 
	        this.employee = employee;
	    }

	    @Override
	    public int getUnitPrice() {
	        return employee.getRate();
	    }

	    public Employee getEmployee() {
	        return employee;
	    }
	}

	
	class Employee {
	  private int rate;
	  public Employee(int rate) {
		this.rate = rate;
	  }
	  public int getRate() {
		return rate;
	  }
	}
//	public void action() {
//		Employee kent = new Employee(50);
//		JobItem j1 = new JobItem(5, 0, true, kent);
//		JobItem j2 = new JobItem(15, 10, false, null);
//		int total = j1.getTotalPrice() + j2.getTotalPrice();
//		System.out.println(total);
//	}
	
	public void action() {
	    Employee kent = new Employee(50);
	    LaborItem j1 = new LaborItem(5, kent);
	    PartsItem j2 = new PartsItem(15, 10);
	    int total = j1.getTotalPrice() + j2.getTotalPrice();
	    System.out.println(total);
	}

	public static void main(String[] args) {
		new ExtractSubClass().action();
	}
}
