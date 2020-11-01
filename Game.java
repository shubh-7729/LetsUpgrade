public class Game {

    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"Who is the richest Avenger in MCU??","Who is best captain, finisher and wicket-keeper in world ?","What is the capital of maharashtra?","Which Team win IPL for 4 times?"};
    String[] options1={"Tchalla","MSD","Pune","CSK"};
    String[] options2={"Thor","Rohit sharma","Nagpur","MI"};
    String[] options3={"Ironman","VK","Mumbai","RCB"};
    String[] options4={"Steve rogers","ABD","Satara","KKR"};
    int[] answers={2,3,4};



    public void initG()
    {
        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }

        for(int i=0;i<3;i++)
        {

        questions[i].question=questionsdata[i];
        questions[i].option1=options1[i];
        questions[i].option2=options2[i];
        questions[i].option3=options3[i];
        questions[i].option4=options4[i];
        questions[i].correctAnswer=answers[i];
        }


    }
    public void play1()
    {

          player.getDetails();
          for(int i=0;i<3;i++)
          {
              boolean status=questions[i].askQuestion();
              if(status==true)
              {
                  System.out.println("Well Done!!");
                  player.score=player.score+5;
              }
              else{
                  System.out.println("Sorry Wrong answer");
                  player.score=player.score-5;
              }
          }

        System.out.println(player.name+" your score is "+player.score);

    }

}