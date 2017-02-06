package com.crystallang;

import com.intellij.lang.Language;

/**
 * Creates by  benoist, 06/02/2017
 */
public class CrystalLanguage extends Language {
    public static final CrystalLanguage INSTANCE = new CrystalLanguage();

    private CrystalLanguage() {
        super("Crystal");
    }
}
