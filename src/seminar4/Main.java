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
    }
}
