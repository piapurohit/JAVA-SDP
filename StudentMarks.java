public class StudentMarks {
    // Array to store marks
    private int[] marks = new int[5];

    // Method to store marks in the array
    public void storeMarks(int[] subjectMarks) {
        if (subjectMarks.length == marks.length) {
            // Copy subject marks to the marks array
            System.arraycopy(subjectMarks, 0, marks, 0, marks.length);
            System.out.println("Marks stored successfully.");
        } else {
            System.out.println("Invalid number of subjects. Please provide marks for 5 subjects.");
        }
    }

    // Method to display marks from the array using an enhanced for loop
    public void displayMarks() {
        System.out.println("Marks for 5 subjects:");
        for (int mark : marks) {
            System.out.println(mark);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the StudentMarks class
        StudentMarks student = new StudentMarks();

        // Sample marks for 5 subjects
        int[] subjectMarks = {90, 85, 75, 92, 88};

        // Store marks and display them
        student.storeMarks(subjectMarks);
        student.displayMarks();
    }
}

