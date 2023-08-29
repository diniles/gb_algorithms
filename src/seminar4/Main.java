package seminar4;


public class Main {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(4);

        hashMap.put("+79007774431", "AAAAAAA");
        hashMap.put("+79007774432", "BBBBBBB");
        hashMap.put("+79007774433", "CCCCCCC1");
        hashMap.put("+79007774434", "CCCCCCC2");
        hashMap.put("+79007774435", "CCCCCCC3");
        hashMap.put("+79007774436", "CCCCCCC4");
        hashMap.put("+79007774437", "CCCCCCC5");
        hashMap.put("+79007774438", "CCCCCCC6");
        hashMap.put("+79007774439", "CCCCCCC7");
        hashMap.put("+79007774440", "CCCCCCC8");

        for (HashMap<String, String>.Entity element : hashMap) {
            System.out.printf("%s - %s\n", element.key, element.value);
        }

        System.out.println();

        System.out.println(hashMap);

//        Employee employee1 = new Employee("AAAA", 33);
//        System.out.println(employee1.hashCode());
//        Employee employee2 = new Employee("AAAA", 41);
//        System.out.println(employee2.hashCode());
//
//
//        HashMap<String, String> hashMap1 = new HashMap<>(4);
//
//        String oldValue;
//        oldValue = hashMap1.put("+79007774431", "AAAAAAA");
//        oldValue = hashMap1.put("+79007774432", "BBBBB");
//        oldValue = hashMap1.put("+79007774431", "CCCCCCC1");
//        oldValue = hashMap1.put("+79007774433", "CCCCCCC2");
//        oldValue = hashMap1.put("+79007774434", "CCCCCCC3");
//        oldValue = hashMap1.put("+79007774435", "CCCCCCC4");
//        oldValue = hashMap1.put("+79007774436", "CCCCCCC5");
//        oldValue = hashMap1.put("+79007774437", "CCCCCCC6");
//        oldValue = hashMap1.put("+79007774438", "CCCCCCC7");
//        oldValue = hashMap1.put("+79007774439", "CCCCCCC8");
//
//
//        String res = hashMap1.get("+79007774435");
//        res = hashMap1.get("+79107774435");
//
//        oldValue = hashMap1.remove("+79007774435");
//        oldValue = hashMap1.remove("+79007774435");


    }
}
