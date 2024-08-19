package housingportal.entity;

public class Customer {
    private int customerId;
    private String fullName;
    private String contactEmail;

    public Customer(int customerId, String fullName, String contactEmail) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.contactEmail = contactEmail;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    @Override
    public String toString() {
        return "Customer [ID=" + customerId + ", Name=" + fullName + ", Email=" + contactEmail + "]";
    }
}
