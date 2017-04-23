public class Pet {
    private String name;
    private String owner;
    private int age;

    public Pet(String n, String o, int a) {
        this.name = n;
        this.owner = o;
        this.age = a;
    }

    public void showDetails() {
        System.out.println("I am a pet. My name is " + this.name + ". My owner is " + this.owner);
    }
//    void setAge(int a){
//       this.age=a;
//    }
//    void setOwner(String o){
//        this.owner=o;
//    }
//    void setName(String n){
//        this.name=n;
//    }
    public Pet(String n, String o){
        this(n,o,0);

    }
  
}
