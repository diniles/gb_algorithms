package seminar4;

import java.util.Map;

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

        for (Map.Entry<String, String> entry : hashMap) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
