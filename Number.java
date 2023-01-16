public class Number {
	public int value;

	public static void main(String[] args) {

		/*
		 * Declares variables of type Number.
		 * 
		 * Allocates only enough memory to hold memory addresses.
		 * 
		 * Variables 'a' and 'b' hold a reference, currently 'null' references.
		 */
		Number a, b;

		/*
		 * 'new' allocates memory space to hold an instance of type 'Number'.
		 * 
		 * The 'new' call also returns the address of that memory location.
		 * 
		 * That memory address (reference) is stored in variable 'a'.
		 * 
		 * So 'a' is not the Object (of type Number), but rather 'a' tells us where the
		 * Object lives in memory.
		 */
		a = new Number();

		/* update the 'value' field in the 'a' Object. */
		a.value = 12;

		/* Allocate memory for another Number Object and store its memory address */
		b = new Number();

		/* update the 'value' field in the 'b' Object. */
		b.value = 10;

		/*
		 * IMPORTANT: The assignment statement below does NOT copy Object 'b' to 'a'.
		 * 
		 * Rather, it assigns the memory address of 'b' as the reference 'a' will now
		 * also point to.
		 * 
		 * After executing the following assignment statement, 'a' and 'b' refer to the
		 * same memory location.
		 */
		a = b;

		/*
		 * The following two lines successively update the 'value' field in the same
		 * Object, i.e. at the same memory location.
		 */
		b.value = 34;

		/*
		 * This updates 'value' in one Object, that both variables 'a' and 'b' refer to.
		 */
		a.value = 20;

		System.out.println("The value of b is: " + b.value);
	}
}
