package com.vocabularies.template.readers;

import com.rulesmith.vocabulary.states.StatePayload;

public class ExamplePayload implements StatePayload{
    private String eventType;
    

    public ExamplePayload(String eventType, Integer insertedCardIndex, String[] cardArray) {
        this.eventType = eventType;
    }

    // getters
    public String getEventType() {
        return this.eventType;
    }

    // setters
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}
