import java.util.List;

public class Department {
    private static long autoId = 1;
    private long id;
    private String name;

    public Department(String name) {
        this.id = autoId++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Department getDepartment(List<Department> departmentList, String name) {
        for (Department value : departmentList) {
            if (value.getName().equals(name)) {
                return value;
            }
        }
        Department department = new Department(name);
        departmentList.add(department);
        return departmentList.get(departmentList.size()-1);
    }
}
