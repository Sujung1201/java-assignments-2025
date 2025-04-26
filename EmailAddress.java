public class EmailAddress {
    private String localPart;
    private String domain;

    public EmailAddress(String localPart, String domain) {
        this.localPart = localPart;
        this.domain = domain;
    }

    public EmailAddress() {
        this("johndoe", "website.cxx");
    }

    @Override
    public String toString() {
        return localPart + "@" + domain;
    }

    public String toAntiSpamString() {
        String[] parts = domain.split("\\.");
        return localPart + " at " + parts[0] + " dot " + parts[1];
    }

    public String getLocalPart() {
        return localPart;
    }

    public String getDomain() {
        return domain;
    }

    public void setLocalPart(String localPart) {
        this.localPart = localPart;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
