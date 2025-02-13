package MapInterface.GroupObjecs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee{
    String name;
    String department;
    Employee(String name, String department){
        this.name = name;
        this.department = department;
    }

    public String toString(){
        return name;
    }
}
public class GroubObjectList {
    public static Map<String, List<Employee>> groupObject(List<Employee> employees){
        Map<String, List<Employee>> map = new HashMap<>();
        for(Employee employee : employees){
            String key = employee.department;
            if(map.containsKey(key)){
                map.get(key).add(employee);
            }
            else{
                List<Employee> list = new ArrayList<>();
                list.add(employee);
                map.put(key, list);
            }

        }
        return map;

    }
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "IT"));
        employees.add(new Employee("Jane", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Mary", "HR"));

        Map<String, List<Employee>> groupMap = groupObject(employees);
        System.out.println(groupMap);
    }
}
