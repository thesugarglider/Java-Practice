package com.sugarglider.generics.practice;

public class Main {
    public static void main(String[] args) {
        Affiliation phiilies = new Affiliation("Phil", "CA", "USA");
        Team<BaseBallPlayer, Affiliation> phillies = new Team<>("Philadelphia",phiilies );
        Team<BaseBallPlayer, Affiliation> astros = new Team<>("Astros",phiilies);

        BaseBallPlayer rishi = new BaseBallPlayer("Rishi", "Left Side");
        phillies.addTeamMembers(rishi);
        phillies.listTeamMembers();

        BaseBallPlayer sunak = new BaseBallPlayer("Sunak","Right Side");
        astros.addTeamMembers(sunak);
        astros.listTeamMembers();

        scoreResult(phillies, 2, astros , 3);

        Affiliation location = new Affiliation("Maharashtra", "MUM", "Bharat");
        Team<FootBallPlayer, Affiliation> washers = new Team<>("Washington",location);
        Team<FootBallPlayer, Affiliation> newbies = new Team<>("New York",location);

        FootBallPlayer sunil = new FootBallPlayer("Sunil", "Mid Position");
        FootBallPlayer gurung = new FootBallPlayer("Gurung", "Goal");
        washers.addTeamMembers(gurung);
        washers.addTeamMembers(sunil);
        washers.listTeamMembers();

        FootBallPlayer chettri = new FootBallPlayer("Chettri", "Goal Keeper");
        newbies.addTeamMembers(chettri);
        newbies.listTeamMembers();

        scoreResult(washers, 3, newbies, 5);
    }

    public static void scoreResult(Team team1 , int score1,  Team team2, int score2){
        String message = team1.setScore(score1,score2);
        team2.setScore(score2,score1);
        System.out.printf("%s %s %s %n", team1, message,team2);
    }
}
