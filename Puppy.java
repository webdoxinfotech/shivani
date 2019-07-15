public class Puppy {
	int puppyAge;

	public Puppy(String name) {
		System.out.println("Passed Name is " + name);
	}

	public void setAge(int age) {
		puppyAge = age;
	}

	public int getAge() {
		// System.out.println("Puppy's age is " + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
		int myPuppyAge;
		System.out.println("New Line!");
		Puppy myPuppy = new Puppy("tommy");
		myPuppy.setAge(2);
		myPuppyAge = myPuppy.getAge();
		System.out.println("Age is " + myPuppyAge);
		System.out.println("Again Age is " + myPuppy.puppyAge);
	}
}