package lab6;

public class Test {

	public static void main (String[] args) {
        char[] c = {'Z','e','T','s','u','B','o'};
        MyString1 s = new MyString1(c);
        
        System.out.print("Verify contents: ");
        s.print();
        System.out.print("\n\n");
        
        // indexing
        System.out.print("MyString1.charAt(int index): ");
        System.out.println(s.charAt(3));
        
        // string length
        System.out.print("MyString1.length(): ");
        System.out.println(s.length());
        
        // substring
        System.out.print("MyString1.substring(int begin, int end): ");
        s.substring(2,5).print();
        System.out.print("\n");
        
        // to lower case
        System.out.print("MyString1.toLowerCase(): ");
        s.toLowerCase().print();
        System.out.print("\n");
        
        // equals
        char[] c2 = {'Z','e','t','s','u','b','o'};
        MyString1 s2 = new MyString1(c2);
        char[] c3 = {'Z','e','T','s','u'};
        MyString1 s3 = new MyString1(c3);
        System.out.println("MyString1.equals(): ");
        
        // this is why you use built-ins. When you start
        // re-implementing things, the normal methods don't work with
        // them. At least they could be made to work in a duck-typed
        // language...
        System.out.print("    ");
        s.print();
        System.out.print(" == ");
        s.print();
        System.out.print(" ? ");
        System.out.println(s.equals(s));
        System.out.print("    ");
        s.print();
        System.out.print(" == ");
        s2.print();
        System.out.print(" ? ");
        System.out.println(s.equals(s2));
        System.out.print("    ");
        s.print();
        System.out.print(" == ");
        s3.print();
        System.out.print(" ? ");
        System.out.print(s.equals(s3));
        System.out.print("\n");
        
        // convert Integer to MyString1
        MyString1.valueOf(34).print();
        System.out.print("\n");
        
        String[] str = MyString1.split("ZeTsuBo", "T");
        for(int i = 0; i < str.length; i++) {
        	System.out.println(str[i]);
        }
    }
}

