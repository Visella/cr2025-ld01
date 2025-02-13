package exercise;
public class ExtractClass {
// todo extract class TelephoneNumber from class Person
	
	class TelephoneNumber {
        private String officeAreaCode;
        private String officeNumber;

        public String getOfficeAreaCode() {
            return officeAreaCode;
        }

        public void setOfficeAreaCode(String officeAreaCode) {
            this.officeAreaCode = officeAreaCode;
        }

        public String getOfficeNumber() {
            return officeNumber;
        }

        public void setOfficeNumber(String officeNumber) {
            this.officeNumber = officeNumber;
        }

        public String getTelephoneNumber() {
            return "(" + officeAreaCode + ") " + officeNumber;
        }
    }
	
	class Person {
	  private String name;
	  private TelephoneNumber telephoneNumber = new TelephoneNumber();
	  
	  public String getName() {
		return name;
	  }
	  
	  public String getTelephoneNumber() {
          return telephoneNumber.getTelephoneNumber();
      }

      public TelephoneNumber getTelephoneNumberObject() {
          return telephoneNumber;
      }
	  
	}
}
