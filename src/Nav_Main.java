public class Nav_Main {
    public static void main(String[] args) {
        Nav navigation = new Nav();
        navigation.insert("www.google.com");
        navigation.insert("www.w3Schools.com");
        navigation.insert("www.netflix.com");

        System.out.println("Forward Navigation: ");
        navigation.forward();
        System.out.println("Backward Navigation: ");
        navigation.backward();

    }
}
