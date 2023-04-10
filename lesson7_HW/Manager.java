package lesson7_HW;

import java.util.Arrays;

public class Manager extends Employee{
    Employee [] team;
    final String lastName;
    protected Manager(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public Employee[] getTeam() {
        return team;
    }

    public void setTeam(Employee[] team) {
        this.team = team;
    }

    public void setTeamMembers(Employee ... members){
        this.team = members;
    }

    @Override
    public String getPosition() {
        return "Manager" + " and has a team of " + team.length + " members: " + Arrays.toString(team);
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }
    @Override
    public String getInfo(){
        return getName();
    }



}
