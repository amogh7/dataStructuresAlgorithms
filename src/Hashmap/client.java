package Hashmap;

public class client {
    public static void main(String[] args) {

        HashMapAL<Character, Integer> map = new HashMapAL<>();

        for (int i = 1; i <12 ; i++) {

            map.put((char)('a'+i),i);
        }

        System.out.println(map.remove((char)('a'+2)));

        for (int i = 1; i <12 ; i++) {
            System.out.println(map.get((char)('a'+i)));
        }

    }
}
