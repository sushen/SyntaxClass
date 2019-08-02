package blog.biswas.video.syntaxclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    Integer monimNumber = 30;
//    Integer xyzNumber = 50;
//    Integer abcNumber = 60;
//
//    ArrayList<Integer> number = new ArrayList<>();


//    Student st1;
//    Student st2;
//    Student st3;
//    ArrayList<Student> students = new ArrayList<>();
//
//    TextView tvs1;
//    TextView tvs2;
//    TextView tvs3;

    Loan monimsLoan;
    Loan tanvirLoan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monimsLoan = new Loan();
        tanvirLoan = new Loan();

        monimsLoan.setLoanAmount(200000);
        tanvirLoan.setLoanAmount(100000);
        monimsLoan.setDipositAmount(15000);

        int dueamount = monimsLoan.getDueAmount();
        System.out.println(dueamount);



        //blog.biswas.video.syntaxclass.Loan Executive

//
//        tvs1 = findViewById(R.id.student1);
//        tvs2 = findViewById(R.id.student2);
//        tvs3 = findViewById(R.id.student3);
//
//        st1 = new Student();
//        st2 = new Student();
//        st3 = new Student();
//
//
//        st1.setStudentId("32");
//        st2.setStudentId("52");
//        st3.setStudentId("72");
//
//        students.add(st1);
//        students.add(st2);
//        students.add(st3);
//
//        Log.i("Student", "onCreat: "+ st1.getStudentId());
//        Log.i("Student", "onCreat: "+ st2.getStudentId());
//        Log.i("Student", "onCreat: "+ st3.getStudentId());
//
//        tvs1.setText(students.get(0).getStudentId());
//        tvs2.setText(students.get(1).getStudentId());
//        tvs3.setText(students.get(2).getStudentId());

//        number.add(monimNumber);
//        number.add(xyzNumber);
//        number.add(abcNumber);

//        System.out.println(number.get(0));
//        System.out.println(number.get(1));
//        System.out.println(number.get(2));





//        //Make a grading Program
//
//        int gread =68;
//
//        if(gread >=80 && gread <=100){
//            System.out.println("Result is a Gread");
//        }else if(gread <80 && gread >=60 ) {
//            System.out.println("Result is B Gread");
//        }else if(gread <60 && gread >=40) {
//            System.out.println("Result is C Gread");
//        }else if(gread <40 && gread >=0){
//            System.out.println("Result is Fail");
//        }else {
//            System.out.println("Result is Not Valid");
//        }


//        int monimsNumber = 110;
//
//        if(monimsNumber >= 50 && monimsNumber <=100){
//            Log.i("result","pass");
//        }else if(monimsNumber >100){
//            Log.i("result","Not Valaid");
//        }else {
//            Log.i("result","fali");
//        }

//        for (int i =0; i<10; i++){
//            Log.i("count", "onCreat:" + i);
//        }
    }
}
