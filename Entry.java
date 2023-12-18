public class Entry {
    public static void main(String[] args) {
        MyBST m = new MyBST();
        m.setMroot(m.insert(m.getMroot(), 5));
        m.setMroot(m.insert(m.getMroot(), 1));
        m.setMroot(m.insert(m.getMroot(), 6));
        m.setMroot(m.insert(m.getMroot(), 0));
        m.setMroot(m.insert(m.getMroot(), 3));
        m.setMroot(m.insert(m.getMroot(), 7));
        m.setMroot(m.insert(m.getMroot(), 2));
        m.setMroot(m.insert(m.getMroot(), 4));

        System.out.println("Shun");
    }
}
