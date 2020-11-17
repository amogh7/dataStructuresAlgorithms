package practice;

public class MyArrayList {
    int [] data;
    int size;
    public MyArrayList(){
        size=0;
        data=new int[10];
    }
    public void push(int val){
        if(isFull()){
            resize();
            return;
        }
        data[size++]=val;


    }

    private void resize() {
        int [] ndata=new int[data.length*2];
        for(int i=0;i<data.length;i++){
            ndata[i]=data[i];
        }
        data=ndata;
    }

    public boolean isFull(){
        return this.size==data.length;
    }

    public int removeLast(){
      if(isEmpty()){
          System.out.println("khaali hai bhai");
          return -1;
      }

      return data[--size];
    }
    public boolean isEmpty(){
        return this.size==0;
    }
}
