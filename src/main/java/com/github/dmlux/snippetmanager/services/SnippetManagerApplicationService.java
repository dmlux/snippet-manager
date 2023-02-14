package com.github.dmlux.snippetmanager.services;

import com.github.dmlux.snippetmanager.SnippetManagerBundle;
import kotlin.NotImplementedError;

public final class SnippetManagerApplicationService {
    public SnippetManagerApplicationService() {
        System.out.println(SnippetManagerBundle.message("applicationService"));
        if (System.getenv("CI") == null) {
            throw new NotImplementedError("An operation is not implemented: Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.");
        }
    }
}
