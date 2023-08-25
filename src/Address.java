public class Address {
    private String city;
    private String region;

    public Address(String city, String region) {
        this.city = city;
        this.region = region;
    }

    public String getCity() {
        return this.city;
    }

    public String getRegion() {
        return this.region;
    }
}
