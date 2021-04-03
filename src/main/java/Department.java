import java.util.List;

public class Department {
    private static long autoId = 1;
    private long id;
    private String name;

    public Department(String name) {
        this.id = autoId++;
        this.name = name;
    }

    /**
     * Метод по получению имени отдела
     * @return - имя отдела
     */
    public String getName() {
        return name;
    }

    /**
     * Метод проверяет есть ли в общем листе отделов конкретного интересуемого отдела. Если этого отдела
     * не существует то добавляем его в лист, иначе передаем.
     * @param departmentList - общий список отделов (лист)
     * @param name - наименование отдела
     * @return - отдел - элемент листа
     */
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
