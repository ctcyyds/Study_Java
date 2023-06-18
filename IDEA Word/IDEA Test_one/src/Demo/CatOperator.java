package Demo;
/*操作类*/
public class CatOperator {
    //类名作为形参，实际上要的是该类的对象
    public void useCat(Cat c){
        c.eat();
    }
    //类名作为返回值
    public Cat getCat(){
        Cat c=new Cat();
        return c;
    }
}
