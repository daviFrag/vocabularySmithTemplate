package com.vocabularies.template.readers;

import com.rulesmith.vocabulary.states.StatePayload;

public class ExamplePayload implements StatePayload{
    private String eventType;
    private int insertedCardIndex;
    private String[] cardArray;
    

    public ExamplePayload(String eventType, Integer insertedCardIndex, String[] cardArray) {
        this.eventType = eventType;
        this.insertedCardIndex = insertedCardIndex;
        this.cardArray = cardArray;
    }

    // getters
    public String getEventType() {
        return this.eventType;
    }

    public Integer getInsertedCardIndex() {
        return this.insertedCardIndex;
    }

    public String[] getCardArray() {
        return this.cardArray;
    }

    public String getCurrentCard() {
        return this.cardArray[this.insertedCardIndex];
    }

    // setters
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setInsertedCardIndex(Integer insertedCardIndex) {
        this.insertedCardIndex = insertedCardIndex;
    }

    public void setCardArray(String[] cardArray) {
        this.cardArray = cardArray;
    }
}
