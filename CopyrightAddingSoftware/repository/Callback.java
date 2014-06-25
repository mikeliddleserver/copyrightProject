package com.mycila.maven.plugin.license;

import com.mycila.maven.plugin.license.document.Document;
import com.mycila.maven.plugin.license.header.Header;

public interface Callback {
    void onHeaderNotFound(Document document, Header header);

    void onExistingHeader(Document document, Header header);
}
