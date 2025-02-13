package QueueInterface.HospitalTriagalSystem;

import java.util.Queue;

class Patient implements Comparable<Patient> {
    String name;
    int grade;

    public Patient(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Patient other) {
        // Higher grades have higher priority
        return Integer.compare(other.grade, this.grade);
    }

    @Override
    public String toString() {
        return name + " (" + grade + ")";
    }
}

public class PriorityQueue {
    public static void main(String[] args) {
        // Create a PriorityQueue for Student objects
        Queue<Patient> pq = new java.util.PriorityQueue<>();

        // Add students
        pq.offer(new Patient("Alice", 85));
        pq.offer(new Patient("Bob", 95));
        pq.offer(new Patient("Charlie", 75));

        // Remove and print students in priority order
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}