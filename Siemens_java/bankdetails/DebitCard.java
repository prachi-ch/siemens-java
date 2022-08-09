package bankdetails;

public class DebitCard extends BankDetails {
    private String DebitCardNumber;
    private String DebitCardExpiry;

    public DebitCard(String AccountHolderName, int AccountHolderAge, String AccountNumber, String AccountBranch,String DebitCardNumber, String DebitCardExpiry) {
       super(AccountHolderName, AccountHolderAge, AccountNumber, AccountBranch);
        this.DebitCardNumber = DebitCardNumber;
        this.DebitCardExpiry = DebitCardExpiry;
    }

    public String getDebitCardNumber() {
        return this.DebitCardNumber;
    }

    public void setDebitCardNumber(String DebitCardNumber) {
        this.DebitCardNumber = DebitCardNumber;
    }

    public String getDebitCardExpiry() {
        return this.DebitCardExpiry;
    }

    public void setDebitCardExpiry(String DebitCardExpiry) {
        this.DebitCardExpiry = DebitCardExpiry;
    }

    @Override
    public String toString() {
        return "{" +
            " DebitCardNumber='" + getDebitCardNumber() + "'" +
            ", DebitCardExpiry='" + getDebitCardExpiry() + "'" +
            "}";
    }
    
    
}
