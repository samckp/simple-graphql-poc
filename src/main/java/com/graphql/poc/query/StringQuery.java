package com.graphql.poc.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class StringQuery implements GraphQLQueryResolver {

    public String firstMethod(){

        return "This is first method !!";
    }
    public  String secondMethod(){
        return "Hundred : " + 100;
    }

    /*public String fullName(String fname, String lname){
        return fname +" " +lname;
    }*/

    public String fullName(SampleRequest sampleRequest){
        return sampleRequest.getFname() +" " +sampleRequest.getLname();
    }
}
