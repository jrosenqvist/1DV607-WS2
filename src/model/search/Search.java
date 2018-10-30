package model.search;

import java.util.ArrayList;

import model.Member;

public class Search {

    public ArrayList<Member> complexSearch(ArrayList<Member> members, SearchCriteriaComposite searchComposite) {
        for (SearchCriteria criteria : searchComposite.get()) {
            members = criteria.strategy.returnFiltered(members, criteria.parameter);
        }

        return members;
    }

//     public ArrayList<Member> simpleSearch(ArrayList<Member> members, SearchCriteria criteria) {
//         return  criteria.strategy.returnFiltered(members, criteria.parameter);
//     }
}