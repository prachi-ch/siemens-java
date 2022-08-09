package bankdetails;

public class BankDetails {
    private String accountHolderName;
    private int accountHolderAge;
    private String accountNumber;
    private String accountBranch;




    public BankDetails(String AccountHolderName, int AccountHolderAge, String AccountNumber, String AccountBranch) {
        this.accountHolderName = AccountHolderName;
        this.accountHolderAge = AccountHolderAge;
        this.accountNumber = AccountNumber;
        this.accountBranch = AccountBranch;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public void setAccountHolderName(String AccountHolderName) {
        this.accountHolderName = AccountHolderName;
    }

    public int getAccountHolderAge() {
        return this.accountHolderAge;
    }

    public void setAccountHolderAge(int AccountHolderAge) {
        this.accountHolderAge = AccountHolderAge;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String AccountNumber) {
        this.accountNumber = AccountNumber;
    }

    public String getAccountBranch() {
        return this.accountBranch;
    }

    public void setAccountBranch(String AccountBranch) {
        this.accountBranch = AccountBranch;
    }

    @Override
    public String toString() {
        return "{" +
            " AccountHolderName='" + getAccountHolderName() + "'" +
            ", AccountHolderAge='" + getAccountHolderAge() + "'" +
            ", AccountNumber='" + getAccountNumber() + "'" +
            ", AccountBranch='" + getAccountBranch() + "'" +
            "}";
    }
}
