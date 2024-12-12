
import java.util.Scanner;


public class PatientSystem <E> {

    public void callPatient (LinkedQueue q){
      if (q.isEmpty()) return  ; 
      
      int n =q.size();
  
      for (int i = 0; i <n; i++) {
      System.out.println(q.first() +"the first Patient is :" );
      
      q.dequeue();
      
      }
    }
    public void addPatient( LinkedQueue q, int x ){
        if (q.isEmpty()) return ;

        LinkedQueue q1 = new LinkedQueue();

        int n = q.size();

        for (int i = 0; i <n; i++) {
        
            int num = (Integer) q.dequeue();
            if (x == num ){
       System.out.println("patient has been added successfully");
         } else{
            q.enqueue(num);
                System.out.println("patient has been added successfully");
              
                q1.enqueue(x);
            }
            while(!q.isEmpty()){
                q.enqueue(q1.dequeue());
            }
}
    }


  





    public static void main(String[] args) throws Exception {

        PatientSystem pa = new PatientSystem();
        int choice;
        Scanner input = new Scanner(System.in);
        patient p;
        LinkedQueue <E> q = new Linkedqueue ();

        q.enqueue(new patient("noa" , 33));
        q.enqueue( new patient("nra" , 233));
        q.enqueue( new patient("ora" , 2233));
        do {

            System.out.println("\nPlease enter your choice:");
            System.out.println("1- call the first patient");
            System.out.println("2- add a new patient");
            System.out.println("3- Exit");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                callPatient(q) ;
               System.out.println(  p.toString());
                    break;

                case 2:
            pa. addPatient(q , 2233);
                    break;
            }

        } while (choice != 3);
    }

}
