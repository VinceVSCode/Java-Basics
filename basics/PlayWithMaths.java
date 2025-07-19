public class PlayWithMaths {
    public static void main(String[] args) {

        String gitname = "VinceVsCode";
        String gitsite = "GitHub";
        
        // Print the original strings
        int nameLength = gitname.length();
        int siteLength = gitsite.length();
        // Compare lengths of two strings
        System.out.println(Math.max(nameLength, siteLength));
        System.out.println(Math.pow(siteLength, 2));
        System.out.println(Math.sqrt(nameLength));         // 5.0
        System.out.println(Math.abs(-42));         // 42
        System.out.println(Math.random());         // 0.0 to <1.0
    }
}
