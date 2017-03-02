package demo6;

/**
 * Created by win8 on 2017/2/28.
 */
public class A_B_Hellper {
     SayHello sayHello;

    public A_B_Hellper(SayHello sayHello) {
        this.sayHello = sayHello;
    }

    //    public void setSayHello(SayHello sayHello) {
//        this.sayHello = sayHello;
//    }
    public void printHello(){
        sayHello.printHello();
    }
}
