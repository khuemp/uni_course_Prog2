public class Foo {
    private int a;

    public Foo(int a){
        this.a = a;
    }

    // public boolean equals(Foo b){
    //     return a == b.a;
    // }
    @Override
    public boolean equals(Object b){
        if(!(b instanceof Foo)){
            return false;
        } else {
            return a == ((Foo) b).a;
        }
    }

    public static void main(String[] args){
        Object a = new Foo(1);
        Object b = new Foo(2);
        System.out.println(a.equals(b));
        System.out.println(a.equals(a));
    }
 }
