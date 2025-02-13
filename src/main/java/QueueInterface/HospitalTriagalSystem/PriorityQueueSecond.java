package QueueInterface.HospitalTriagalSystem;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Queue;

class Patients{
    String name;
    int severity;

    Patients(String name, int severity){
        this.name = name;
        this.severity = severity;
    }
    @Override
    public String toString(){
        return name + " (" + severity+")";
    }

}
public class PriorityQueueSecond {
    public static void main(String[] args) {
      Queue<Patients> hospital = new PriorityQueue<>(Comparator.comparingInt(s ->-s.severity));

      hospital.add(new Patients("Bob", 53));
      hospital.add(new Patients("John", 6));
      hospital.add(new Patients("Jane", 97));
      hospital.add(new Patients("Jack", 43));
      while(!hospital.isEmpty()){
          System.out.println(hospital.poll());
      }
    }
}
