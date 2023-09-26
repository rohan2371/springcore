package com.springcore.standalone;

import java.util.List;
import java.util.Map;

public class Person {
    private List<String>friends;

    public Map<String, Integer> getFeestructure() {
        return feestructure;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", feestructure=" + feestructure +
                '}';
    }

    public void setFeestructure(Map<String, Integer> feestructure) {
        this.feestructure = feestructure;
    }

    private Map<String,Integer> feestructure;
    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

}
