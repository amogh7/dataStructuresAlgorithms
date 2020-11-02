package oops;

public class Games {
   // final int playerid;
    String playerName;
    int level;
    int exp;
    static int weenemyhealth=99999999;
    String gamename;
    public Games(String gaamename){//,int playerid, String playerName, int level) {
//        this.playerid = playerid;
//        this.playerName = playerName;
//        this.level = level;
        this.gamename=gaamename;
    }

 public void shoot(){
        System.out.println("shoot");
 }
 public void levelcheck(){
        if(exp>1000){
            levelup();
            return;
        }
        System.out.println("abhi nhi hua");
 }

    private void levelup() {
        System.out.println("bad gya finally");
    }
    public static void worldEvent(){

    }

    public void revive(){
        System.out.println(" revive de bhai");
 }
}
