package com.crystallang.psi;

import com.intellij.psi.tree.IElementType;
import com.crystallang.CrystalLanguage;
import org.jetbrains.annotations.*;

/**
 * Creates by  benoist, 06/02/2017
 */

public class CrystalElementType extends IElementType {
    public CrystalElementType(@NotNull @NonNls String debugName) {
        super(debugName, CrystalLanguage.INSTANCE);
    }
}