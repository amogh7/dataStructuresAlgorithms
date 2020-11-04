package practice;

public class DynamicStackArray extends StackUsingArray{
    @Override
    public void push(int val) {
        if(isFull()) {
            int ndata[]=new int[2*data.length];
            for(int i=0;i<data.length;i++){
                ndata[i]=data[i];
            }
            data=ndata;

        }

        super.push(val);
    }
}
