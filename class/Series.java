public interface Series {
    int MAX = 10;
    String ERRORMSG = "Cannot go above " + MAX;
    int getNext();

    default void printStuff(){
        System.out.println("Live from NY");
        printMoreStuff();
    }
    private void printMoreStuff(){
        System.out.println("Print more stuffs");
    }


}
