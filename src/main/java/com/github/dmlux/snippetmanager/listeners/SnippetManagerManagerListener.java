package com.github.dmlux.snippetmanager.listeners;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManagerListener;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

public final class SnippetManagerManagerListener implements ProjectManagerListener {
    public void projectOpened(@NotNull Project project) {
        if (System.getenv("CI") == null) {
            throw new NotImplementedError("An operation is not implemented: Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.");
        }
    }
}
