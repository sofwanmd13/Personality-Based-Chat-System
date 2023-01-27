import java.util.HashMap;
import java.util.Scanner;

public class PersonalityTest{
    public static HashMap<String, String> authentication;

    public static void main(String[] args) {

        int ans;
        int E=0;
        int A=0;
        int C=0;
        int N=0;
        int O=0;

        Scanner input = new Scanner(System.in);

        //Menu Options
        System.out.println("Please select desired action: ");
        System.out.println("Enter 1 to take personality test and create User");
        System.out.println("Enter 2 to Update login password");
        System.out.println("Enter 3 to QUIT");
        int action = input.nextInt();

        while(action!=3){

            if(action == 1){  //To create new user
                System.out.println("Here are a number of characteristics that may or may not apply to you. For example, do you agree that you are someone who likes to spend time with others? Please write a number next to each statement to indicate the extent to which you agree or disagree with that statement.");
                System.out.println("Disagree       Disagree       Neither Agree       Agree       Agree");
                System.out.println("strongly       a little       nor Disagree      a little    strongly");
                System.out.println("   1               2                 3              4           5   ");

                System.out.println("Do you find yourself talkative?"); //1
                ans = input.nextInt();
                E = E + ans;

                System.out.println("Do you tend to find fault with others?"); //2
                ans = input.nextInt();
                A = A + (6-ans);

                System.out.println("Do you do a thorough job?"); //3
                ans = input.nextInt();
                C = C + (ans);

                System.out.println("Are you deressed, blue?"); //4
                ans = input.nextInt();
                N = N + (ans);

                System.out.println("Are you original? Do you find yourself coming up with new ideas?"); //5
                ans = input.nextInt();
                O = O + (ans);

                System.out.println("Are you reserved?"); //6
                ans = input.nextInt();
                E = E + (6-ans);

                System.out.println("Are you helpful and unselfish with others?"); //7
                ans = input.nextInt();
                A = A + (ans);

                System.out.println("Can you be somewhat careless?");
                ans = input.nextInt();
                C = C + (6-ans);

                System.out.println("Are you relaxed? Can you handle stress well?"); //9
                ans = input.nextInt();
                N = N + (6-ans);

                System.out.println( "Are you curious about many different things?"); //10
                ans = input.nextInt();
                O = O + (ans);

                System.out.println( "Are you full of energy?"); //11
                ans = input.nextInt();
                E = E + ans;

                System.out.println( "Do you start quarrels with others?"); //12
                ans = input.nextInt();
                A = A + (6-ans);

                System.out.println( "Are you a reliable worker?"); //13
                ans = input.nextInt();
                C = C + (ans);

                System.out.println( "Can you be tense?"); //14
                ans = input.nextInt();
                N = N + (ans);

                System.out.println( "Are you ingenious, a deep thinker?"); //15
                ans = input.nextInt();
                O = O + (ans);

                System.out.println( "Can you generate a lot of enthusiam?"); //16
                ans = input.nextInt();
                E = E + ans;

                System.out.println( "Do you have a forgiving nature?"); //17
                ans = input.nextInt();
                A = A + (ans);

                System.out.println( "Do you tend to be disorganized?"); //18
                ans = input.nextInt();
                C = C + (6-ans);

                System.out.println( "Do you worry a lot?"); //19
                ans = input.nextInt();
                N = N + (ans);

                System.out.println( "Do you have an active imagination?"); //20
                ans = input.nextInt();
                O = O + (ans);

                System.out.println( "Do you tend to be quiet?"); //21
                ans = input.nextInt();
                E = E + (6-ans);

                System.out.println( "Are you generally trusting?"); //22
                ans = input.nextInt();
                A = A + (ans);

                System.out.println( "Do you tend to be lazy?"); //23
                ans = input.nextInt();
                C = C + (6-ans);

                System.out.println( "Are you emotionally stable, not get upset easily?"); //24
                ans = input.nextInt();
                N = N + (6-ans);

                System.out.println( "Are you inventive?"); //25
                ans = input.nextInt();
                O = O + (ans);

                System.out.println( "Do you have an assertive personality?"); //26
                ans = input.nextInt();
                E = E + ans;

                System.out.println( "Can you be cold and aloof?"); //27
                ans = input.nextInt();
                A = A + (6-ans);

                System.out.println( "Do you persevere until a task is finished?"); //28
                ans = input.nextInt();
                C = C + (ans);

                System.out.println( "Can you be moody?"); //29
                ans = input.nextInt();
                N = N + (ans);

                System.out.println( "Do you value artistic, aesthetic experiences?"); //30
                ans = input.nextInt();
                O = O + (ans);

                System.out.println( "Are you at times shy or inhibited?"); //31
                ans = input.nextInt();
                E = E + (6-ans);

                System.out.println( "Are you considerate and kind to almost everyone?"); //32
                ans = input.nextInt();
                A = A + (ans);

                System.out.println( "Do you do things efficiently?"); //33
                ans = input.nextInt();
                C = C + (ans);

                System.out.println( "Do you remain calm in tense situations?"); //34
                ans = input.nextInt();
                N = N + (6-ans);

                System.out.println( "Do you prefer work that is routine?"); //35
                ans = input.nextInt();
                O = O + (6-ans);

                System.out.println( "Are you outgoing and sociable?"); //36
                ans = input.nextInt();
                E = E + ans;

                System.out.println( "Are you sometimes rude to others?"); //37
                ans = input.nextInt();
                A = A + (6-ans);

                System.out.println( "Do you make plans and follow through with them?"); //38
                ans = input.nextInt();
                C = C + (ans);

                System.out.println( "Do you get nervous easily?"); //39
                ans = input.nextInt();
                N = N + (ans);

                System.out.println( "Do you like to reflect and play with ideas?"); //40
                ans = input.nextInt();
                O = O + (ans);

                System.out.println( "Do you have a few artistic interests?"); //41
                ans = input.nextInt();
                O = O + (6-ans);

                System.out.println( "Do you like to cooperate with others?"); //42
                ans = input.nextInt();
                A = A + (ans);

                System.out.println( "Are you easily distracted?"); //43
                ans = input.nextInt();
                C = C + (6-ans);

                System.out.println( "Are you sophisticated in art, music, or literature?"); //44
                ans = input.nextInt();
                O = O + (ans);

                System.out.println("Your score in Extraversion is " + E);
                System.out.println("Your score in Agreeableness is " + A);
                System.out.println("Your score in Conscientiousness is " + C);
                System.out.println("Your score in Neuroticism is " + N);
                System.out.println("Your score in Openness is " + O);

                System.out.println("Please enter your new username:");
                String username = input.next();

                System.out.println("Please enter your new password:");
                String password = input.next();

                int min = Math.min(Math.min(Math.min(Math.min(E,A),C),N),O);

                if(E==A && A==C && C==N && N==O){
                    ALLFIVE User = new ALLFIVE(username, E, A, C, N, O);
                    User.createUser(username, E, A, C, N, O);
                    User.addlogin(username, password);
                    User.setPort(username, 8001);
                    System.out.println("Your port Number is 8001. Please save this. You will not be able to access chat without this!");
                }
                if(min==O){
                    EACN User = new EACN(username, E, A, C, N, O);
                    User.createUser(username, E, A, C, N, O);
                    User.addlogin(username, password);
                    User.setPort(username, 8002);
                    System.out.println("Your port Number is 8002. Please save this. You will not be able to access chat without this!");
                }
                else if(min==N){
                    EACO User = new EACO(username, E, A, C, N, O);
                    User.createUser(username, E, A, C, N, O);
                    User.addlogin(username, password);
                    User.setPort(username, 8003);
                    System.out.println("Your port Number is 8003. Please save this. You will not be able to access chat without this!");
                }
                else if(min==C){
                    EANO User = new EANO(username, E, A, C, N, O);
                    User.createUser(username, E, A, C, N, O);
                    User.addlogin(username, password);
                    User.setPort(username, 8004);
                    System.out.println("Your port Number is 8004. Please save this. You will not be able to access chat without this!");
                }
                else if(min==A){
                    ECNO User = new ECNO(username, E, A, C, N, O);
                    User.createUser(username, E, A, C, N, O);
                    User.addlogin(username, password);
                    User.setPort(username, 8005);
                    System.out.println("Your port Number is 8005. Please save this. You will not be able to access chat without this!");
                }
                else{
                    ACNO User = new ACNO(username, E, A, C, N, O);
                    User.createUser(username, E, A, C, N, O);
                    User.addlogin(username, password);
                    User.setPort(username, 8006);
                    System.out.println("Your port Number is 8006. Please save this. You will not be able to access chat without this!");
                }
            }

            else if (action == 2){ // To update login password
                System.out.println("Please enter your username:");
                String username = input.next();

                System.out.println("Please enter your old password:");
                String oldpassword = input.next();

                System.out.println("Please enter your new password:");
                String newpassword = input.next();

                User.login.remove(username, oldpassword);
                User.login.put(username, newpassword);
            }

            //Menu Options
            System.out.println("Please select desired action: ");
            System.out.println("Enter 1 to Create User");
            System.out.println("Enter 2 to Update login password");
            System.out.println("Enter 3 to QUIT");
            action = input.nextInt();
        }

    }

}