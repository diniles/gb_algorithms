package seminar4;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("AAAA", 33);
        System.out.println(employee1.hashCode());
        Employee employee2 = new Employee("AAAA", 31);
        System.out.println(employee2.hashCode());

        HashMap<String, String> hashMap = new HashMap<>(4);

        String oldValue;
        oldValue = hashMap.put("+79007774431", "AAAAAAA");
        oldValue = hashMap.put("+79007774432", "BBBBBBB");
        oldValue = hashMap.put("+79007774431", "CCCCCCC1");
        oldValue = hashMap.put("+79007774433", "CCCCCCC2");
        oldValue = hashMap.put("+79007774434", "CCCCCCC3");
        oldValue = hashMap.put("+79007774435", "CCCCCCC4");
        oldValue = hashMap.put("+79007774436", "CCCCCCC5");
        oldValue = hashMap.put("+79007774437", "CCCCCCC6");
        oldValue = hashMap.put("+79007774438", "CCCCCCC7");
        oldValue = hashMap.put("+79007774439", "CCCCCCC8");

        String res = hashMap.get("+79007774435");
        System.out.println(res);
        res = hashMap.get("+79107774435");
        System.out.println(res);

        oldValue = hashMap.remove("+79007774435");
        System.out.println(oldValue);
        oldValue = hashMap.remove("+79007774435");
        System.out.println(oldValue);

        for (HashMap<String, String>.Entity element : hashMap) {
            System.out.println(element.key);
        }
    }
}
