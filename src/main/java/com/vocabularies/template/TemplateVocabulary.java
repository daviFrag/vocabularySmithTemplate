package com.vocabularies.template;

import com.rulesmith.vocabulary.Vocabulary;
import com.rulesmith.vocabulary.exceptions.PackageNotFoundException;
import com.rulesmith.vocabulary.exceptions.StateReaderInitializationException;


public class TemplateVocabulary extends Vocabulary {

    public TemplateVocabulary(String readerConfig) throws PackageNotFoundException, StateReaderInitializationException{
        super(readerConfig);
    }

    @Override
    public void onInitCallback() {
        // comment
    }

    @Override
    public void onStartCallback() {
        logger.info("Vocabulary started. TID {}", Thread.currentThread().getId());
    }

    @Override
    public void onCloseCallback() {
        logger.info("Vocabulary closed. TID {}", Thread.currentThread().getId());
    }

}