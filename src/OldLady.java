/***
 * GRADING COMMENTS:
 *  Excellent effort.   Your code is clean and easy to read and functional.
 *  You got the main concept of nesting the methods such that your
 *  code is almost as efficient as it could be.   You could have gotten 
 *  rid of some more duplication by having a 'System.out.print("There was an old lady");'
 *  method and calling that throughout, but you did very well.
 *  Compiles and runs: 15/15
 *  Desired output: 6/6
 *  Efficiency: 1/2
 *  2/2   24/25 total.
 */
public class OldLady {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("There was an old lady who swallowed a fly.");
		fly();
		System.out.println();
		System.out.println("There was an old lady who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		spider();
		System.out.println();
		System.out.println("There was an old lady who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		bird();
		System.out.println();
		System.out.println("There was an old lady who swallowed a cat,");
		System.out.println("Imagine that to swallow a cat.");
		cat();
		System.out.println();
		System.out.println("There was an old lady who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
		dog();
		System.out.println();
		System.out.println("There was an old lady who swallowed a horse,");
		System.out.println("She died of course.");	
	}
	public static void fly() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
	}
	public static void spider() {
		System.out.println("She swallowed the spider to catch the fly,");
		fly();
	}
	public static void bird() {
		System.out.println("She swallowed the bird to catch the spider,");
		spider();
	}
	public static void cat() {
		System.out.println("She swallowed the cat to catch the bird,");
		bird();
	}
	public static void dog() {
		System.out.println("She swallowed the dog to catch the cat,");
	    cat();
	}
	
}
