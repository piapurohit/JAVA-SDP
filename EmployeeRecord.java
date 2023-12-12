 public class EmployeeRecord {
    public static void main(String[] args) {
        // Salaries array
        double[] salaries = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};

        // Calculate average salary
        double averageSalary = calculateAverage(salaries);

        // Count employees with salary greater than and less than average
        int aboveAverageCount = 0;
        int belowAverageCount = 0;

        for (double salary : salaries) {
            if (salary > averageSalary) {
                aboveAverageCount++;
            } else if (salary < averageSalary) {
                belowAverageCount++;
            }
        }

        // Display results
        System.out.println("Average Salary: " + averageSalary);
        System.out.println("Number of employees with salary greater than average: " + aboveAverageCount);
        System.out.println("Number of employees with salary less than average: " + belowAverageCount);
    }

    // Method to calculate average salary
    private static double calculateAverage(double[] salaries) {
        double total = 0;

        for (double salary : salaries) {
            total += salary;
        }

        return total / salaries.length;
    }
}
