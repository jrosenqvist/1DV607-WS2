package model.search;

import model.Member;
import java.util.ArrayList;
import java.util.Calendar;

class IsBelowAge implements ISearchStrategy {

    public ArrayList<Member> returnFiltered(ArrayList<Member> members, String searchParameter) {
        ArrayList<Member> membersFiltered = new ArrayList<Member>();
        Calendar cal = Calendar.getInstance();
       
        for(Member member : members) {
            int memberBirthYear = Integer.parseInt(member.getPNr().substring(0, 4));
            int currentYear = cal.get(Calendar.YEAR);
            String memberAge = "" + (currentYear - memberBirthYear);
            if(memberAge.compareTo(searchParameter) == -1) {
                membersFiltered.add(member);
            }
        }
                
        return membersFiltered;
    }
}