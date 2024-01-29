package com.vocabularies.template.blocks;

import com.rulesmith.vocabulary.annotations.InputMetadata;
import com.rulesmith.vocabulary.annotations.IsBlock;
import com.rulesmith.vocabulary.blocks.Scope;
import com.rulesmith.vocabulary.blocks.StateBlock;
import com.rulesmith.vocabulary.exceptions.InputMetadataNotFoundException;
import com.rulesmith.vocabulary.exceptions.InvalidParamsBlockException;
import com.rulesmith.vocabulary.metadata.InputBlockMetadata;
import com.rulesmith.vocabulary.states.State;
import com.vocabularies.template.readers.ExamplePayload;
import com.vocabularies.template.readers.ExampleStateReader;

@IsBlock
public class ExampleBlock extends StateBlock<ExampleStateReader> {

    @InputMetadata
    public static InputBlockMetadata inputMetadataMethod() {
        InputBlockMetadata meta = new InputBlockMetadata("this is an example block");
        
        meta.setScope(Scope.WHILE.toString());
        meta.setType(getType());

        return meta;
    }

    public ExampleBlock(Object[] args, ExampleStateReader stateReader) throws InvalidParamsBlockException, InputMetadataNotFoundException {
        super(args, stateReader);
    }

    public boolean fire() {
        State<ExamplePayload> s = stateReader.getState();

        if (s == null) {
            return false;
        }

        return true;
    }
}
