package Heaps;

import java.util.ArrayList;
import java.util.List;

public class Heaps {
    ArrayList<Integer> list;
    public Heaps(){
        list=new ArrayList<>();
    }

    public void insert(int val){
        list.add(val);
        upheap(list.size()-1);
    }

    private void upheap(int index) {
        if(index==0){
            return ;
        }
        int parent=(index-1)/2;//parent function can also be created
        if(list.get(index)<list.get(parent)){
            swap(index,parent);
            upheap(parent);
        }
    }
    public void swap(int first ,int second){
        int temp =list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }
    public int remove(){
        if(list.isEmpty()){
            System.out.println("Khaalo hai bhai");
            return -1;
        }

        int temp=list.get(0);
        list.set(0,list.remove(list.size()-1));
        if(!list.isEmpty()) {
            downheap(0);
        }
        return temp;
    }
    public void downheap(int index){
        int min=index;
        int left=2*index+1;
        if(left<list.size() && list.get(min)>list.get(left) ){
            min=left;
        }
        int right =2*index+2;
        if(right<list.size() && list.get(min)>list.get(right) ){
            min=right;
        }
        if(min!=index){
            swap(min,index);
            downheap(min);
        }


    }
    public void display(){
        System.out.println(list);
}

}

