package com.crystallang;

import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

public class CrystalFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(CrystalFileType.INSTANCE, "cr");
    }
}