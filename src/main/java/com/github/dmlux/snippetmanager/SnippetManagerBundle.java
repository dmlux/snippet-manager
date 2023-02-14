package com.github.dmlux.snippetmanager;

import com.intellij.DynamicBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.PropertyKey;

import java.util.function.Supplier;

public final class SnippetManagerBundle extends DynamicBundle {
    @NotNull
    public static final SnippetManagerBundle INSTANCE = new SnippetManagerBundle();
    private static final String BUNDLE = "messages.SnippetManagerBundle";

    private SnippetManagerBundle() {
        super(BUNDLE);
    }

    @NotNull
    public static String message(
            @PropertyKey(resourceBundle = BUNDLE) @NotNull String key,
            @NotNull Object... params) {
        return INSTANCE.getMessage(key, params);
    }

    @NotNull
    public static Supplier<String> messagePointer(@PropertyKey(resourceBundle = BUNDLE) @NotNull String key,
                                                  @NotNull Object... params) {
        return INSTANCE.getLazyMessage(key, params);
    }
}

