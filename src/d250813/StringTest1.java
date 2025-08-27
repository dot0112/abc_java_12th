package d250813;

public class StringTest1 {

    public static void main(String[] args) {
        String a;
        String b = null;
        String c = "abc";
        String d = "abc";
        String e = d;
        String f = new String("abc");
        String g = new String("abc");

        System.out.println(b);
        System.out.println(c);
        System.out.println(c.length());
        System.out.println(d == e);
        System.out.println(f == g);
        System.out.println(f.equals(g));
        System.out.println(g.equals("ABc"));
        System.out.println(g.equalsIgnoreCase("ABc"));
        System.out.println(g.startsWith("a"));
        System.out.println(g.endsWith("c"));
        g = "Java Programming";
        System.out.println(g.charAt(1));
        System.out.println(g.indexOf('a'));
        System.out.println(g.lastIndexOf('a'));
        System.out.println(g.substring(5));
        System.out.println(g.substring(5, 9));
        System.out.println(g.concat("!!!!"));
        System.out.println(g.toUpperCase());
        System.out.println(g);
    }
}
