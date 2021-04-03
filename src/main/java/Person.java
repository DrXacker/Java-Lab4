import java.util.Date;

public class Person {
    private static long autoId = 1;
    private long id;
    private String name;
    private String gender;
    private Date birthDate;
    private Department department;
    private long salary;

    public Person(long l, String name, String gender, Date birthDate, Department department, long salary) {
        this.id = autoId++;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
