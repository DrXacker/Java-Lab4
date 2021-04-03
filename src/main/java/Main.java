import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFilePath = "src\\main\\resources\\foreign_names.csv";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFilePath));
            List<Person> personList = new ArrayList<>();
            List<Department> departmentList = new ArrayList<>();
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(";");
                String[] birthDate = values[3].split("\\.");
                Person person = new Person(
                        Long.parseLong(values[0]),
                        values[1],
                        values[2],
                        values[3],
                        Department.getDepartment(departmentList, values[4]),
                        Long.parseLong(values[5])
                );
                personList.add(person);
            }
            for (Person person : personList) {
                System.out.println(person.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
