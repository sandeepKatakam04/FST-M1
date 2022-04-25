package activities;

abstract class Book {

    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }

}
class MyBook extends Book{

    void setTitle(String s) {

        title = s;

    }
}
public class Activity5{
    public static void main(String[] args){
        String title = "Wings of Fire";

        Book newNovel = new MyBook();
        newNovel.setTitle(title);
        System.out.println("The title of the book is : "+newNovel.getTitle());
    }

}
