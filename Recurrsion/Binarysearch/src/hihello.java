import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MyClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        List<Cricket> players = new ArrayList<>();

        for(int i=0;i<n;i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int run  = sc.nextInt();
            sc.nextLine();
            String playerType = sc.nextLine();
            String matchType = sc.nextLine();

            players.add(new Cricket(id,name,run,playerType,matchType));

        }

        String pType = sc.nextLine();
        String matchType = sc.nextLine();

        int lowestRun = lowestRunByPlayerType(players,pType);
        if(lowestRun==Integer.MAX_VALUE){
            System.out.println("No such Type of Player Type Exist");
        }else{
            System.out.println(lowestRun);
        }

        Cricket matchTypeIds[] = playerWithMatchTypeIdsinDecendingOrder(players,matchType);
        if(matchTypeIds==null){
            System.out.println("No Match Type match");
        }else{
            for(Cricket id: matchTypeIds){
                System.out.println(id.getId());
            }
        }

    }

    public static int lowestRunByPlayerType(List<Cricket> players, String playerType){
        int lowestRun = Integer.MAX_VALUE;
        for(Cricket p:players){
            if(p.getPlayerType().equalsIgnoreCase(playerType)){
                if(p.getRun()<lowestRun){
                    lowestRun = p.getRun();
                }
            }
            return lowestRun;
        }


        public static Cricket[] playerWithMatchTypeIdsinDecendingOrder(List<Cricket> players,String matchType){
            Cricket matchTypeIds[] = new Cricket[0];
            for(Cricket p:players){
                if(p.getMatchType().equalsIgnoreCase(matchType)){
                    matchTypeIds = Arrays.copyOf(matchTypeIds,matchTypeIds.length+1);
                    matchTypeIds[matchTypeIds.length-1]=p;
                }
            }

            Arrays.sort(matchTypeIds,Comparator.comparingInt(Cricket::getId).reversed());

            return matchTypeIds.length > 0 ? matchTypeIds:null;
        }


    }



}

class Cricket {
    private int id;
    private String name;
    private int run;
    private String playerType;
    private String matchType;

    public Cricket(int id,String name,int run,String playerType,String matchType){
        this.id = id;
        this.name = name;
        this.run = run;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getRun(){
        return run;
    }

    public String getPlayerType(){
        return playerType;

    }

    public String getMatchType(){
        return matchType;
    }
}