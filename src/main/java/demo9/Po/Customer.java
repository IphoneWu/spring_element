package demo9.Po;

/**
 * Created by win8 on 2017/3/4.
 */
public class Customer {
    private String name;
    private String url;

    public void setName(String name) {
        this.name = name;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void printName(){
        System.out.println(this.name);
    }
    public void printUrl(){
        System.out.println(this.url);
    }
    public void printThrowException(){
        throw new IllegalArgumentException();
    }
}
