import java.util.Optional;

public class Student {
    private String name;
    private Optional<Address> address;

    public Student(String name, Optional<Address> address) {
        this.name = name;
        this.address = address;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Optional<Address> getAddress() {
        return this.address;
    }
}
