package com.crystallang;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import com.crystallang.psi.CrystalTypes;
import org.jetbrains.annotations.NotNull;

/**
 * Created by benoist, 06/02/2017
 */
public class CrystalCompletionContributor extends CompletionContributor {
    public CrystalCompletionContributor() {
        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(CrystalTypes.VALUE).withLanguage(CrystalLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("Hello"));
                    }
                }
        );
    }
}