public class Rottweiler extends Dog{
    private int catsEaten;

    public Rottweiler(String n, String o, int a, int m, int c){
        super(n,o,a,m);
        this.catsEaten=c;
    }
    public Rottweiler(String n, String o){
        super(n,o,0,1);
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("I am a Rottweiler. I have eaten "+catsEaten+" cats.");
    }
}
