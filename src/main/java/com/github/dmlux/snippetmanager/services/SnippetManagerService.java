package com.github.dmlux.snippetmanager.services;

import com.github.dmlux.snippetmanager.SnippetManagerBundle;
import com.intellij.openapi.project.Project;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;


public final class SnippetManagerService {
    private final Project project;

    public SnippetManagerService(@NotNull Project project) {
        this.project = project;
        System.out.println(SnippetManagerBundle.message("projectService", project.getName()));
        if (System.getenv("CI") == null) {
            throw new NotImplementedError("An operation is not implemented: Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.");
        }
    }

    public final int getRandomNumber() {
        return 4;
    }
}
