package com.vishnu.dbms_databasemangmentsystem.Quiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.vishnu.dbms_databasemangmentsystem.R;

import java.util.ArrayList;
import java.util.List;

public class Danger extends AppCompatActivity implements View.OnClickListener{

    TextView question,qCount,timer;
    Button option1,option2,option3,option4;
    List<Question> questionList;
    CountDownTimer countDown;
    int quesNum;
    int score;
    FirebaseFirestore firestore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danger);
        question=findViewById(R.id.question);
        qCount=findViewById(R.id.ques_num);
        timer=findViewById(R.id.timer);

        option1=findViewById(R.id.option1);
        option2=findViewById(R.id.option2);
        option3=findViewById(R.id.option3);
        option4=findViewById(R.id.option4);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);
        firestore=FirebaseFirestore.getInstance();



        getQuestionList();
        score=0;
    }
    private void getQuestionList()
    {
        questionList = new ArrayList<>();

        try {
            firestore.collection("QUIZ").document("Danger").collection("SET1")
                    .get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                @Override
                public void onComplete(@NonNull Task<QuerySnapshot> task) {
                    if (task.isSuccessful()) {
                        QuerySnapshot questions = task.getResult();

                        for (QueryDocumentSnapshot doc : questions) {
                            Log.d("Error", questions.toString());
                            questionList.add(new Question(doc.getString("QUESTION"),
                                    doc.getString("A"),
                                    doc.getString("B"),
                                    doc.getString("C"),
                                    doc.getString("D"),
                                    Integer.valueOf(doc.getString("ANSWER"))
                            ));
                        }
                        setQuestion();
                    } else {
                        Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        } catch (Exception e) {
            Log.d("Error", e.toString());
        }
    }
//        questionList.add(new Question("Question1","A","B","c","D",2));
//        questionList.add(new Question("Question2","G","T","Q","B",2));
//        questionList.add(new Question("Question3","A","M","F","X",2));
//        questionList.add(new Question("Question4","N","B","K","D",2));
//        questionList.add(new Question("Question5","A","W","C","P",2));
//
//        setQuestion();
//    }


    private void setQuestion()
    {
        timer.setText(String.valueOf(10));

        question.setText(questionList.get(0).getQuestion());
        option1.setText(questionList.get(0).getOptionA());
        option2.setText(questionList.get(0).getOptionB());
        option3.setText(questionList.get(0).getOptionC());
        option4.setText(questionList.get(0).getOptionD());

        qCount.setText(String.valueOf(1)+"/"+String.valueOf(questionList.size()));
        startTimer();
        quesNum=0;
    }

    private void startTimer()
    {
        countDown=new CountDownTimer(11000,1000) {
            @Override
            public void onTick(long l) {
                if(l < 10000){
                    timer.setText(String.valueOf(l/1000));}
            }
            @Override
            public void onFinish() {
                changeQuestion();
            }
        };
        countDown.start();
    }

    @Override
    public void onClick(View view) {
        int selectOption=0;
        switch (view.getId())
        {
            case R.id.option1:
                selectOption=1;
                break;

            case R.id.option2:
                selectOption=2;
                break;

            case R.id.option3:
                selectOption=3;
                break;

            case R.id.option4:
                selectOption=4;
                break;
            default:
        }
        countDown.cancel();
        checkAnswer(selectOption,view);
    }

    private void checkAnswer(int selectOption, View view)
    {
        if(selectOption == questionList.get(quesNum).getCorrectAns()) {
            //Right Answer
            ((Button)view).setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
            score++;
        }
        else {
            //Wrong Answer
            ((Button)view).setBackgroundTintList(ColorStateList.valueOf(Color.RED));
            switch (questionList.get(quesNum).getCorrectAns())
            {
                case 1:
                    option1.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
                case 2:
                    option2.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
                case 3:
                    option3.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
                case 4:
                    option4.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;

            }
        }
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                changeQuestion();
            }
        },2000);
    }

    private void changeQuestion()
    {
        if(quesNum < questionList.size() - 1)
        {
            quesNum++;

            playAnim(question,0,0);
            playAnim(option1,0,1);
            playAnim(option2,0,2);
            playAnim(option3,0,3);
            playAnim(option4,0,4);

            qCount.setText(String.valueOf(quesNum+1)+"/"+String.valueOf(questionList.size()));
            timer.setText(String.valueOf(10));
            startTimer();
        }
        else
        {
            Intent intent=new Intent(getApplicationContext(),scoreActivity.class);
            intent.putExtra("SCORE",String.valueOf(score)+"/"+String.valueOf(questionList.size()));
            startActivity(intent);
            Danger.this.finish();
        }
    }

    private void playAnim(View view ,final int value,int viewNum)
    {
        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500).setStartDelay(100)
                .setInterpolator(new DecelerateInterpolator())
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if(value==0)
                        {
                            switch (viewNum)
                            {
                                case 0:
                                    ((TextView)view).setText(questionList.get(quesNum).getQuestion());
                                    break;
                                case 1:
                                    ((Button)view).setText(questionList.get(quesNum).getOptionA());
                                    break;
                                case 2:
                                    ((Button)view).setText(questionList.get(quesNum).getOptionB());
                                    break;
                                case 3:
                                    ((Button)view).setText(questionList.get(quesNum).getOptionC());
                                    break;
                                case 4:
                                    ((Button)view).setText(questionList.get(quesNum).getOptionD());
                                    break;
                            }
                            if(viewNum !=0){
                                ((Button)view).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF6200EE")));
                            }
                            playAnim(view,1,viewNum);
                        }
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        countDown.cancel();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}