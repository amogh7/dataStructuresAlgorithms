package Hashmap;

import java.util.LinkedList;

public class HashmapLL {
    LinkedList<Entity> list = new LinkedList<>();

    private class Entity {
        String key;
        String value;

        public Entity(String Key, String value) {
            this.value = value;
            this.key = key;
        }
    }
        public void insert(String value, String key) {
            for (Entity e : list) {
                if (e.key.equals(key)) {
                    e.value = value;
                    return;
                }
            }


            list.add(new Entity(key, value));
        }

        public String get(String key) {
            String temp = null;

            for (Entity e : list) {
                if (e.key.equals(key)) {
                    temp=e.value;
                    return temp;
                }
            }
            return temp;
        }
        public String remove(String key){
            Entity target=null;
            for(Entity e:list){
                if(e.key.equals(key)){
                    target=e;
                }

            }
            String temp=target.value;
            list.remove(target);
            return temp;
        }
        @Override
        public String toString() {

            StringBuilder s = new StringBuilder();

            s.append("{");

            for (Entity e:list) {

                s.append(e.key).append(" => ").append(e.value).append(", ");
            }

            s.append("}");

            return s.toString();
        }

}