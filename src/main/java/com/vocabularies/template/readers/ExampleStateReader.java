package com.vocabularies.template.readers;

import org.json.JSONObject;

import com.rulesmith.vocabulary.annotations.IsStateReader;
import com.rulesmith.vocabulary.states.StateReader;

@IsStateReader
public class ExampleStateReader extends StateReader<ExampleState> {
    public ExampleStateReader(String readerConfig) {
        super(readerConfig);

        JSONObject config = getConfig();
    }

    @Override
    public void onClose() {
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            // TODO: implement state extraction logic
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // Restore the interrupted status
                Thread.currentThread().interrupt();
                System.out.println("InterruptException from  SmarterStateReader");
                break;
            }
        }
    }

}
