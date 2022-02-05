//This class uses static methods from the UserIdentifier class to ouput the users username and operating system name
public class User {
    public static void main(String[] args) {
	//concatenated strings and the static method
	System.out.println("I am " + UserIdentifier.getUserName() + " on " + UserIdentifier.getOSName());
    }
}
