package QueueInterface.HospitalTriagalSystem;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueSecondTest {
    @Test
    void testPriorityQueue() {
        Queue<Patients> hospital = new PriorityQueue<>(Comparator.comparingInt(s ->-s.severity));

        hospital.add(new Patients("Bob", 53));
        hospital.add(new Patients("John", 6));
        hospital.add(new Patients("Jane", 97));
        hospital.add(new Patients("Jack", 43));

        assertEquals("Jane", hospital.poll().name);

    }

}