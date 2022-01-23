public class Pokemon {
    //instance variables
    String name;
    int level;
    //constructor
    Pokemon (){
        this.level = 1;
    }
    Pokemon (String name, int level){
        this.name = name;
        this.level = level;
    }

    void attack (){
        System.out.println(name + " attack");
    }
}
