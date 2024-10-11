import java.util.Arrays;
import java.util.Scanner;

public class Course {
    private int cid,quiz,handson;
    private String cname, cadmin;

    public Course(int cid,String cname,String cadmin, int quiz, int handson){  //making a constructor over here
        this.cid=cid;
        this.cname=cname;
        this.cadmin=cadmin;
        this.quiz=quiz;
        this.handson=handson;
    }

    //Getter Methods
     public int getCid(){ return cid;}
     public String getCname(){return cname;}
     public String getCadmin(){return cadmin;}
     public int getQuiz(){return quiz;}
     public int getHandson(){return handson;}

     //Setter Methods (not strictly necessary for this task)
     public void setCid(int cid){this.cid = cid;}
     public void setCname(String cname){this.cname=cname;}
     public void setCadmin(String cadmin){this.cadmin=cadmin;}
     public void setQuiz(int quiz){this.quiz=quiz;}
     public void setHandson(int handson){this.handson=handson;}



public class CourseProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] course = new Course[4];


        //Inputting course details
        for(int i=0;i<4;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();
            course[i]=new Course(a,b,c,d,e);
        }

        String admin = sc.nextLine();  int h = sc.nextInt();


        int ans1 = findAvgOfQuizByAdmin(course,admin);
        if(ans1 !=0){
            System.out.println(ans1);
        }else{
            System.out.println("No course found");
        }

        Course[] ans2 = sortCourseByHandsOn(course,h);
        if(ans2 != null){
            for(int i=0;i< ans2.length;i++){
                System.out.println(ans2[i].getCname());
            }
        }else{
            System.out.println("No course found with mentioned attribute");
        }



    }


    public static int findAvgOfQuizByAdmin(Course[] course,int admin){
        int sum  = 0 , count = 0;
        for(int i=0;i<course.length;i++){
            if(course[i].getCadmin().equalsIgnoreCase(String.valueOf(admin))){
                sum+= course[i].getQuiz();
                count++;
            }
        }
        return (count>0) ? (sum/count):0;
    }



    public static Course[] sortCourseByHandsOn(Course[] course, int h){
        Course[] obj = new Course[0];
        for(int i=0;i<course.length;i++){
            if(course[i].getHandson()<h){
                obj = Arrays.copyOf(obj,obj.length+1);
                obj[obj.length - 1] = course[i];
            }
        }

        //Sorting the filtered courses by handson Value
        for(int i=0;i<obj.length;i++){
            for(int j=i+1;j<obj.length;j++){
                if(obj[i].getHandson()>obj[j].getHandson()){
                    Course temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;
                }
            }
        }
        return (obj.length>0) ? obj:null;
    }


}}
