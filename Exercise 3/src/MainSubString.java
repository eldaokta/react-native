public class MainSubString {
    public static void main(String[] args) {
        String name = "Elda Oktaviani";
        String name1 = "   makan ikan lele   ";

        String [] names = name.split(" ");
        String lastName = name.substring(2,4);
        System.out.println(lastName);
        System.out.println(name);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(name1.trim());
    }
}
