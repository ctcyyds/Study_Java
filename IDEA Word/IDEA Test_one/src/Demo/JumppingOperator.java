package Demo;

public class JumppingOperator {
    public void useJumpping(Jumpping j){//Jummping j=new Fish();
        j.jump();
    }
    public Jumpping getJummping(){
        //返回的是实现类对象
        Jumpping j=new Fish();
        return j;
    }
}
