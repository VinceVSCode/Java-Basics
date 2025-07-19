public class PlayWithStrings {
    public static void main (String[] args) {
        // Our first string
        String gitname =  "VinceVsCode";

        // Print the string
        System.out.println(gitname.length());
        System.out.println(gitname.toUpperCase());
        System.out.println(gitname.toLowerCase());
        System.out.println(gitname.charAt(6));
        System.out.println(gitname.indexOf("Vs"));
        System.out.println(gitname.substring(0, 5));
    }
}
