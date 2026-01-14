package lab4;

public class SalePerson implements Comparable<Object> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String toString() {
        return lastName + ", " + firstName + " : " + totalSales;
    }

    public boolean equals(Object o) {
        SalePerson other = (SalePerson) o;
        return (firstName.equals(other.firstName) && lastName.equals(other.lastName));
    }

    public int compareTo(Object o) {
        SalePerson other = (SalePerson) o;
        int diff = totalSales - other.totalSales;
        if (diff != 0) return diff;
        return -lastName.compareTo(other.lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }
}
