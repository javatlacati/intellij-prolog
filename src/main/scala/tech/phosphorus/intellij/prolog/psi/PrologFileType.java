package tech.phosphorus.intellij.prolog.psi;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tech.phosphorus.intellij.prolog.PrologLanguage;

import javax.swing.*;

public class PrologFileType extends LanguageFileType {

    public static final PrologFileType INSTANCE = new PrologFileType();

    protected PrologFileType() {
        super(PrologLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Prolog file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Prolog language source file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "pl";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return null;
    }
}