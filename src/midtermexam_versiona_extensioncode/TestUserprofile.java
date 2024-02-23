/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author 91690
 */
public class TestUserprofile {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tushar Yadav:");
        String name = scanner.nextLine();

        System.out.println("Chris Evans:");
        String favoriteActor = scanner.nextLine();

        System.out.println("User profile for " + name + " with favorite actor " + favoriteActor + " was created.");
    }
}
