package chapter8.section13;


import static net.mindview.util.Print.print;

/**
 * Description: 资源清理
 * CreateTime: 2017/12/2 15:46
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class ReferenceCounting {

    public static void main(String[] args) {

        Shared shared = new Shared();
        Composing[] composing = {new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared)};
        for (Composing c : composing) {
            c.dispose();
            new Composing(new Shared());
            System.gc();
        }
    }

    @Override
    protected void finalize() {
        print("ReferenceCounting Finalize");
    }
}

class Composing {

    private Shared shared;
    private static int counter = 0;
    private int id = counter++;

    public Composing(Shared shared) {
        print("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        print("disposing " + this);
        shared.dispose();
    }

    @Override
    protected void finalize() {
        print("Composing Finalize " + id);
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}

class Shared {

    private int refcount = 0;
    private static int counter = 0;
    private int id = counter++;

    public Shared() {
        print("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            print("Disposing " + this);
        }
    }

    @Override
    protected void finalize() {
        print("Shared Finalize " + id);
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}