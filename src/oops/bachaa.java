package oops;

public class bachaa {
    public static void main(String[] args) {
//        Human  h=null;
//        System.out.println(h.balance);//if balance is static h.balance will still be 99999999 and if balance was not static null pointer exception will be there
   Human ankur =new Human("Ankur");
   Human h1 =ankur;//Shallow copy same object and deep copy different objects same value like creating two arrays and one of the arrays having copied same values
//        Human nishant =new Human();
//        System.out.println(nishant.name);
//        nishant.name="nishant";
//        nishant.loan();
//        Human ankur =new Human();
//        ankur.name="iron man";
//        System.out.println(ankur.balance);//when it is not static it ha its own balance so balance starts from 999999999 if balance was static then balance will be shown deducted to 900000000
//        Human.fest();
  }
}
