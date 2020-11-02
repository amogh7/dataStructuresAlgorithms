package Hashmap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapAL<K,V> {

    class Entity{
        K key;
        V value;

        public Entity(K key,V value){
            this.key=key;
            this.value=value;
        }
    }
    ArrayList<LinkedList<Entity>> list=new ArrayList<>();
    int size;
    float lf=0.5f;
    public HashMapAL() {
        this.size = 0;
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }
    public void put(K key,V value){
        if(((float)(size)/list.size())>lf){
            rehash();
        }
        int idx=Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities=list.get(idx);
        for(Entity e:entities){
            if(e.key.equals(key)){
                e.value=value;
                return;
            }
        }
        this.size++;
        entities.add(new Entity(key,value));
    }
    public void rehash(){
        ArrayList<LinkedList<Entity>> old=list;
        list=new ArrayList<>();
        for(int i=0;i<2*old.size();i++){
            list.add(new LinkedList<>());
        }
        size=0;
        for(LinkedList<Entity> enititylist:old){
            for(Entity e:enititylist){
                put(e.key,e.value);
            }
        }

    }
    public V get(K key){
        int idx=Math.abs(key.hashCode()%list.size());
        for(Entity e:list.get(idx)){
            if(e.key.equals(key)){
                return e.value;
            }
        }
        return null;

    }
    public V remove(K key){
        int idx=Math.abs(key.hashCode()%list.size());
        LinkedList<Entity> entities=list.get(idx);
        Entity target=null;
        for(Entity e:entities) {
            if (e.key.equals(key)){
                target=e;
                size--;


            }
        }
        V temp=target.value;
        entities.remove(target);

        return temp;

    }

}
