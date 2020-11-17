package oops;

public  class  Human {//objects are made just like humans are born so these states and behaviours can be used after creating instance of classes
//static members can be called by making instances also but it is not good practice
//static can be used in world level gaming events enemy health can be defined using static ,so use of static can be defined according to use case


//    int hands =2;//Initialization should be done using constructor
//    int nose =1;
//    int eyes =2;//states ,these states can be changed using methods
    int hands ;
    int nose;
    int eyes;
    static int balance=999999999;//static can be used without making instance
    String name;


    public Human(){ // default Constructor without parameter same name as class used to initialize has no return type
      this("Naresh"); //constructor chaining can be done at first position only ie is first position by rules
//        this.hands=2;
//        this.nose=1;
//        this.eyes=2;
    }
    public Human(String name){
        //this.name=name;
        this(name,2);
    }
    public Human (String name,int hands){
        this.name=name;
        this.hands=hands;
    }



//    public void eat(){//this is non static ,static takes to class level which makes all instances have same common state or behaviour and changes are also same for that state
//
//    }
public void loan(){//mutating behaviour changes states
    balance =balance-99999999;
    System.out.println("hayye me gareeb ho gye"+balance);
    //fest(); static can be called through normal but normal cant be called through static without making instance
}

    public void hello(int balance){//why this keyword is used
        //balance =balance-balance; //not making sense so this keyword is used
        this.balance =this.balance-balance;//it is for variable in same class for different class super is used
    }
    public static void fest(){
        System.out.println("hurray hurray");
       // loan();//loan can be called by making instance only as it is not static so it will show error
    }
    public void eat(){
        if(balance <10000){
            System.out.println("bhagg ja");
        }
        balance =balance -9999999;
    }

    public Human (Human old){// copy constructor it does not exist as default in java
        this.name=old.name;
        this.nose=old.nose;
    }

}

// class pablo{
//    public static void main(String[] args){//two classes can have main method but public access can not be given two both only one class can be public
//
//    }
//
//}
