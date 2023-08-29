package seminar4;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("AAAA", 33);
        System.out.println(employee1.hashCode());
        Employee employee2 = new Employee("AAAA", 31);
        System.out.println(employee2.hashCode());
    }
}
